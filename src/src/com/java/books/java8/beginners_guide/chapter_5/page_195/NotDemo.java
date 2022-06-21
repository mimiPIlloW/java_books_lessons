package com.java.books.java8.beginners_guide.chapter_5.page_195;

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        int t;

        for (t = 128; t > 0; t /= 2) {
            if ((b & t) != 0) {
                System.out.println("1 ");
            } else {
                System.out.println("0 ");
            }
            System.out.println();

            b = (byte) ~b;

            for (t = 128; t > 0; t/=2){
                if ((b & t) != 0) {
                    System.out.println("1 ");
                } else {
                    System.out.println("0 ");
                }
            }
        }
    }
}
