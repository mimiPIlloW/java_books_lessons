package com.java.books.java8.beginners_guide.chapter_2.page_77;

public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " является делителем " + n);
        }

        d = 0;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " является делителем " + n);
        }else {
            System.out.println("Не вычисляется, поскольку значение переменной d равно нулю");
        }
        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " является делителем " + n);
        }
    }
}
