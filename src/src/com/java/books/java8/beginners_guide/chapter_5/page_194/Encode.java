package com.java.books.java8.beginners_guide.chapter_5.page_194;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encMsg = "";
        String decMsg = "";
        int key = 88;
        int i;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        for (i = 0; i < msg.length(); i++) {
            encMsg = encMsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encMsg);

        for (i = 0; i < msg.length(); i++) {
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key);
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decMsg);
    }
}

