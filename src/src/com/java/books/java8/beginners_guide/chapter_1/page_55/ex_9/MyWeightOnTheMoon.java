package com.java.books.java8.beginners_guide.chapter_1.page_55.ex_9;

import java.util.Scanner;

public class MyWeightOnTheMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myWeight = scanner.nextInt();

        double weightOnTheMoon = (double) (myWeight * 17) / 100;

        System.out.println(weightOnTheMoon);
    }
}
