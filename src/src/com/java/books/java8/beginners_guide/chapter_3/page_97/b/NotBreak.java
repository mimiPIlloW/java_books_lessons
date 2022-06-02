package com.java.books.java8.beginners_guide.chapter_3.page_97.b;

public class NotBreak {
    public static void main(String[] args) {
        int x;

        for (x = 1; x <= 4; x++) {
            switch (x) {
                case 1:
                case 2:
                case 3:
                    System.out.println("i = 1 or 2 or 3");
                    break;
                case 4:
                    System.out.println("i = 4");
                    break;
            }
        }
    }
}
