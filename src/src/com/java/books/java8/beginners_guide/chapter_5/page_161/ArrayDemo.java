package com.java.books.java8.beginners_guide.chapter_5.page_161;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++)
            sample[i] = i;

        for (i = 0; i < 10; i++)
            System.out.println("Элeмeнт[" + i + "]: " + sample[i]);
    }
}
