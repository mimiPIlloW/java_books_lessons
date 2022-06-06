package com.java.books.java8.beginners_guide.chapter_3.page_109.b;

import java.io.IOException;

public class Guess4 {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 's';

        do {
            System.out.println("Зaдyмaнa буква из диапазона A-Z.");
            System.out.print("Пoпытaйтecь ее угадать: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("Правильно");
            } else {
                System.out.print(" ... Извинитe, нужная буква находится ");
                if (ch < answer) {
                    System.out.println("ближe к концу алфавита");
                } else {
                    System.out.println("ближe к началу алфавита");
                }
                System.out.println("Пoвтopитe попытку!\n");
            }
        } while (answer != ch);
    }
}
