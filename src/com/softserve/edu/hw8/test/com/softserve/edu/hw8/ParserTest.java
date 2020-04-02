package com.softserve.edu.hw8;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

public class ParserTest {

    @Test
    public void IdCheck() {
        Parser parser = new Parser();
        HashMap<String,String> actual;
        
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"id\": 12191244,\r\n";
        
        actual = Parser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("id","12191244");

        Assert.assertEquals("IDcheck: ",expected,actual);
    }
    
    @Test
    public void NodeIdCheck() {
        Parser parser = new Parser();
        HashMap<String,String> actual;
        
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"node_id\": \"MDEwOlJlcG9zaXRvcnkxMjE5MTI0NA==\",\r\n" ;
        
        actual = Parser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("node_id","MDEwOlJlcG9zaXRvcnkxMjE5MTI0NA==");

        Assert.assertEquals("NodeIDcheck: ",expected,actual);
    }
    
    @Test
    public void NameCheck() {
        Parser parser = new Parser();
        HashMap<String,String> actual;
        
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"name\": \"BenchmarkDotNet\",\r\n" ;
        
        actual = Parser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("name","BenchmarkDotNet");

        Assert.assertEquals("Name_check: ",expected,actual);
    }
    
    @Test
    public void Full_nameCheck() {
        Parser parser = new Parser();
        HashMap<String,String> actual;
        
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"full_name\": \"dotnet/BenchmarkDotNet\",\r\n" ;
        
        actual = Parser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("full_name","dotnet/BenchmarkDotNet");

        Assert.assertEquals("full_name: ",expected,actual);
    }
    
    @Test
    public void PrivateCheck() {
        Parser parser = new Parser();
        HashMap<String,String> actual;
        
        String json = "[\r\n" + 
        		"  {\r\n" + 
        		"    \"private\": \"false\",\r\n" ;
        
        actual = Parser.parser(json);

        HashMap<String,String>  expected = new HashMap<>();
        expected.put("private","false");

        Assert.assertEquals("private: ",expected,actual);
    }
    
}