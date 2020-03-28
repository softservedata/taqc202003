package com.softserve.edu.hw7;

import java.util.Scanner;

public class task1 {
    //Прочитати з клавіатури (або захардкодити) стрічку символів.
    //Вважається, що у стрічці містяться слова, які розділені хоча б одним пробілом.
    //Прочитати з клавіатури (або задати) послідовність символів.
    //Видрукувати на екран ті слова, які містять задану підстрічку (послідовність символів).

    public static void main(String[] args) {
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Enter some text to compare with previous:");
        String compareText = scanner.nextLine();

        String[] splited = text.split("\\s+");
        for (String word: splited){
            if (word.contains(compareText)){
                System.out.println("result: " +word);
            }
        }
    }
}
