package com.softserve.edu.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("add 4 numbers:");
        Scanner scan1 = new Scanner(System.in);
        int numb1 = Integer.parseInt(scan1.nextLine());

        Scanner scan2 = new Scanner(System.in);
        int numb2 = Integer.parseInt(scan2.nextLine());

        Scanner scan3 = new Scanner(System.in);
        int numb3 = Integer.parseInt(scan3.nextLine());

        Scanner scan4 = new Scanner(System.in);
        int numb4 = Integer.parseInt(scan4.nextLine());

        List<Integer> numbList = new ArrayList<>();
        numbList.add(numb1);
        numbList.add(numb2);
        numbList.add(numb3);
        numbList.add(numb4);

        for (Integer n : numbList) {
            if ((n & 1) == 0 ) {
                System.out.println("Odd number: " + n);
            }
        }

    }
}
