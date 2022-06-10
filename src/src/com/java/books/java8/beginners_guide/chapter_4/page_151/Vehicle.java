package com.java.books.java8.beginners_guide.chapter_4.page_151;

public class Vehicle {
    int passenger;
    int fuelcap;
    int mpg;

    public Vehicle(int passenger, int fuelcap, int mpg) {
        this.passenger = passenger;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
