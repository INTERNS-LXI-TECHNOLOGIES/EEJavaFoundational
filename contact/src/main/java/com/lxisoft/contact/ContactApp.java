package com.lxisoft.contact;



import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ContactApp")
public class ContactApp extends HttpServlet
{
String url = "jdbc:mysql://localhost:3306/contacts";
String user = "root";
String pass = "Jayaram";

public void init(HttpServletRequest request,HttpServletResponse responce)
{

}
public void doPost(HttpServletRequest request,HttpServletResponse responce) throws IOException
{ 
       
    Create(request,responce);
}

public void Create(HttpServletRequest request,HttpServletResponse responce)throws IOException
{
    try{

    Contact contact = new Contact();
String name = request.getParameter("name");
long con = Long.parseLong(request.getParameter("contactNumber"));

contact.setName(name);
contact.setContactNumber(con);
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection(url, user, pass);
String query = "insert into contactinfo (name,contactNumber) values (?,?)";
PreparedStatement sta = connection.prepareStatement(query);

sta.setString(1,contact.getName());
sta.setLong(2,contact.getContactNumber());
sta.executeUpdate();

 PrintWriter out = responce.getWriter();
            out.println("Contact added successfully!");

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

