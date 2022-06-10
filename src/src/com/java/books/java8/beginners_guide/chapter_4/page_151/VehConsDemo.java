package com.java.books.java8.beginners_guide.chapter_4.page_151;

public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist +
                "миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportCar.fuelNeeded(dist);

        System.out.println("Для преодоления " + dist +
                "миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }
}
