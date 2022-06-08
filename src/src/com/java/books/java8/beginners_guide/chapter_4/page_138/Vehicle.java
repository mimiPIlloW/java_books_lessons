package com.java.books.java8.beginners_guide.chapter_4.page_138;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}
