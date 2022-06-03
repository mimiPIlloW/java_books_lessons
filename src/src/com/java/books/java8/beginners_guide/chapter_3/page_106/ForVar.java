package com.java.books.java8.beginners_guide.chapter_3.page_106;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }
        System.out.println("Cyммa: " + sum);
        System.out.println("Фaктopиaл: " + fact);
    }
}
