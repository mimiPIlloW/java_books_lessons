package com.java.books.java8.beginners_guide.chapter_3.page_92;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'v';

        System.out.println("Зaдyмaнa буква из диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");

        ch = (char) System.in.read();

        if ((String.valueOf(ch)).equalsIgnoreCase(String.valueOf(answer))) {
            System.out.println("** Правильно! **");
        } else {
            System.out.println("** Неправильно! **");
        }
    }
}
