package com.java.books.head_first_java.chapter_3.page_93.a;

public class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        int a = 0;
        while (a < 3) {
            myBooks[a] = new Books();
            a++;
        }
/*
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
*/
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов no Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        int x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
}
