package com.divisosoft.studentid;

import java.io.InputStream;

public class Student {
    private String name;
    private InputStream photo; 
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }


}
