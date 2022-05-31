package com.java.books.java8.beginners_guide.chapter_2.page_70;

public class ScopeDemo {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.println("x and у: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}
