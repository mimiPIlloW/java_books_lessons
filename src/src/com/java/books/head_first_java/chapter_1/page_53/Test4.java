package com.java.books.head_first_java.chapter_1.page_53;

public class Test4 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            x = x + 1;
            y = y + x;
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
