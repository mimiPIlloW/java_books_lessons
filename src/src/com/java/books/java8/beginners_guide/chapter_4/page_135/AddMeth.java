package com.java.books.java8.beginners_guide.chapter_4.page_135;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        System.out.print("Мини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров. ");
        minivan.range();

        System.out.print("Cпopтивный автомобиль может перевезти " +
                sportCar.passengers + " пассажиров. ");
        sportCar.range();

    }
}
