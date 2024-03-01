package com.lxisoft.contact;

import java.util.*;

import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ReadC")
public class ReadC extends HttpServlet
{
String url = "jdbc:mysql://localhost:3306/contact";
String user = "root";
String pass = "Jayaram";
public void doGet(HttpServletRequest request,HttpServletResponse responce) throws IOException
{
  

    try{
        
        List<Contact> list = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conect = DriverManager.getConnection( url,user, pass);
try{
    String query ="select * from contactinfo"; 
    PreparedStatement pre = conect.prepareStatement(query);
    ResultSet re = pre.executeQuery();

while(re.next())
{
    Contact con =new Contact();
    con.setName(re.getString("name"));
    con.setContactNumber(re.getLong("contactNumber"));
    list.add(con);
}

request.setAttribute("contact",list);
RequestDispatcher rr = request.getRequestDispatcher("Result.jsp");
rr.forward(request,responce);
}
catch(SQLException e)
{
e.printStackTrace();
}
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
   
}
