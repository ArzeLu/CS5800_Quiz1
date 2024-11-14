package com.book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPart I, the book classes were successfully created!");

        String title;
        String author;
        ArrayList<String> chapters;

        // Reset all variable fields
        title = "Book Title";
        author = "Book Author";
        chapters = new ArrayList<String>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");

        Book book = new BookShallowCopy(title, author, chapters);
        Book bookShallowCopy = book.clone();
        bookShallowCopy.setTitle("New book title");
        bookShallowCopy.setAuthor("New book author");
        ArrayList<String> shallowChapters = bookShallowCopy.getChapters();
        shallowChapters.set(1, "Chapter 999");

        System.out.println("\n\nPart II, showing the contents of the original book after modifying the values in a shallow copy.");
        System.out.println("Original book:");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getChapters());
        System.out.println("\nCopied book:");
        System.out.println(bookShallowCopy.getAuthor());
        System.out.println(bookShallowCopy.getTitle());
        System.out.println(bookShallowCopy.getChapters());

        // Reset all variable fields
        title = "Book Title";
        author = "Book Author";
        chapters = new ArrayList<String>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");


        book = new BookDeepCopy(title, author, chapters);
        Book bookDeepCopy = book.clone();
        bookDeepCopy.setTitle("New book title");
        bookDeepCopy.setAuthor("New book author");
        ArrayList<String> deepChapters = bookDeepCopy.getChapters();
        deepChapters.set(1, "Chapter 999");

        System.out.println("\n\nPart III, showing the contents of the original book after modifying the values in a deep copy.");
        System.out.println("Original book:");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getChapters());
        System.out.println("\nCopied book:");
        System.out.println(bookDeepCopy.getAuthor());
        System.out.println(bookDeepCopy.getTitle());
        System.out.println(bookDeepCopy.getChapters());
    }
}