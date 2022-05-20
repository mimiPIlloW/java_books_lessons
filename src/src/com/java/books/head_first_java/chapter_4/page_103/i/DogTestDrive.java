package com.java.books.head_first_java.chapter_4.page_103.i;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        for (int x = 0; x < dogs.length; x++) {
            dogs[x] = new Dog();
        }
        dogs[0].size = 70;
        dogs[1].size = 8;
        dogs[2].size = 35;

        dogs[0].bark();
        dogs[1].bark();
        dogs[2].bark();
    }
}