package com.java.books.java8.beginners_guide.chapter_5.page_198;

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("l23 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        System.out.println("\nМлaдшиe 8 битов числа 87987 в двоичном представлении: ");
        b.show(87987);
    }
}
