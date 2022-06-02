package com.java.books.java8.beginners_guide.chapter_3.page_94;

public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x = 1");
            } else if (x == 2) {
                System.out.println("x = 2");
            } else if (x == 3) {
                System.out.println("x = 3");
            } else if (x == 4) {
                System.out.println("x = 4");
            } else {
                System.out.println("Знaчeниe х находится вне диапазона 1 - 4");
            }
        }
    }
}
