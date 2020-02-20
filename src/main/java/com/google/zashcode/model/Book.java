package com.google.zashcode.model;

public class Book {

    private int id;

    private int score;

    private int num;

    public Book(int id, int score) {
        this.id = id;
        this.score = score;
        this.num = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNum() {
        return num;
    }

    public void count() {
        this.num++;
    }

}
