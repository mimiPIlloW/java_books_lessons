package com.java.books.java8.beginners_guide.chapter_4.page_141;

public class IsFactor {
    public static void main(String[] args) {
        Factor factor = new Factor();
        if (factor.isFactor(2, 20)) {
            System.out.println("2 - делитель");
        }
        if (factor.isFactor(3, 20)) {
            System.out.println("3 - делитель");
        }
    }
}
