/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.increment;

import com.liferay.portal.internal.increment.BufferedIncreasableEntry;
import com.liferay.portal.internal.increment.BufferedIncrementProcessor;
import com.liferay.portal.internal.increment.BufferedIncrementProcessorUtil;
import com.liferay.portal.kernel.cache.key.CacheKeyGenerator;
import com.liferay.portal.kernel.cache.key.CacheKeyGeneratorUtil;
import com.liferay.portal.kernel.increment.BufferedIncrement;
import com.liferay.portal.kernel.increment.Increment;
import com.liferay.portal.kernel.increment.IncrementFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.transaction.TransactionCommitCallbackUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.aop.AnnotationChainableMethodAdvice;
import com.liferay.portal.spring.aop.MethodContextHelper;
import com.liferay.portal.spring.aop.ServiceBeanMethodInvocation;

import java.io.Serializable;

import java.lang.reflect.Method;

/**
 * @author     Zsolt Berentey
 * @author     Shuyang Zhou
 */
public class BufferedIncrementAdvice extends AnnotationChainableMethodAdvice {

	public BufferedIncrementAdvice() {
		super(BufferedIncrement.class);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Object before(
		ServiceBeanMethodInvocation serviceBeanMethodInvocation) {

		BufferedIncrementContext bufferedIncrementContext =
			serviceBeanMethodInvocation.getCurrentAdviceMethodContext();

		BufferedIncrementProcessor bufferedIncrementProcessor =
			bufferedIncrementContext._bufferedIncrementProcessor;
		Class<? extends Increment<?>> incrementClass =
			bufferedIncrementContext._incrementClass;

		Object[] arguments = serviceBeanMethodInvocation.getArguments();

		Object value = arguments[arguments.length - 1];

		CacheKeyGenerator cacheKeyGenerator =
			CacheKeyGeneratorUtil.getCacheKeyGenerator(
				BufferedIncrementAdvice.class.getName());

		for (int i = 0; i < arguments.length - 1; i++) {
			cacheKeyGenerator.append(StringUtil.toHexString(arguments[i]));
		}

		Serializable batchKey = cacheKeyGenerator.finish();

		try {
			Increment<?> increment = IncrementFactory.createIncrement(
				incrementClass, value);

			BufferedIncreasableEntry bufferedIncreasableEntry =
				new BufferedIncreasableEntry(
					serviceBeanMethodInvocation, batchKey, increment);

			TransactionCommitCallbackUtil.registerCallback(
				() -> {
					bufferedIncrementProcessor.process(
						bufferedIncreasableEntry);

					return null;
				});
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Unable to increment", e);
			}
		}

		return nullResult;
	}

	@Override
	public Object createMethodContext(
		Class<?> targetClass, Method method,
		MethodContextHelper methodContextHelper) {

		BufferedIncrement bufferedIncrement =
			methodContextHelper.findAnnotation(BufferedIncrement.class);

		if (bufferedIncrement == null) {
			return null;
		}

		BufferedIncrementProcessor bufferedIncrementProcessor =
			BufferedIncrementProcessorUtil.getBufferedIncrementProcessor(
				bufferedIncrement.configuration());

		if (bufferedIncrementProcessor == null) {
			return null;
		}

		return new BufferedIncrementContext(
			bufferedIncrementProcessor, bufferedIncrement.incrementClass());
	}

	private static final Log _log = LogFactoryUtil.getLog(
		BufferedIncrementAdvice.class);

	private static class BufferedIncrementContext {

		private BufferedIncrementContext(
			BufferedIncrementProcessor bufferedIncrementProcessor,
			Class<? extends Increment<?>> incrementClass) {

			_bufferedIncrementProcessor = bufferedIncrementProcessor;
			_incrementClass = incrementClass;
		}

		private final BufferedIncrementProcessor _bufferedIncrementProcessor;
		private final Class<? extends Increment<?>> _incrementClass;

	}

}