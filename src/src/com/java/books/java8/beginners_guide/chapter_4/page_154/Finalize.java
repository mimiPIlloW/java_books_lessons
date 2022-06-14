package com.java.books.java8.beginners_guide.chapter_4.page_154;

public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo fDemo = new FDemo(0);

        for (count = 1; count < 100000; count++) {
            fDemo.generator(count);
        }
    }
}
