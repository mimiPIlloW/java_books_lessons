package com.java.books.head_first_java.chapter_2.page_68;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    /*
    Три переменные экземпляра для трел объектов
     */
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
/*
Создаем три объекта и присваиваем к трем экземпляра
 */
        int quesssp1 = 0;
        int quesssp2 = 0;
        int quesssp3 = 0;
/*
Три переменнеы для хранения вариантов каждого игрока
 */
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
/*
Для харнения правильности или неправильности
 */
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадал число от 0 до 9");
/*
Число которое игрок должен отгадать
 */
        while (true) {
            System.out.println("Число которое нужно угадать " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();
 /*
Вызываем метод из каждого объекта
 */
            quesssp1 = p1.number;
            System.out.println("Думает " + quesssp1);

            quesssp2 = p2.number;
            System.out.println("Думает " + quesssp2);

            quesssp3 = p3.number;
            System.out.println("Думает " + quesssp3);
 /*
Извлекаем вырианты каждого игрока
 */
            if (quesssp1 == targetNumber) {
                p1IsRight = true;
            }
            if (quesssp2 == targetNumber) {
                p2IsRight = true;
            }
            if (quesssp3 == targetNumber) {
                p3IsRight = true;
            }
/*
Проверка и присваеивание
 */
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("У нас есть победитель");
                System.out.println("Первый игрок " + p1IsRight);
                System.out.println("Второй игрок " + p2IsRight);
                System.out.println("Третий игрок " + p3IsRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Попробовать еще раз");
            }
        }
    }
}
