package com.softserve.edu.hw8.test;

import com.softserve.edu.hw8.jsonparser.JSONStringParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JSONStringParserTest {

    @Test
    //Positive
    public void jsonStringValidationTest(){

        String jsonString = "\"id\": 16157746,";
        System.out.println("Test jsonStringValidationTest is running");

        JSONStringParser jsonStringParser = new JSONStringParser();
        assertTrue(jsonStringParser.stringToHashmap(jsonString));
    }

    @Test
    //Negative
    public void jsonStringValidationFailed(){

        String jsonString = "\"name\": \"efcore,";
        System.out.println("Test jsonStringValidationFailed is running");

        JSONStringParser jsonStringParser = new JSONStringParser();
        assertFalse(jsonStringParser.stringToHashmap(jsonString));

    }


}
