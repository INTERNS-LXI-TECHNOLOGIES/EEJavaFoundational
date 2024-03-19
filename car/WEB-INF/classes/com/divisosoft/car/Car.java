package com.divisosoft.car;
import java.io.InputStream;
public class Car{
    private String name;

    private InputStream fileData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getFileData() {
        return fileData;
    }
 
    public void setFileData(InputStream fileData) {
        this.fileData = fileData;
    }
}