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

package com.liferay.jenkins.results.parser.spira;

import com.liferay.jenkins.results.parser.JenkinsResultsParserUtil.HttpRequestMethod;

import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author Michael Hashimoto
 */
public class SpiraTestCaseObject extends PathSpiraArtifact {

	public static SpiraTestCaseObject createSpiraTestCase(
		SpiraProject spiraProject, String testCaseName) {

		return createSpiraTestCase(spiraProject, testCaseName, null);
	}

	public static SpiraTestCaseObject createSpiraTestCase(
		SpiraProject spiraProject, String testCaseName,
		Integer parentTestCaseFolderID) {

		String testCasePath = "/" + testCaseName;

		if (parentTestCaseFolderID != null) {
			SpiraTestCaseFolder parentSpiraTestCaseFolder =
				spiraProject.getSpiraTestCaseFolderByID(parentTestCaseFolderID);

			testCasePath =
				parentSpiraTestCaseFolder.getPath() + "/" + testCaseName;
		}

		List<SpiraTestCaseObject> spiraTestCases =
			spiraProject.getSpiraTestCasesByPath(testCasePath);

		if (!spiraTestCases.isEmpty()) {
			return spiraTestCases.get(0);
		}

		String urlPath = "projects/{project_id}/test-cases";

		Map<String, String> urlPathReplacements = new HashMap<>();

		urlPathReplacements.put(
			"project_id", String.valueOf(spiraProject.getID()));

		JSONObject requestJSONObject = new JSONObject();

		requestJSONObject.put(
			"Name", StringEscapeUtils.unescapeJava(testCaseName));
		requestJSONObject.put("TestCaseFolderId", parentTestCaseFolderID);
		requestJSONObject.put("TestCaseStatusId", STATUS_DRAFT);

		try {
			JSONObject responseJSONObject = SpiraRestAPIUtil.requestJSONObject(
				urlPath, null, urlPathReplacements, HttpRequestMethod.POST,
				requestJSONObject.toString());

			SpiraTestCaseObject spiraTestCase =
				spiraProject.getSpiraTestCaseByID(
					responseJSONObject.getInt(ID_KEY));

			_spiraTestCases.put(
				_createSpiraTestCaseKey(
					spiraProject.getID(), spiraTestCase.getID()),
				spiraTestCase);

			return spiraTestCase;
		}
		catch (IOException ioException) {
			throw new RuntimeException(ioException);
		}
	}

	public static SpiraTestCaseObject createSpiraTestCaseByPath(
		SpiraProject spiraProject, String testCasePath) {

		List<SpiraTestCaseObject> spiraTestCases =
			spiraProject.getSpiraTestCasesByPath(testCasePath);

		if (!spiraTestCases.isEmpty()) {
			return spiraTestCases.get(0);
		}

		String testCaseName = getPathName(testCasePath);
		String parentTestCaseFolderPath = getParentPath(testCasePath);

		if (parentTestCaseFolderPath.isEmpty()) {
			return createSpiraTestCase(spiraProject, testCaseName);
		}

		SpiraTestCaseFolder parentSpiraTestCaseFolder =
			SpiraTestCaseFolder.createSpiraTestCaseFolderByPath(
				spiraProject, parentTestCaseFolderPath);

		return createSpiraTestCase(
			spiraProject, testCaseName, parentSpiraTestCaseFolder.getID());
	}

	public static void deleteSpiraTestCaseByID(
		SpiraProject spiraProject, int testCaseID) {

		Map<String, String> urlPathReplacements = new HashMap<>();

		urlPathReplacements.put(
			"project_id", String.valueOf(spiraProject.getID()));
		urlPathReplacements.put("test_case_id", String.valueOf(testCaseID));

		try {
			SpiraRestAPIUtil.request(
				"projects/{project_id}/test-cases/{test_case_id}", null,
				urlPathReplacements, HttpRequestMethod.DELETE, null);
		}
		catch (IOException ioException) {
			throw new RuntimeException(ioException);
		}

		_spiraTestCases.remove(
			_createSpiraTestCaseKey(spiraProject.getID(), testCaseID));
	}

	public static void deleteSpiraTestCasesByPath(
		SpiraProject spiraProject, String testCasePath) {

		List<SpiraTestCaseObject> spiraTestCases =
			spiraProject.getSpiraTestCasesByPath(testCasePath);

		for (SpiraTestCaseObject spiraTestCase : spiraTestCases) {
			deleteSpiraTestCaseByID(spiraProject, spiraTestCase.getID());
		}
	}

	public SpiraTestCaseFolder getParentSpiraTestCaseFolder() {
		if (_parentSpiraTestCaseFolder != null) {
			return _parentSpiraTestCaseFolder;
		}

		Object testCaseFolderID = jsonObject.get(SpiraTestCaseFolder.ID_KEY);

		if (testCaseFolderID == JSONObject.NULL) {
			return null;
		}

		if (!(testCaseFolderID instanceof Integer)) {
			return null;
		}

		SpiraProject spiraProject = getSpiraProject();

		_parentSpiraTestCaseFolder = spiraProject.getSpiraTestCaseFolderByID(
			(Integer)testCaseFolderID);

		return _parentSpiraTestCaseFolder;
	}

	public List<SpiraTestCaseRun> getSpiraTestCaseRuns() {
		return SpiraTestCaseRun.getSpiraTestCaseRuns(getSpiraProject(), this);
	}

	protected static List<SpiraTestCaseObject> getSpiraTestCases(
		SpiraProject spiraProject,
		SearchResult.SearchParameter... searchParameters) {

		List<SpiraTestCaseObject> spiraTestCases = new ArrayList<>();

		if (isPreviousSearch(SpiraTestCaseObject.class, searchParameters)) {
			for (SpiraTestCaseObject spiraTestCase : _spiraTestCases.values()) {
				if (spiraTestCase.matches(searchParameters)) {
					spiraTestCases.add(spiraTestCase);
				}
			}

			if (!spiraTestCases.isEmpty()) {
				return spiraTestCases;
			}
		}

		Map<String, String> urlPathReplacements = new HashMap<>();

		urlPathReplacements.put(
			"project_id", String.valueOf(spiraProject.getID()));

		Map<String, String> urlParameters = new HashMap<>();

		urlParameters.put("number_of_rows", String.valueOf(15000));
		urlParameters.put("starting_row", String.valueOf(1));

		JSONArray requestJSONArray = new JSONArray();

		for (SearchResult.SearchParameter searchParameter : searchParameters) {
			requestJSONArray.put(searchParameter.toFilterJSONObject());
		}

		try {
			JSONArray responseJSONArray = SpiraRestAPIUtil.requestJSONArray(
				"projects/{project_id}/test-cases/search", urlParameters,
				urlPathReplacements, HttpRequestMethod.POST,
				requestJSONArray.toString());

			for (int i = 0; i < responseJSONArray.length(); i++) {
				SpiraTestCaseObject spiraTestCase = new SpiraTestCaseObject(
					responseJSONArray.getJSONObject(i));

				_spiraTestCases.put(
					_createSpiraTestCaseKey(
						spiraProject.getID(), spiraTestCase.getID()),
					spiraTestCase);

				if (spiraTestCase.matches(searchParameters)) {
					spiraTestCases.add(spiraTestCase);
				}
			}

			addPreviousSearchParameters(
				SpiraTestCaseObject.class, searchParameters);

			return spiraTestCases;
		}
		catch (IOException ioException) {
			throw new RuntimeException(ioException);
		}
	}

	@Override
	protected PathSpiraArtifact getParentSpiraArtifact() {
		return getParentSpiraTestCaseFolder();
	}

	protected static final String ID_KEY = "TestCaseId";

	protected static final int STATUS_APPROVED = 4;

	protected static final int STATUS_DRAFT = 1;

	protected static final int STATUS_OBSOLETE = 9;

	protected static final int STATUS_READY_FOR_REVIEW = 2;

	protected static final int STATUS_READY_FOR_TEST = 5;

	protected static final int STATUS_REJECTED = 3;

	protected static final int STATUS_TESTED = 7;

	protected static final int STATUS_VERIFIED = 8;

	private static String _createSpiraTestCaseKey(
		Integer projectID, Integer testCaseID) {

		return projectID + "-" + testCaseID;
	}

	private SpiraTestCaseObject(JSONObject jsonObject) {
		super(jsonObject);
	}

	private static final Map<String, SpiraTestCaseObject> _spiraTestCases =
		new HashMap<>();

	private SpiraTestCaseFolder _parentSpiraTestCaseFolder;

}