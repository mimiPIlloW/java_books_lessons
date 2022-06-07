package com.java.books.java8.beginners_guide.chapter_4.page_135;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Дальность - " + fuelcap * mpg + "миль.");
    }
}
