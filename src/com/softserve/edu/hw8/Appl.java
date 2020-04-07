package com.softserve.edu.hw8;

import java.util.HashMap;

public class Appl {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        String json = "{\n" +
                "         \"id\":01,\n" +
                "         \"language\":\"Java\",\n" +
                "         \"edition\":\"3rd\",\n" +
                "         \"author\":\"Herbert Schildt\"\n" +
                "      }";

        HashMap<String, String> map = JSONParser.parser(json);
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
    /*Output:
    author = Herbert Schildt
    edition = 3rd
    language = Java
    id = 01
     */
}
