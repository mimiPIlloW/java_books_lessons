package com.java.books.java8.beginners_guide.chapter_5.page_174;

public class Queue {
    char q[];
    int putLoc, getLoc;

    Queue(int size) {
        q = new char[size + 1];
        putLoc = getLoc = 0;
    }

    void put(char ch) {
        if ((putLoc == q.length - 1)) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putLoc++;
        q[putLoc] = ch;
    }

    char get() {
        if (getLoc == putLoc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getLoc++;
        return q[getLoc];
    }
}
