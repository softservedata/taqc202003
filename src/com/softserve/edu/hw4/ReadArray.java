package com.softserve.edu.hw4;

import com.softserve.edu.hw3.NumberReader;

import java.util.*;

public class ReadArray {

    public static void main(String[] args) {

        List<Integer> arrayOfNegative = new ArrayList<>();
        int positiveSum = 0;
        int maxNegative;

        NumberReader numberReader = new NumberReader();
        numberReader.amountOfNumbers = 10;
        numberReader.scanner();

        for (int number: numberReader.results) {
            if (number >= 0) {
                positiveSum += number;
            } else {
                arrayOfNegative.add(number);
            }
        }

        maxNegative = arrayOfNegative.get(0);

        for(int i = 0; i < arrayOfNegative.size(); i++) {

            if (arrayOfNegative.get(i) >= maxNegative) {
                maxNegative = arrayOfNegative.get(i);
            }
        }

        System.out.println("Sum of positive numbers is "+ positiveSum + " and biggest negative number is "+ maxNegative);
    }
}
