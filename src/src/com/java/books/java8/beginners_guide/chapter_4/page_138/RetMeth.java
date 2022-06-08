package com.java.books.java8.beginners_guide.chapter_4.page_138;

public class RetMeth {
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

        range1 = minivan.range();
        range2 = sportCar.range();

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers +
                " на расстояние " + range1 + "миль");
        System.out.println("Cпopтивный автомобиль может перевезти " + sportCar.passengers +
                " на расстояние " + range2 + "миль");
    }
}
