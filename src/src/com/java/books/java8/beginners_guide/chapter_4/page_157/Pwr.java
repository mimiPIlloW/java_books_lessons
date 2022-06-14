package com.java.books.java8.beginners_guide.chapter_4.page_157;

public class Pwr {
    double base;
    int exp;
    double val;

    public Pwr(double base, int exp) {
        this.base = base;
        this.exp = exp;

        this.val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            this.val *= base;
        }
    }

    double getPwr() {
        return this.val;
    }
}
