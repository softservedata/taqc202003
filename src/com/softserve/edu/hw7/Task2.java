package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.List;

/**
 *   Нехай згідно вимог nickname користувача може містити від 3 до 15 символів
 *   латинського алфавіту, цифри та підкреслення.
 *   Використовуючи регулярні вирази, виконайте перевірку імені користувача на достовірність.
 *   Введіть п'ять імен в основний метод. Виведіть повідомлення на консоль
 *   валідації кожного із введених імен.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> nicknames = new ArrayList<>();
        nicknames.add("Kate123_0");
        nicknames.add("Kate123_@");
        nicknames.add("Ka");
        nicknames.add("Kate123_0876tyh");
        nicknames.add("Kate123_0yfdgrrd");
        nicknames.add("KateShemanska");

        String regex = "^[a-zA-Z0-9_]{3,15}$";

        for (int i=0; i<=nicknames.size()-1; i++){
            boolean isMatch = nicknames.get(i).matches(regex);
            if (isMatch){
                System.out.println("Valid nickname:" +nicknames.get(i));
            } else {
                System.out.println("Invalid nickname:" + nicknames.get(i));
            }
        }


    }
}
