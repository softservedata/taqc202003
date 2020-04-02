package com.softserve.edu.hw8;

import java.util.HashMap;

public class Appl1 {
    public static void main(String[] args) {
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"id\": 12191244,\r\n" + 
        		"    \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMjE5MTI0NA==\",\r\n" + 
        		"    \"name\": \"BenchmarkDotNet\",\r\n" + 
        		"    \"full_name\": \"dotnet/BenchmarkDotNet\",\r\n" + 
        		"    \"private\": \"false\" ,\r\n"+
        		"  	}\r\n"+ 
        		"	]\r\n";
        
        //System.out.println(json);
        HashMap<String, String> map = Parser.parser(json);
        map.forEach((var, val) -> System.out.println("["+var+"]" + " : " + "["+ val+"]"));
    }

}