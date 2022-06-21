package com.java.books.java8.beginners_guide.chapter_5.page_189.a;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Пpoгpaммe передано " + args.length + " аргументов командной строки.");
        System.out.println("Список аргументов: ");

        for(int i = 0; i < args.length; i++){
            System.out.println("arg [" + i + "]: " + args[i]);
        }
    }
}
