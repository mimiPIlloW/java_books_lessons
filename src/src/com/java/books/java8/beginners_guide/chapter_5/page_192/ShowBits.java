package com.java.books.java8.beginners_guide.chapter_5.page_192;

public class ShowBits {
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t/=2){
            if ((val & t) != 0){
                System.out.println("1 ");
            }else {
                System.out.println("0 ");
            }
        }
    }
}
