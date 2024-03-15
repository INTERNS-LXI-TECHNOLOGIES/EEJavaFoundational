package com.lxisoft.contact;


import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteContact")
public class DeleteContact extends HttpServlet{

    String url = "jdbc:mysql://localhost:3306/contacts";
    String user = "root";
    String pass = "Jayaram";

    public void doPost(HttpServletRequest request,HttpServletResponse responce) throws IOException
    { 
        Contact contact = new Contact();
        long a = Long.parseLong(request.getParameter("number"));
         contact.setContactNumber(a);
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conect = DriverManager.getConnection( url,user, pass);
         
             String query ="delete from contactinfo  where contactNumber =?"; 
             PreparedStatement pre = conect.prepareStatement(query);
             pre.setLong(1,contact.getContactNumber());
             pre.executeUpdate();
       responce.getWriter().println("Delete Successfully");
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
    }

}