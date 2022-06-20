package com.java.books.java8.beginners_guide.chapter_5.page_184.b;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер";
        String str2 = new String(str1);
        String str3 = "Строки java эффективны";

        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        System.out.println();

        if (str1.equals(str2)) {
            System.out.println("str1 экв str2");
        } else {
            System.out.println("str1 не экв str2");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 экв str2");
        } else {
            System.out.println("str1 не экв str3");
        }

        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 и str3 равны");
        } else if (result < 0) {
            System.out.println("str1 меньше str3");
        } else {
            System.out.println("str1 больше str3");
        }

        str2 = "One Tho Three One";

        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения One: "+ idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхождения One: "+ idx);
    }
}
