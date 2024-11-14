package com.book;

import java.util.ArrayList;

public class BookDeepCopy extends Book{
    public BookDeepCopy(String title, String author, ArrayList<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Book clone(){
        String newTitle = title;
        String newAuthor = author;
        ArrayList<String> newChapters = new ArrayList<>();
        for(String chapter : chapters){
            newChapters.add(chapter);
        }
        return new Book(newTitle, newAuthor, newChapters);
    }
}