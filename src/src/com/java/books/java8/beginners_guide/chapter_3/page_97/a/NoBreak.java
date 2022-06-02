package com.java.books.java8.beginners_guide.chapter_3.page_97.a;

public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
                case 2:
                    System.out.println("2");
                case 3:
                    System.out.println("3");
                case 4:
                    System.out.println("4");
                case 5:
                    System.out.println("5");
            }
            System.out.println();
        }
    }
}
