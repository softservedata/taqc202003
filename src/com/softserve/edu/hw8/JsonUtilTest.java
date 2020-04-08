package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JsonUtilTest {
	private static JsonUtil jsonUtil;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
		jsonUtil = new JsonUtil();
	}

	@Test
	public void checkSingleJson() {
		String jsonText = "{\"key1\":\"value1\"}";
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("key1", "value1");
		Map<String, String> actual = jsonUtil.gatAsMap(jsonText);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkTwoJson() {
		String jsonText = "{\"key1\":\"value1\", \"key2\":\"value2\"}";
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("key1", "value1");
		expected.put("key2", "value2");
		Map<String, String> actual = jsonUtil.gatAsMap(jsonText);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkIntJson() {
		String jsonText = "{\"key3\":123456789}";
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("key3", "123456789");
		Map<String, String> actual = jsonUtil.gatAsMap(jsonText);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkIntAndStrJson() {
		String jsonText = "{\"key1\":\"value1\",\"id\":123456789}";
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("key1", "value1");
		expected.put("id", "123456789");
		Map<String, String> actual = jsonUtil.gatAsMap(jsonText);
		Assert.assertEquals(expected, actual);
	}
}
