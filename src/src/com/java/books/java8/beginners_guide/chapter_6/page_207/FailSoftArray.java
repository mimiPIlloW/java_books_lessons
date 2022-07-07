package com.java.books.java8.beginners_guide.chapter_6.page_207;

public class FailSoftArray {
    private int a[];
    private int errVal;

    public int length;

    public FailSoftArray(int size, int errV) {
        this.a = new int[size];
        this.errVal = errV;
        length = size;
    }

    public int get(int index) {
        if (indexOk(index)) {
            return a[index];
        } else {
            return errVal;
        }
    }

    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        } else {
            return false;
        }
    }

    private boolean indexOk(int index) {
        if (index >= 0 & index < length) {
            return true;
        } else {
            return false;
        }
    }
}
