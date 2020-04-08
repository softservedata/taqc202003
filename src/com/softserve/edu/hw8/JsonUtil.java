package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonUtil {
	private final String JSON_SIMPLE_PARSE = "\"([^\"]+)\":\"?([^\",}]+)\"?";

	public Map<String, String> gatAsMap(String jsonText) {
		Map<String,String> resultMap = new HashMap<String,String>();
		Pattern p = Pattern.compile(JSON_SIMPLE_PARSE);
		Matcher m = p.matcher(jsonText);
		while (m.find()) {
			resultMap.put(jsonText.substring(m.start(1), m.end(1)),
					jsonText.substring(m.start(2), m.end(2)));
		}
		return resultMap;
	}
}
