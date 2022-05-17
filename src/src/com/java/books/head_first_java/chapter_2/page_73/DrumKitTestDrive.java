package com.java.books.head_first_java.chapter_2.page_73;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit drumKit = new DrumKit();
        drumKit.snare = false;
        drumKit.playSnare();
        drumKit.playTopHat();

        if (drumKit.snare == true) {
            drumKit.playSnare();
        }
    }
}
