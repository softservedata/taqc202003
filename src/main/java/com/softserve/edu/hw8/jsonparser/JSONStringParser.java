package com.softserve.edu.hw8.jsonparser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSONStringParser {

    private Pattern pattern;
    private Matcher matcher;
    Map<String, String> properties = null;
    private boolean isStringMatched;

    private static final String ID_PATTERN = "^\"id\"*:\\s*[0-9]{8},$";

    public JSONStringParser(){

        pattern = Pattern.compile(ID_PATTERN);
    }

    public void isJsonStringMatched(String data){

        matcher = pattern.matcher(data);
        isStringMatched = matcher.matches();

    }

    public boolean stringToHashmap(String data){
        isJsonStringMatched(data);

        if (isStringMatched){

            properties = new HashMap<>();

            String key = data.substring(1,3);
            String value = data.substring(6,14);

            properties.put(key,value);
        }
        return isStringMatched;
    }

    public static void main(String[] args) {

        JSONStringParser jsonStringParser = new JSONStringParser();
        jsonStringParser.stringToHashmap("\"id\": 16157746,");
    }


}
