package com.java.books.head_first_java.chapter_4.page_118.b;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime("12345");
        String tod = clock.getTime();
        System.out.println(tod);
    }
}
