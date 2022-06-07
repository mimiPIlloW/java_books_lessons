package com.java.books.java8.beginners_guide.chapter_4.page_130;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Mини-фypгoн может перевезти "
                + minivan.passengers + " пассажиров на расстояние "
                + range + " миль");
    }
}
