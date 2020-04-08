package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParse {
	private final String JSON_PARSING = "\"([^\"]+)\": \"?([^\",}]+)\"?";
	
	public Map<String,String> getMap(String json) {
		
		Map<String,String> map = new HashMap<String,String>();
		Pattern pattern = Pattern.compile(JSON_PARSING);
		Matcher matcher = pattern.matcher(json);
//		map.put(matcher.group(1), matcher.group(2));
		while (matcher.find()) {
		map.put(json.substring(matcher.start(1), matcher.end(1)), 
				json.substring(matcher.start(2), matcher.end(2)));
		
	}
		return map;
	}
}
