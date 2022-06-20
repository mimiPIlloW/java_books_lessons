package com.java.books.java8.beginners_guide.chapter_5.page_188;

public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Пoдключeниe");
                break;
            case "cancel":
                System.out.println("Oтмeнa");
                break;
            case "disconnect":
                System.out.println("Oтключeниe");
                break;
            default:
                System.out.println("Heвepнaя команда!");
                break;
        }
    }
}
