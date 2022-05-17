package com.java.books.head_first_java.chapter_2.page_62;

public class Amoeba extends Shape {
    @Override
    public void rotate() {
        for (int a = 6; a >= 1; a--) {
            System.out.println("Rotate " + a + " " + getName());
        }
    }

    @Override
    public void playSound() {
        System.out.println("Play sound " + getName() + " LALALA");
    }
}
