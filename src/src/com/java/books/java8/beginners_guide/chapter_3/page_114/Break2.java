package com.java.books.java8.beginners_guide.chapter_3.page_114;

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == 'q') break;
        }
        System.out.println("Bы нажали клавишу q!");
    }
}
