package com.java.books.head_first_java.chapter_4.page_113;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[7];

        dogs[0] = new Dog();
        dogs[1] = new Dog();

        dogs[0].setSize(30);
        int x = dogs[0].getSize();
        dogs[1].setSize(8);

        System.out.println(dogs[0].getSize());
        System.out.println(x);
        System.out.println(dogs[1].getSize());
    }
}
