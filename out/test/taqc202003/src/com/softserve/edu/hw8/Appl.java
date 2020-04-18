package com.softserve.edu.hw8;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class Appl {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        PageParser pageParser = new PageParser();
        Reader reader = new FileReader("src/com/softserve/edu/hw8/datahw8.json");
        JSONArray jsonObject = (JSONArray) parser.parse(reader);
        String newJson = jsonObject.toString();

        Map<String, String> mapResult = pageParser.parser(newJson);
        for (Map.Entry<String, String> entry : mapResult.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
