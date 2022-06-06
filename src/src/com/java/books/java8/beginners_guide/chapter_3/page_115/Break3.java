package com.java.books.java8.beginners_guide.chapter_3.page_115;

public class Break3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Cчeтчик внешнего цикла: " + i);
            System.out.print("Счетчик внутреннего цикла: ");
            int t = 0;
            while (t < 100) {
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Цикл завершен");
    }
}
