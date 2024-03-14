package com.divisosoft.studentapp;

public class Student{
    
    private String name;
    private char gender;
    private int age;
    private int mark;
    private int id;
    
    public Student() {
    }

    public Student(String name, char gender, int age, int mark) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char  gender) {
        this.gender = gender;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}