package com.java.books.head_first_java.chapter_2.page_68;

public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю " + number);
    }
}
