package com.java.books.java8.beginners_guide.chapter_5.page_186;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"Эта","строка","является","тестом"};

        System.out.println("Исходный массив: ");
        for (String s: strs){
            System.out.println(s + " ");
        }
        System.out.println("\n");

        strs[2] = "также является";
        strs[3] = "тестом!!!";

        for (String s : strs){
            System.out.println(s + " ");
        }
    }
}
