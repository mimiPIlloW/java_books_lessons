package com.java.books.java8.beginners_guide.chapter_2.page_81;

public class LtoD {
    public static void main(String[] args) {
        foo();
        foo1();
    }

    private static void foo() {
        long L;
        double D;

        L = 100123285L;
        D = L;
        System.out.println("L:  " + L + " и D: " + D);
    }

    private static void foo1() {
        long L = 0;
        double D;

        D = 100123285.0;
//        L = D;
        System.out.println("L:  " + L + " и D: " + D);
    }
}
