package com.lxisoft.contact;


import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

//import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateContact")
public class UpdateContact extends HttpServlet{

    String url = "jdbc:mysql://localhost:3306/contact";
    String user = "root";
    String pass = "Jayaram";

    public void doPost(HttpServletRequest request,HttpServletResponse responce) throws IOException
    {
            Contact con = new Contact();
            con.setName((request.getParameter("name")));
            long cc = Long.parseLong(request.getParameter("number"));
            con.setContactNumber(cc);
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection drive = DriverManager.getConnection(url,user,pass);
            String q  = "update contactinfo set name =? where contactNumber = ?";
         PreparedStatement pre = drive.prepareStatement(q);
         pre.setString(1,con.getName());
         pre.setLong(2,con.getContactNumber());
         pre.executeUpdate();
         responce.getWriter().println("Update Successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}