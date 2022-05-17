package com.java.books.head_first_java.chapter_2.page_67;

public class MovieTestDrive extends Movie {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.setTitle("Как прогореть на акциях");
        one.setGenre("Трагедия");
        one.setRating(-2);
        one.playIt();

        Movie two = new Movie();
        two.setTitle("Потерянные в офисе");
        two.setGenre("Комедия");
        two.setRating(5);
        two.playIt();

        Movie three = new Movie();
        three.setTitle("Байт клуб");
        three.setGenre("Трагедия");
        three.setRating(127);
        three.playIt();
    }
}
