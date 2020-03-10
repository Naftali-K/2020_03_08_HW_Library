package com.example.library;

public class Book {
    String title;
    String author;
    String date;
    int id;
    String descreption;

    public Book(String title, String author, String date, int id, String descreption) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.id = id;
        this.descreption = descreption;
    }

    public Book() {
    }
}
