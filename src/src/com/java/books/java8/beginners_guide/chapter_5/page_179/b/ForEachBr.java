package com.java.books.java8.beginners_guide.chapter_5.page_179.b;

public class ForEachBr {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : num) {
            System.out.println("Значение " + x);
            sum += x;
            if (x == 5) {
                break;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
