package com.java.books.java8.beginners_guide.chapter_5.page_187;

public class SubStr {
    public static void main(String[] args) {
        String orgStr = "Java - двигатель Интернета.";

        String subStr = orgStr.substring(7,25);

        System.out.println("orgStr: " + orgStr);
        System.out.println("subStr: " + subStr);
    }
}
