package com.softserve.edu.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
       Integer mas[] = new Integer[10];
      // Integer mas[] = {3,5,-9,6,10,0,55,3,3,-22};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Input numbers: " +i);
            mas[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();

       //1) Знайти суму додатніх елементів масиву.
        int suma = 0;
        for (int i = 0; i<mas.length; i++){
            if (mas[i]>0) {
                suma = suma + mas[i];
            }
        }
        System.out.println("Sum of positive elements from array: " +suma);

        //2) Знайти найбільше серед від'ємних елементів.
        int maxmin = 0;
        for (int i = 0; i<mas.length; i++) {
            if (mas[i] < 0 && mas[i] < maxmin) {
                maxmin = mas[i];
            }
        }
        System.out.println("Minimum from the array elements: " +maxmin);
    }
}
