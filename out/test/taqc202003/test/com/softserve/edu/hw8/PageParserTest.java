package com.softserve.edu.hw8;


import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class PageParserTest {

    @Test
    public void ifResultsHaveSameSize() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        PageParser pageParser = new PageParser();
        Map<String, String> actualResult;
        Reader reader = new FileReader("src/com/softserve/edu/hw8/datahw8.json");
        JSONArray jsonObject = (JSONArray) parser.parse(reader);
        String newJson = jsonObject.toString();
        actualResult = pageParser.parser(newJson);
        //
        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("21291278", "Scaffolding");
        expectedResult.put("12191244", "BenchmarkDotNet");
        expectedResult.put("12576526", "reactive");
        expectedResult.put("17620347", "aspnetcore");
        expectedResult.put("25990035", "foundation");
        Assert.assertSame("The size of two elements is not the same :", actualResult.size(), expectedResult.size());
        System.out.println("Test passed!");
    }

    @Test
    public void ifParserElementsEquals() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        PageParser pageParser = new PageParser();
        Map<String, String> actualResult;
        Reader reader = new FileReader("src/com/softserve/edu/hw8/datahw8.json");
        JSONArray jsonObject = (JSONArray) parser.parse(reader);
        String newJson = jsonObject.toString();
        actualResult = PageParser.parser(newJson);
        //
        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("21291278", "Scaffolding");
        expectedResult.put("12191244", "BenchmarkDotNet");
        expectedResult.put("12576526", "reactive");
        expectedResult.put("17620347", "aspnetcore");
        expectedResult.put("25990035", "foundation");
        Assert.assertEquals("Actual and and Expected results are not equals: ", actualResult, expectedResult);
        System.out.println("Test passed!");

    }

}