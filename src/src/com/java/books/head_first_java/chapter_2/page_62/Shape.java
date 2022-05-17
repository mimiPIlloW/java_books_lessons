package com.java.books.head_first_java.chapter_2.page_62;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rotate() {
        for (int a = 1; a <= 6; a++) {
            System.out.println("Rotate " + a + " " + getName() );
        }
    }

    public void playSound() {
        System.out.println("Play sound " + getName());
    }


    public static void main(String[] args) {
        Square square = new Square();
        square.setName("square");
        square.rotate();
        square.playSound();

        Circle circle = new Circle();
        circle.setName("circle");
        circle.rotate();
        circle.playSound();

        Triangle triangle = new Triangle();
        triangle.setName("triangle");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.setName("amoeba");
        amoeba.rotate();
        amoeba.playSound();
    }
}
