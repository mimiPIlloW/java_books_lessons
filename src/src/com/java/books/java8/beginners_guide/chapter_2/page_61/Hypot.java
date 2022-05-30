/*
К примеру: катет a = 3 см, катет b = 4 см.
Чтобы найти длину гипотенузы в прямоугольном треугольнике, подставим числа в формулу.
c=sqrt{{3^2}+{4^2}}=sqrt{9+16}=sqrt{25}=5 см
 */

package com.java.books.java8.beginners_guide.chapter_2.page_61;

public class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x * x + y * y);

        System.out.println(z);
    }
}
