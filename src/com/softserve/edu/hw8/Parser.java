package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.regex.*;

public class Parser {
    static HashMap<String, String> parser(String json) {
        String pattern = "\"([^ ]+)\"(?:: )\"([^ ]+)\"";     //("\"([^ ]+)\"(?:: )\"([^ ]+)\"")|("\"([^ ]+)\"(?:: )\"([^ ]+)\"") ??? 
        Pattern p = Pattern.compile(pattern);		
        Matcher m = p.matcher(json);
        HashMap<String, String> result = new HashMap<>();
        
        while (m.find()) {
            result.put(m.group(1), m.group(2));
        }
        return result;
    }
}