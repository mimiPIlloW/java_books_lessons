package com.java.books.java8.beginners_guide.chapter_2.page_71;

public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y: " + y);
            y = 100;
            System.out.println("Измeнeннoe значение у: " + y);
        }
    }
}
