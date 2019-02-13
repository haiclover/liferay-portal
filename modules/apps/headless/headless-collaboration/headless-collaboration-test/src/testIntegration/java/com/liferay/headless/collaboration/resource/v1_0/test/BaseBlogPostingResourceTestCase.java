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

package com.liferay.headless.collaboration.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.collaboration.dto.v1_0.BlogPosting;
import com.liferay.portal.vulcan.pagination.Pagination;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSender;

import java.net.URL;

import javax.annotation.Generated;

import org.jboss.arquillian.test.api.ArquillianResource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseBlogPostingResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

	@Before
	public void setUp() throws Exception {
		_resourceURL = new URL(
			_url.toExternalForm() + "/o/headless-collaboration/v1.0");
	}

	@Test
	public void testDeleteBlogPosting() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetBlogPosting() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetBlogPostingCategoriesPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetContentSpaceBlogPostingPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostBlogPostingCategories() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostBlogPostingCategoriesBatchCreate() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostContentSpaceBlogPosting() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostContentSpaceBlogPostingBatchCreate() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPutBlogPosting() throws Exception {
		Assert.assertTrue(true);
	}

	protected void invokeDeleteBlogPosting(Long blogPostingId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/blog-postings/{blog-posting-id}");
	}

	protected void invokeGetBlogPosting(Long blogPostingId) throws Exception {
		RequestSender requestSender = _createRequestSender();

			requestSender.post("/blog-postings/{blog-posting-id}");
	}

	protected void invokeGetBlogPostingCategoriesPage(
			Long blogPostingId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/blog-postings/{blog-posting-id}/categories");
	}

	protected void invokeGetContentSpaceBlogPostingPage(
			Long contentSpaceId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/blog-postings");
	}

	protected void invokePostBlogPostingCategories(
			Long blogPostingId, Long referenceId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/blog-postings/{blog-posting-id}/categories");
	}

	protected void invokePostBlogPostingCategoriesBatchCreate(
			Long blogPostingId, Long referenceId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/blog-postings/{blog-posting-id}/categories/batch-create");
	}

	protected void invokePostContentSpaceBlogPosting(
			Long contentSpaceId, BlogPosting blogPosting)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/blog-postings");
	}

	protected void invokePostContentSpaceBlogPostingBatchCreate(
			Long contentSpaceId, BlogPosting blogPosting)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/blog-postings/batch-create");
	}

	protected void invokePutBlogPosting(
			Long blogPostingId, BlogPosting blogPosting)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/blog-postings/{blog-posting-id}");
	}

	private RequestSender _createRequestSender() {
		return RestAssured.given(
		).auth(
		).preemptive(
		).basic(
			"test@liferay.com", "test"
		).header(
			"Accept", "application/json"
		).header(
			"Content-Type", "application/json"
		).when();
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

	@ArquillianResource
	private URL _url;

}