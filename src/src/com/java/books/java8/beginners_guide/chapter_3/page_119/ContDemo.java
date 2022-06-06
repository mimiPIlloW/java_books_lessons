package com.java.books.java8.beginners_guide.chapter_3.page_119;

public class ContDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 100; i++) {
            if ((i%2) != 0) continue;
            System.out.println(i);
        }
    }
}
