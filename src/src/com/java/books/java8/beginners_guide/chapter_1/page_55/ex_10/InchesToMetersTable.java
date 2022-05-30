package com.java.books.java8.beginners_guide.chapter_1.page_55.ex_10;

public class InchesToMetersTable {
    public static void main(String[] args) {
        double meters;
        int inches, counter;

        counter = 0;
        for (inches = 1; inches <= 100; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + " inches = " + meters + " meters");
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
