package com.java.books.java8.full_guide.chapter_2.page_67;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше у ");
        x = x * 2;
        if (x == y) System.out.println("x теперь равно у");
        x = x * 2;
        if (x > y) System.out.println(" x теперь больше у");
        if (x == y) System.out.println(" вы не увидите э того");
    }
}