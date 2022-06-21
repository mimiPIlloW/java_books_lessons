package com.java.books.java8.beginners_guide.chapter_5.page_198;

public class ShowBits {
    int numBits;

    ShowBits(int n) {
        numBits = n;
    }

    void show(long val) {
        long mask = 1;

        mask <<= numBits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.println(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
