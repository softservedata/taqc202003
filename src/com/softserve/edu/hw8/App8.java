package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App8 {
	public static final String MESSAGE_ERROR = "Message %s";

	public static void main(String[] args) {
		// String pattern = "\"[^,]+\"";
		String pattern = "\"([^\"]+)\":\"?([^\",}]+)\"?";
		//String text = "{\"key1\":\"value1\",\"key2\":\"value2\"}";
		String text = "{\"key1\":\"value1\",\"id\":123456789}";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		if (m.matches()) {
			System.out.println("m.matches() is true");
		}
		m.reset();
		// System.out.println("ORIGINAL TEXT: " + text);
		String result = "";
		String key = "";
		String value = "";
		Map<String,String> map = new HashMap<String,String>();
		while (m.find()) {
			key = text.substring(m.start(1), m.end(1));
			value = text.substring(m.start(2), m.end(2));
			result = text.substring(m.start(), m.end());
			map.put(key, value);
			// System.out.print(result + "*");
			System.out.println("key = " + key);
			System.out.println("value = " + value);
			System.out.println("result = " + result);
		}
		//
		System.out.println("map = " + map);
	}
}
