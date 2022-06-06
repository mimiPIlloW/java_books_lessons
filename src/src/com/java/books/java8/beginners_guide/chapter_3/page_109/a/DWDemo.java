package com.java.books.java8.beginners_guide.chapter_3.page_109.a;

import java.io.IOException;

public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.print("Нажмите нужную клавишу, а затем клавишу <ENTER>: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
