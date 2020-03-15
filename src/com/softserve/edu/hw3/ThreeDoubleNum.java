package com.softserve.edu.hw3;

import java.util.Scanner;

public class ThreeDoubleNum {
    public static void main(String[] args) {

    int length = 3;
    Scanner tdn = new Scanner(System.in);
    {
        //double num = tdn.nextDouble();
        System.out.println("Enter three double numbers, press enter after each, d1 = ");
        double d1 = tdn.nextDouble();
        System.out.println("d2 = ");
        double d2 = tdn.nextDouble();
        System.out.println("d3 = ");
        double d3 = tdn.nextDouble();

        if ((d1 < d2) && (d2 < d3)){
            System.out.println("Sorted numbers (ascending) " + d1 + " " + d2 + " " + d3);
        }
        if ((d1 < d2) && (d2 > d3)){
            System.out.println("Sorted numbers (ascending) " + d1 + " " + d3 + " " + d2);
        }
        if ((d1 > d2) && (d2 > d3)){
            System.out.println("Sorted numbers (ascending) " + d3 + " " + d2 + " " + d1);
        }
        if ((d1 > d2) && (d2 < d3)){
            System.out.println("Sorted numbers (ascending) " + d2 + " " + d1 + " " + d3);
        }
    }

    }
    }

