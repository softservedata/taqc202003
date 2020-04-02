package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PageParser {
    private String parser;

    public PageParser() {

    }

    public static Map<String, String> parser(String json) {
        String value = "([a-zA-Z]{8,}\\b)";
        String key = "[0-9]+\\b";
        String[] split = json.split("[}]");
        String keyString = "";
        String valueString = "";

        Map<String, String> mapResult = new HashMap<>();
        for (String s2 : split) {

            Pattern patternValue = Pattern.compile(value);
            Pattern pattenKey = Pattern.compile(key);
            Matcher matcherValue = patternValue.matcher(s2);
            Matcher matcherKey = pattenKey.matcher(s2);
            while (matcherKey.find() && matcherValue.find()) {

                keyString = s2.substring(matcherKey.start(), matcherKey.end()).trim();
                valueString = s2.substring(matcherValue.start(), matcherValue.end()).trim();
            }
            mapResult.put(keyString, valueString);
        }
        return mapResult;
    }


}
