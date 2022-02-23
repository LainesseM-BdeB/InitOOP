package com.company;

public class Article {
    protected String code;
    protected boolean available = false;
    static int nbArticle = 0;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Article() {
        nbArticle++;
    }

    protected void setCode(String code) {
        this.code = code;
    }

    protected String getCode() {
        return this.code;
    }

    protected void printInfo() {

    }

}
