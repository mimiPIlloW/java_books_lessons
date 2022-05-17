package com.java.books.head_first_java.chapter_2.page_67;

public class Movie {
    private String title;
    private String genre;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void playIt() {
        System.out.print("Проигрывание фильма " +
                "\n\ttitle: " + getTitle() +
                "\n\t\tgenre: " + getGenre() +
                "\n\t\t\trating: " + getRating() + "\n");
    }
}
