package com.softserve.edu.hw5.birds;

public class Main {
    public static void main(String[] args) {
        //   Створіть масив типу Bird та додайте до нього різних птахів.
        //   В циклі викличте метод fly() від кожного об'єкта масиву.
        //   Виведіть додаткову інформацію про кожен вид створеної птиці (скористайтеся toString()).
   Bird bird[] = new Bird[4];
   bird[0] = new Chicken();
   bird[1] = new Eagle();
   bird[2] = new Penguin();
   bird[3] = new Swallow();

   for (int i=0; i<bird.length; i++){
       System.out.println(bird[i].toString() + " " + bird[i].fly());
   }

    }
}
