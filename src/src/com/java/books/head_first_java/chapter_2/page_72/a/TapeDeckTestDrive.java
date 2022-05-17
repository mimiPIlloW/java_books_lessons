package com.java.books.head_first_java.chapter_2.page_72.a;

public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck tapeDeck = new TapeDeck();
        tapeDeck.canRecord = true;
        tapeDeck.playTape();

        if (tapeDeck.canRecord == true) {
            tapeDeck.recordTape();
        }
    }
}
