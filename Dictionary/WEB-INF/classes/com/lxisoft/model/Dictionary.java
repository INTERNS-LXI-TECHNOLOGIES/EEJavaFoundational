package com.lxisoft.model;
public class Dictionary {

    protected int id;
    protected String word;
    protected  String meaning;

    public Dictionary() {
    }
    public Dictionary ( String word, String meaning ){

        super();

        this.word = word;
        this.meaning = meaning;
    }

    public Dictionary(int id, String word, String meaning) {
        super();
        this.id = id;
        this.word = word;
        this.meaning = meaning;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getWord() {

        return word;
    }
    public void setWord(String word) {

        this.word = word;
    }
    public String getMeaning() {

        return meaning;
    }

    public void setMeaning(String meaning) {

        this.meaning = meaning;
    }
}