package com.lxisoft.model;
public class Word {
    private String words;
    private String meaning;
    public Word(String words, String meaning ){
        this.words = words;
        this.meaning = meaning;
    }
    public String getWords() {

        return words;
    }
    public void setWords(String words) {

        this.words = words;
    }
    public String getMeaning() {

        return meaning;
    }

    public void setMeaning(String meaning) {

        this.meaning = meaning;
    }
}