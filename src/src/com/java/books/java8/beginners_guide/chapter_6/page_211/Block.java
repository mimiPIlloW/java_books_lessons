package com.java.books.java8.beginners_guide.chapter_6.page_211;

public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}
