package com.java.books.java8.beginners_guide.chapter_2.page_78;

public class SideEffects {
    public static void main(String[] args) {
        foo();
        foo1();
    }

    private static void foo() {
        int i;
        i = 0;
/*
Значение переменной i инкрементируется, несмотря
на то что проверяемое условие в операторе if ложно
*/
        if (false & (++i < 100))
            System.out.println("Не будет отображаться");
        System.out.println("Оператор if выполнятеся: " + i);
/*
В данном случае значение переменной i не инкрементируется,
поскольку второй операнд укороченного логического оператора
не вычисляется, а следовательно, инкремент пропускается
*/
        if (false && (++i < 100))
            System.out.println("Не будет отображаться");
        System.out.println("Оператор if выполняется: " + i);
    }

    private static void foo1() {
        int i;
        i = 0;
/*
Значение переменной i инкрементируется, несмотря
на то что проверяемое условие в операторе if ложно
*/
        if (false & (++i < 100))
            System.out.println("Не будет отображаться");
        System.out.println("Оператор if выполнятеся: " + i);
/*
Значение переменной i инкрементируется, несмотря
на то что проверяемое условие в операторе if ложно
*/
        if (false & (++i < 100))
            System.out.println("Не будет отображаться");
        System.out.println("Оператор if выполняется: " + i);
    }
}
