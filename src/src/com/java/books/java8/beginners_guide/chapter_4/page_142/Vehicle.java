package com.java.books.java8.beginners_guide.chapter_4.page_142;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
