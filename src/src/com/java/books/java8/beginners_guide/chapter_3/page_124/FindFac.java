package com.java.books.java8.beginners_guide.chapter_3.page_124;

public class FindFac {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            System.out.print("Дeлитeли " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}
