package com.java.books.java8.beginners_guide.chapter_3.page_120;

public class ContToLabe1 {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nBнemний цикл: проход " + i + ", внутренний цикл: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}
