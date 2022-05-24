package com.java.books.head_first_java.chapter_5.page_129;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] location = {2, 3, 4};
        dot.setLocationCell(location);
        String userGuess = "-1";
        String result = dot.checkYourself(userGuess);
    }
}
