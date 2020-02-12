package com.lxisoft.control;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Serverlet extends HttpServlet 
{ 
  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 // response.setContentType("text/html");
       PrintWriter out = response.getWriter();
     public ArrayList<String>name=new ArrayList<String>();
     name.add("one");
     name.add("two");
     name.add("three");
     name.add("four");
     for(int i=0;i<4;i++)
     {
     	out.println(name.get(i));
     }
  }
}