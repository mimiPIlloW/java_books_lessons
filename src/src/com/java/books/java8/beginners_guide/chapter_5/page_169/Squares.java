package com.java.books.java8.beginners_guide.chapter_5.page_169;

public class Squares {
    public static void main(String[] args) {
        int sqr[][] = {{1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}};

        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sqr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
