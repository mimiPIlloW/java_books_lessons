package com.java.books.head_first_java.chapter_4.page_112;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("ГАВ ГАВ");
        } else if (size > 14) {
            System.out.println("Вуф Вуф");
        } else {
            System.out.println("Тяф Тяф");
        }
    }
}
