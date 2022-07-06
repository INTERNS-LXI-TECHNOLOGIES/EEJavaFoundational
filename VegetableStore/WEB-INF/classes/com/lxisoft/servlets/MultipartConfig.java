package com.lxisoft.servlets;

public @interface MultipartConfig {

 int fileSizeThreshold();

 String location();

 int maxFileSize();

 int maxRequestSize();

}
