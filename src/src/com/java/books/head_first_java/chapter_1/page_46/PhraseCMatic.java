package com.java.books.head_first_java.chapter_1.page_46;

public class PhraseCMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"крузшосуточный", "трех-эвенный",
                "30000-футовый", "взаимный", "обсадный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникающий", "умный", "шесть",
                "сити", " метод критического пути", " динамичный" };

        String[] wordListTwo = {"уполномоченный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевсй",
                "сфокусированный", "использованный с выгодой", "выровненньй",
                "нацеленный на", "общий", "совместный", "ускореннш" };

        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
