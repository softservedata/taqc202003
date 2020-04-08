package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;

public class JsonParseTest {
	private static JsonParse jsonparse;

	@BeforeClass
	public static void beforeclass() {
		jsonparse = new JsonParse();
	}

	@Test
	public void testSingleJsonPair() {
		String json = "\"node_id\": \"MDEwOlJlcG9zaXRvcnkxMjE5MTI0NA==\""; 
		Map<String,String>expected = new HashMap<String,String>();
		expected.put("node_id", "MDEwOlJlcG9zaXRvcnkxMjE5MTI0NA==");
		Map<String,String>actual = jsonparse.getMap(json);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testStringIntJsonPair() {
		String json = "\"open_issues_count\": 145,"; 
		Map<String,String>expected = new HashMap<String,String>();
		expected.put("open_issues_count", "145");
		Map<String,String>actual = jsonparse.getMap(json);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testTwoJsonPair() {
		String json = "\"has_projects\": false,\"has_downloads\": true"; 
		Map<String,String>expected = new HashMap<String,String>();
		expected.put("has_projects", "false");
		expected.put("has_downloads", "true");
		Map<String,String>actual = jsonparse.getMap(json);
		Assert.assertEquals(expected, actual);
	}

}
