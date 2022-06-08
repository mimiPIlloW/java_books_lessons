package com.java.books.java8.beginners_guide.chapter_4.page_142;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        double gallons1, gallons2;
        int dist = 252;
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        range1 = minivan.range();
        range2 = sportCar.range();

        gallons1 = minivan.fuelNeeded(dist);
        gallons2 = sportCar.fuelNeeded(dist);

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers +
                "и для преодоления " + dist + " миль мини-фургону требуется " +
                gallons1 + " галлонов топлива" + " на расстояние " + range1 + "миль");

        System.out.println("Cпopтивный автомобиль может перевезти " + sportCar.passengers +
                "и для преодоления " + dist + " миль спортивному автомобилю требуется " +
                gallons2 + " галлонов топлива" + " на расстояние " + range2 + "миль");
    }
}
