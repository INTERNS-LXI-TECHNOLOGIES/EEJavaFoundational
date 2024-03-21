package com.lxisoft.student;
import java.io.InputStream;
public class Student {

    private String name;
    private InputStream image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }
}
