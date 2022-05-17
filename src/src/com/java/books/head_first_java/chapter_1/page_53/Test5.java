package com.java.books.head_first_java.chapter_1.page_53;

public class Test5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            if (y < 5) {
                x++;
                if (y < 3) {
                    x--;
                }
            }
            x += 2;
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
