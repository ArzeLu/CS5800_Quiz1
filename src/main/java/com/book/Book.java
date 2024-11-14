package com.book;

import java.util.ArrayList;

public class Book implements Cloneable{
    protected String title;
    protected String author;
    protected ArrayList<String> chapters;
    
    public Book(String title, String author, ArrayList<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setChapters(ArrayList<String> chapters) {
        this.chapters = chapters;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public ArrayList<String> getChapters() {
        return chapters;
    }
    
    @Override
    public Book clone() {
        return new Book(title, author, chapters);
    }
}
