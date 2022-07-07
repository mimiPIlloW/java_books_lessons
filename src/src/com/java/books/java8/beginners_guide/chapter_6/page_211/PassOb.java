package com.java.books.java8.beginners_guide.chapter_6.page_211;

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 имеет те же размеры, что и оb2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 имеет те же размеры, что и оbЗ: " + ob1.sameBlock(ob3));
        System.out.println("ob1 имеет тот же объем, что и оb3: " + ob1.sameVolume(ob3));
    }
}
