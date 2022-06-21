package com.java.books.java8.beginners_guide.chapter_5.page_189.b;

public class Phone {
    public static void main(String[] args) {
        String number[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        if (args.length !=1){
            System.out.println("Иcпoльзoвaниe: java Phone <имя>");
        }else {
            for (i = 0; i < number.length; i ++){
                if (number[i][0].equals(args[0])){
                    System.out.println(number[i][0] + ": " + number[i][1]);
                    break;
                }
            }
            if (i == number.length){
                System.out.println("Имя не найдено");
            }
        }
    }
}
