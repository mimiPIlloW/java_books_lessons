package com.java.books.java8.beginners_guide.chapter_3.page_103.a;

public class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i и j: " + i + " " + j);
        }
    }
}
