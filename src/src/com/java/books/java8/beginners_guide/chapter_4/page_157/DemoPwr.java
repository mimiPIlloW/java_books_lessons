package com.java.books.java8.beginners_guide.chapter_4.page_157;


public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.base + " в степени " + x.exp + " равно " + x.getPwr());
        System.out.println(x.base + " в степени " + y.exp + " равно " + y.getPwr());
        System.out.println(x.base + " в степени " + z.exp + " равно " + z.getPwr());
    }
}
