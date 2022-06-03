package com.java.books.java8.beginners_guide.chapter_3.page_103.c;

import java.util.Objects;
import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; !Objects.equals(scanner.nextLine(), "S"); i++);
    }
}
