package com.softserve.edu.hw8;

import org.junit.Before;

import java.util.Map;

import static org.junit.Assert.*;

public class Task1Test {
    private Task1 task1;

    @Before
    public void setUp() throws Exception {
        task1 = new Task1();
    }

    @org.junit.Test
    public void parseJsonValidTest() {
        String json = "{\"name\":\"John\",\"salary\":600000.0,\"age\":27}";
        Map<String, String> map = task1.parseJson(json);
        System.out.println(map);
        System.out.println(map.keySet());
        assertEquals("27",map.get("age"));
    }

    @org.junit.Test
    public void parseJson_Invalid_EmptyParamTest() {
        String json = "";
        Map<String, String> map = task1.parseJson(json);
        assertEquals(map.isEmpty(), true);
    }

    @org.junit.Test
    public void parseJson_Invalid_NullParamTest() {
        String json = null;
        Map<String, String> map = task1.parseJson(json);
        assertEquals(map.isEmpty(), true);
    }
}