package com.example.recyclerviewdemo;

public class Article {
    private String title;
    private String content;
    private int imgCourse;
    private int views;

    public Article(String title, String content, int imgCourse, int views) {
        this.title = title;
        this.content = content;
        this.imgCourse = imgCourse;
        this.views = views;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public int getImgCourse() { return imgCourse; }
    public void setImgCourse(int imgCourse) { this.imgCourse = imgCourse; }
    public int getViews() { return views; }
    public void setViews(int views) { this.views = views; }
}
