package com.java.books.java8.beginners_guide.chapter_1.page_48;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b");
        if (a == b) System.out.println("Bы не должны увидеть этот текст");
        System.out.println();

        c = a - b;
        System.out.println("c содержит -1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
        System.out.println();

        c = b - a;
        System.out.println("c содержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
