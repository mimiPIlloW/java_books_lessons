package com.java.books.java8.beginners_guide.chapter_6.page_205;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;
        System.out.println("beta : alpha \n" + ob.beta + "   : " + ob.gamma);
    }
}
