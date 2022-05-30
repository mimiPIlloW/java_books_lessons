package com.java.books.java8.beginners_guide.chapter_2.page_63;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("Знaчeниe Ь: " + b);
        b = true;
        System.out.println("Знaчeниe Ь: " + b);

        if (b) System.out.println("Эта инструкция вьmолняется");

        b = false;
        if (b) System.out.println("Этa инструкция не выполняется");

        System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 9));
    }
}
