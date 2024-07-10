package com.lxisoft.app;

import java.io.InputStream;

public class File {
    private String fileName;
    private InputStream fileContent;

    public File(String fileName, InputStream fileContent) {
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    // Getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getFileContent() {
        return fileContent;
    }

    public void setFileContent(InputStream fileContent) {
        this.fileContent = fileContent;
    }
}
