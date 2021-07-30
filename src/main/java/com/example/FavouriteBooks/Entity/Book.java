package com.example.FavouriteBooks.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    int id;
    String name;
    String detail;

    public Book(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("detail") String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
