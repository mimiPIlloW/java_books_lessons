package com.java.books.head_first_java.chapter_1.page_53;

public class Test3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x + 2;
            if (y > 4) {
                y= y -1;
            }
            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
