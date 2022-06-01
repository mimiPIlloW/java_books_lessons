package com.java.books.java8.beginners_guide.chapter_3.page_91;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.print("Haжмитe нужную клавишу, а затем клавишу ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Вы нажали клавишу " + ch);
    }
}
