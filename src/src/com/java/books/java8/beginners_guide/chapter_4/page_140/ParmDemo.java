package com.java.books.java8.beginners_guide.chapter_4.page_140;

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();
        if (chkNum.isEven(10)) {
            System.out.println("10 - четное число");
        }
        if (chkNum.isEven(9)){
            System.out.println("9 - четное число");
        }
        if (chkNum.isEven(8)){
            System.out.println("8 - четное число");
        }
    }
}
