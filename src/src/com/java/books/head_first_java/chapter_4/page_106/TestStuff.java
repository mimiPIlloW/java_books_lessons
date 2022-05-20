package com.java.books.head_first_java.chapter_4.page_106;

public class TestStuff {
    static void go1() {
        TestStuff one = new TestStuff();
        one.takeOne(12, 24);
    }

    void takeOne(int x, int y) {
        int z = x + y;
        System.out.println("Сумма равна: " + z);
    }

    public static void main(String[] args) {
        go1(); // Вызов метода с двумя параметрам и передача ему двух аргументов.
        go2(); //Можно передавать переменные в метод, если их типы совпа дают с типами параметров.
    }

    static void go2() {
        TestStuff two = new TestStuff();
        int foo = 7;
        int bar = 3;
        two.takeTwo(foo, bar);
    }

    void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Сумма равна: " + z);
    }
}
