package org.my.news.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class News {

    private String text;

    private String author;

    @JsonFormat(pattern="yyyy-MM-dd / hh:mm")
    private LocalDateTime dateTime;

    public News(String text, String author, LocalDateTime dateTime) {
        this.text = text;
        this.author = author;
        this.dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
