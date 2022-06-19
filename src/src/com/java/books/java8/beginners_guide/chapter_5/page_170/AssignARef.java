package com.java.books.java8.beginners_guide.chapter_5.page_170;

public class AssignARef {
    public static void main(String[] args) {
        int i;

        int num1[] = new int[10];
        int num2[] = new int[10];

        for (i = 0; i < 10; i++) {
            num1[i] = i;
        }
        for (i = 0; i < 10; i++) {
            num2[i] = -i;
        }

        System.out.print("Массив num1: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();

        System.out.print("Массив num2: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();

        num2 = num1;

        System.out.print("Массив num2 после присваивания: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();

        num2[3] = 99;
        System.out.print("Массив num1 после изменения через num2: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
    }
}
