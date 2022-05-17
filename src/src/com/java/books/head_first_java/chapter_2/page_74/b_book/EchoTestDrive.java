package com.java.books.head_first_java.chapter_2.page_74.b_book;

public class EchoTestDrive {
    public static void main(String[] args) {
        EchoTest e1 = new EchoTest();
        EchoTest e2 = new EchoTest();
//        EchoTest e2 = e1; - бонус

        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;

            if (x == 3) {
                e2.count = e2.count + 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
