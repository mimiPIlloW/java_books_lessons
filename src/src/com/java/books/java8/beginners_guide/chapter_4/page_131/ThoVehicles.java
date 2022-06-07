package com.java.books.java8.beginners_guide.chapter_4.page_131;

public class ThoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportCar.fuelcap * sportCar.mpg;

        System.out.println("Мини-фypгoн может перевезти" +
                minivan.passengers + "пассажиров на расстояние" +
                range1 + " миль");
        System.out.println("Cпopтивный автомобиль может перевезти" +
                sportCar.passengers + " пассажиров на расстояние" +
                range2 + " миль");
    }
}
