package com.book;

import java.util.ArrayList;

public class BookShallowCopy extends Book{
    public BookShallowCopy(String title, String author, ArrayList<String> chapters) {
        super(title, author, chapters);
    }

    @Override
    public Book clone(){
        return new BookShallowCopy(title, author, chapters);
    }
}
