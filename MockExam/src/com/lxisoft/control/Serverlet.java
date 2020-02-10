package com.lxisoft.control.Serverlet;
import java.io.IO.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Serverlet extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
  	 response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Result";
       out.println("<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n" +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor = \"#f0f0f0\">\n" +
         "<h1 align = \"center\">" + title + "</h1>\n");
  }