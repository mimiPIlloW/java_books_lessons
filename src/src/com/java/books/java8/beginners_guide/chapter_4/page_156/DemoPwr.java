package com.java.books.java8.beginners_guide.chapter_4.page_156;

public class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " в степени " + x.e + " равно " + x.getPwr());
        System.out.println(x.b + " в степени " + y.e + " равно " + y.getPwr());
        System.out.println(x.b + " в степени " + z.e + " равно " + z.getPwr());
    }
}
