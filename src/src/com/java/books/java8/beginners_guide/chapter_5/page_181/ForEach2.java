package com.java.books.java8.beginners_guide.chapter_5.page_181;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int num[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : num) {
            for (int y : x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
