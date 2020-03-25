package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class AppSet {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<>();
        s1.add("first");
        s1.add("third");
        s1.add("fifth");
        s1.add("ninth");
        s1.add("test+");
        s1.add("second");
        s1.add("fourth");

        Set<String> s2 = new HashSet<>();
        s2.add("fifth");
        s2.add("ninth");
        s2.add("eleventh");
        s2.add("eighth");
        s2.add("test+");
        s2.add("first");
        s2.add("bebebe");

        s1.retainAll(s2);

        //System.out.println("Common elements " + s1);
        int s = s1.size();
        List<String> aList = new ArrayList<String>(s);
        for (String x : s1)
            aList.add(x);

        System.out.println("Created ArrayList is");
        for (String x : aList)
            System.out.println(x);



    }


}
