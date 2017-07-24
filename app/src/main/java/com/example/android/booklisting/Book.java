package com.example.android.booklisting;

import java.net.URL;

/**
 * Created by Soumya on 01-07-2017.
 */

public class Book {
    private String mAuthor;
    private String mTitle;
    private String mUrl;

    public Book(String author, String title, String url) {
        mAuthor = author;
        mTitle = title;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}
