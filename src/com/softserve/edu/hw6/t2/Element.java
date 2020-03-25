package com.softserve.edu.hw6.t2;

import java.util.ArrayList;
import java.util.List;

public class Element {
    private List<Integer> list;

    public Element(List<Integer> list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }


    public List sameNumbers(List anotherList) {
        List<Integer> sameNumbersList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < anotherList.size(); j++) {
                if (list.get(i) == anotherList.get(j)) {
                    sameNumbersList.add(list.get(i));
                }
            }
        }
        return sameNumbersList;
    }
}
