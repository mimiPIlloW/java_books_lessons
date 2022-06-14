package com.java.books.java8.beginners_guide.chapter_4.page_154;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Финализация" + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
