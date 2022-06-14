package com.java.books.java8.beginners_guide.chapter_4.page_156;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            val *= base;
        }
    }

    double getPwr() {
        return val;
    }
}
