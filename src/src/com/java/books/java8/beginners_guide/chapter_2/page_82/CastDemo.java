package com.java.books.java8.beginners_guide.chapter_2.page_82;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("Цeлoчиcлeнный результат делениях/ у: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Знaчeниe b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Знaчeниe b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
