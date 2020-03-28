package com.softserve.edu.hw6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Створити два об'єкти типу Set на основі типу String до 10 елементів кожний.
 *    На підставі цих двох множин створити List, який містить лише
 *    спільні стрічки з обох заданих множин.
 */
public class Task1 {
    public static void main(String[] args) {
        Set <String> obj1 = new HashSet<>();
        obj1.add("Olena");
        obj1.add("Stepan");
        obj1.add("Ivanka");
        obj1.add("Ivan");
        obj1.add("Taras");
        obj1.add("Tamara");
        obj1.add("Olga");
        obj1.add("Oleg");
        obj1.add("Valentyn");
        obj1.add("Valentyna");

        Set <String> obj2 = new HashSet<>();
        obj2.add("Taras");
        obj2.add("Olga");
        obj2.add("Ivanka");
        obj2.add("Mykhailo");
        obj2.add("Igor");
        obj2.add("Artur");
        obj2.add("Galina");
        obj2.add("Svitlana");
        obj2.add("Natasha");
        obj2.add("Stepan");

        List <String> names = new ArrayList<>();

        for (String name: obj1) {
            if(obj2.contains(name)){
                names.add(name);
            }
        }
        System.out.println("Common elements in both collections:" + names);
    }
}
