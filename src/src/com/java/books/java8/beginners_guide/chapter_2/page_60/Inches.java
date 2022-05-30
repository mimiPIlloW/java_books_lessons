package com.java.books.java8.beginners_guide.chapter_2.page_60;

public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("B одной кубической миле содержится " + ci + " кубических дюймов");
    }
}
