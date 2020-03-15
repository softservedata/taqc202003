package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberReader {
    int amountOfNumbers;
    int[] results;
    String[] numbers;

    public void scanner(){

        System.out.println("Please enter "+amountOfNumbers+" integers splitted by coma: ");
        Scanner scanner = new Scanner(System.in);
        String reader = scanner.next();
        numbers = reader.split(",");

        results = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                results[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException nfe) {
            }
        }
    }

    public void changeOrder(){
        amountOfNumbers = 2;
        scanner();

        System.out.println(results[1]+","+results[0]);
    }

    public void printAsc(){
        amountOfNumbers = 3;
        int temp;
        scanner();

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (results[i] > results[j])
                {
                    temp = results[i];
                    results[i] = results[j];
                    results[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(results));
    }

    public void printOdd(){
        amountOfNumbers = 4;
        scanner();

        for(int i = 0 ; i < numbers.length ; i++)
        {
            if(results[i] % 2 != 0)
            {
                System.out.print(results[i]+" ");
            }
        }

    }

}
