package com.softserve.edu.hw8;

import java.util.HashMap;
import java.util.Map;

/**
 Написати клас з методом (або кількома), який розпарсить
 вхідну JSON стрічку в об'єкт HashMap<String,String>.
 Рекомендація. Використати регулярні вирази.
 */

public class Task1 {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"salary\":600000.0,\"age\":27}\n";
        Task1 task1 =  new Task1();
        Map<String, String> jsonToMap = task1.parseJson(json);
        System.out.println(jsonToMap);
    }

    public Map<String,String> parseJson(String json){
        Map<String, String> map = new HashMap<String, String>();
        if (json == null) {
            return map;
        }

        String[] parts = json.replaceAll("^\\{|\\}$","").split("\"?(:|,)(?![^\\{]*\\})\"?");
        for (int i = 0; i < parts.length -1; i+=2) {
            map.put(parts[i], parts[i+1]);
        }
        return map;

    }
}

