package com.java.books.java8.beginners_guide.chapter_2.page_73;

public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = (double) 10 / 3;
        drem = 10 % 3;

        System.out.println("10 / 3 = " + iresult + "\n10 % 3 = " + irem);
        System.out.println();
        System.out.println("10 / 3 = " + dresult + "\n10 % 3 = " + drem);
    }
}
