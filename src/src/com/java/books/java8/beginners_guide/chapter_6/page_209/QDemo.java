package com.java.books.java8.beginners_guide.chapter_6.page_209;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Иcпoльзoвaниe очереди ЬigQ для сохранения алфавита");

        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        System.out.print("Содержимое очереди bigQ ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
        System.out.println("\n");

        System.out.println("Иcпoльзoвaниe очереди srnallQ для генерации ошибок");

        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Содержимое smallQ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }
    }
}
