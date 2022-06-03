package com.java.books.java8.beginners_guide.chapter_3.page_103.b;

import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int i;

        for (i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Проход #" + i);
        }
    }
}
