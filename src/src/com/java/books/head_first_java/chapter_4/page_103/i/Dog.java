package com.java.books.head_first_java.chapter_4.page_103.i;

public class Dog {
    int size;
    String name;

    public void bark() {
        if (size > 60) {
            System.out.println("ГАВ ГАВ");
        } else if (size > 14) {
            System.out.println("Вуф Вуф");
        } else {
            System.out.println("Тяф Тяф");
        }
    }
}