package com.zero.domain;

/**
 * Created by liyanyong on 2017/12/25.
 */
public class ZeroResouce {
    public String author;
    public String title;
    public String url;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ZeroResouce() {
        super();
    }

    public ZeroResouce(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
