package com.lxisoft.model;
public class Word {

    protected int id;
    protected String word;
    protected  String meaning;

    public Word() {
    }
    public Word ( String word, String meaning ){

        super();

        this.word = word;
        this.meaning = meaning;
    }

    public Word(int id, String word, String meaning) {
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