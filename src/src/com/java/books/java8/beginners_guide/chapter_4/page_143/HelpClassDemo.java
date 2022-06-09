package com.java.books.java8.beginners_guide.chapter_4.page_143;

import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        Help help = new Help();

        for (; ; ) {
            do {
                help.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            help.helpOn(choice);
        }

    }
}
