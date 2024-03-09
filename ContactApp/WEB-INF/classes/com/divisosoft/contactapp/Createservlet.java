package com.divisosoft.contactapp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;


@WebServlet("/Createservlet")
public class Createservlet extends HttpServlet{
   
    private Connection connection;

    public void init(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/contact";
            String username ="root";
            String password = "Magesh@96";
            connection = DriverManager.getConnection(url, username, password);
            
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
     try{
        Contact con = this.createContact(request,response);
        String addingQuery = "INSERT INTO contacttable(name,phonenumber,email) VALUES(?,?,?)";
        PreparedStatement psAddQuery = connection.prepareStatement(addingQuery);
        psAddQuery.setString(1, con.getName());
        psAddQuery.setLong(2, con.getPhonenumber());
        psAddQuery.setString(3, con.getEmail());
        psAddQuery.executeUpdate();
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
        dispatcher.forward(request, response);

     }
     catch(Exception e){
        e.printStackTrace();
     }
      
    }

    public Contact createContact(HttpServletRequest request,HttpServletResponse response){

        Contact contact = new Contact();
        contact.setName(request.getParameter("name"));
        contact.setPhonenumber(Long.parseLong(request.getParameter("phone")));
        contact.setEmail(request.getParameter("mailid"));
        return contact;
    }
    
    
}