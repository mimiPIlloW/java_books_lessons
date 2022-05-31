package com.java.books.java8.beginners_guide.chapter_2.page_86;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;

        System.out.println("i and b: " + i + " " + b);

        b = 10;
        b = (byte) (b * b);

        System.out.println("i and b: " + i + " " + b);
    }
}
