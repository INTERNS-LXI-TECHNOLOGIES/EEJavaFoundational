package com.divisosoft.movie;

public class Movie
{
    String name ;
    int year ;
    String hero ;
    String heroine;
    String villan;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getHero() {
        return hero;
    }
    public void setHero(String hero) {
        this.hero = hero;
    }
    public String getHeroine() {
        return heroine;
    }
    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }
    public String getVillain() {
        return villan;
    }
    public void setVillain(String villain) {
        this.villan = villain;
    }

    @Override
    public String toString() {
        return "Movie name = " + name + ", year = " + year + ", hero = " + hero + ", heroine = " + heroine + ", villain = "
                + villan ;
    } 
}