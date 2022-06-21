package com.java.books.java8.beginners_guide.chapter_5.page_196;

public class ShiftDemo {
    public static void main(String[] args) {
        int val = 1;
        int i, t;

        for (i = 0; i < 8; i++) {
            for (t = 128; t > 0; t /= 2) {
                if ((val & t) != 0) {
                    System.out.println("1 ");
                } else {
                    System.out.println("0 ");
                }
                System.out.println();
                val = val << 1;
            }
            System.out.println();

            val = 128;
            for (i = 0; i < 8; i++) {
                for (t = 128; t > 0; t /= 2) {
                    if ((val & t) != 0) {
                        System.out.println("1 ");
                    } else {
                        System.out.println("0 ");
                    }
                    System.out.println();
                    val = val >> 1;
                }
            }
        }
    }
}
