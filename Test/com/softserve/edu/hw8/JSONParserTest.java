package com.softserve.edu.hw8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class JSONParserTest {

    @Test
    void parserCheck() {
        JSONParser jsonParser = new JSONParser();
        HashMap<String,String> actual;
        String json = "{\n" +
                "         \"id\":\"01\",\n" +
                "         \"language\":\"Java\",\n" +
                "         \"edition\":\"3rd\",\n" +
                "         \"author\":\"Herbert Schildt\"\n" +
                "      }";
        actual = JSONParser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("id","01");
        expected.put("language","Java");
        expected.put("edition","3rd");
        expected.put("author","Herbert Schildt");

        Assert.assertEquals(expected,actual);

        //result - Pass
    }
}