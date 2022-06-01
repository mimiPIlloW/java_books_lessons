package com.java.books.java8.beginners_guide.chapter_3.page_93.b;

import java.io.IOException;

public class Guess3 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'S';

        System.out.println("Зaдyмaнa буква из диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");

        boolean ifNotCorrect = true;
        while (ifNotCorrect) {

            ch = (char) System.in.read();

            boolean b = String.valueOf(ch).equalsIgnoreCase(String.valueOf(answer));
            if (b) {
                System.out.print("** Правильно! **" + " вы нашли букву: " + answer);
                ifNotCorrect = false;
            } else {
                System.out.print("Неправильно");
                if (ch < answer) {
                    System.out.println(" ближe к концу  алфавита");
                    foo(ch, answer);
                } else if (ch > answer) {
                    System.out.println(" ближe к началу  алфавита");
                    foo(ch, answer);
                }
            }
        }
    }

    private static char foo(char ch, char answer) throws IOException {
        System.out.print("Повторите еще раз: ");
        ch = (char) System.in.read();
        return ch;
    }
}