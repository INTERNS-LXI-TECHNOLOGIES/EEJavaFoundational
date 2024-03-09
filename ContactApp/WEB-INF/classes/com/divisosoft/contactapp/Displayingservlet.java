package com.divisosoft.contactapp;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

@WebServlet("/Displayingservlet")
public class Displayingservlet extends HttpServlet{

    Connection connection;
    List<Contact> contactList;
    int firstIndex;
    int lastIndex;

    public void init(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/contact";
            String username= "root";
            String password = "Magesh@96";
            connection = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException,IOException{
        
        try{
            contactList=new ArrayList<>();
           // int a =0;
           String a =request.getParameter("page");
           if(a!=null){
                firstIndex=Integer.parseInt(a)*10;
                lastIndex=10;
           }
            String readContactQuery = "SELECT * FROM contacttable LIMIT ?,?";
            PreparedStatement psReadQuery = connection.prepareStatement(readContactQuery);
            psReadQuery.setInt(1, firstIndex);
            psReadQuery.setInt(2, lastIndex);
            ResultSet result = psReadQuery.executeQuery();
            while(result.next()){
            
                Contact contact = new Contact();
                int cid = result.getInt("id");
                String cName = result.getString("name");
                long cphone = result.getLong("phonenumber");
                String email = result.getString("email");
                contact.setId(cid);
                contact.setName(cName);
                contact.setPhonenumber(cphone);
                contact.setEmail(email);
                contactList.add(contact);
            }

            request.setAttribute("contactList", contactList);
            RequestDispatcher dp= request.getRequestDispatcher("display.jsp");
            dp.forward(request, response);
        
        }
        catch(SQLException e){
            e.printStackTrace();
        }
      
        

    }

}