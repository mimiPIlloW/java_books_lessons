package com.java.books.java8.beginners_guide.chapter_3.page_117;

public class Break5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("Пocлe цикла по k");
            }
            System.out.println("Пocлe цикла по j");
        }
        System.out.println("Пocлe цикла по i");
    }
}
