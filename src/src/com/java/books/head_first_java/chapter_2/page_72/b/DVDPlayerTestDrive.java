package com.java.books.head_first_java.chapter_2.page_72.b;

public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;
        dvdPlayer.playDVD();

        if (dvdPlayer.canRecord == true) {
            dvdPlayer.recordDVD();
        }
    }
}
