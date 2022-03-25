package com.lxisoft.servlet;

import java.io.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.lxisoft.model.Contact;

import javax.servlet.http.*;  
import javax.servlet.*;  



public class Servlet extends HttpServlet {





     
          private static final long serialVersionUID = 1L;
        p
  
          public Servlet() 
          {
              super();
          }
  
  
          protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
          {
          }
  
  
          protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
          {
              response.setContentType("text/html");
              PrintWriter out=response.getWriter();
  
               String nam = request.getParameter("name"); 
               String pass = request.getParameter("pass"); 
               String email = request.getParameter("emailid"); 
               String phono = request.getParameter("phone");
  
  
          }
  
  
          public  void view() throws ClassNotFoundException
          {
  
              try
              {
                  String sql="select * from Reg";
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine", "root", "android");
                  Statement stmt=con.createStatement();
                  ResultSet rs=stmt.executeQuery(sql);
  
                  while(rs.next())
                  {
                      rs.getString("name");
                      rs.getString("pass");
                      rs.getString("emailid");
                      rs.getString("phoneno");
                     System.out.println(rs.getString("name"));
  
                  }
  
              } 
              catch (SQLException e)
              {
                  e.printStackTrace();
              }
              return;
  
          }
  
          public  String insertuser() throws SQLException
          {
  
              String sql = "insert into Reg(name,pass,emailid,phoneno) values(?,?,?,?)";
              Connection con = null;
              PreparedStatement prep = null;
  
              try
              {
                  Class.forName("com.mysql.jdbc.Driver");
                  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine", "root", "android");
                  prep = con.prepareStatement(sql);
                  prep.setString(1, "nam");
                  prep.setString(2, "pass");
                  prep.setString(3, "email");
                  prep.setString(4, "phono");
                  prep.executeUpdate();
                  prep.close();
  
              } 
              catch (ClassNotFoundException e)
              {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
  
              }
              return "successfully added";
          }
          public  String update() throws SQLException
          {
  
              String sql = "update Reg set pass=?,emailid=?,phoneno=? where name=?";
              Connection con = null;
              PreparedStatement prep = null;
  
              try
              {
                  Class.forName("com.mysql.jdbc.Driver");
                  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine", "root", "android");
                  prep = con.prepareStatement(sql);
                  prep.setString(1, "nam");
                  prep.setString(2, "pass");
                  prep.setString(3, "email");
                  prep.setString(4, "phono");
                  prep.executeUpdate();
                  prep.close();
  
              } 
              catch (ClassNotFoundException e)
              {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
  
              }
              return "successfully update";
          }
  
  public  String delete() throws SQLException
      {
  
          String sql = "delete form Reg where name=?";
          Connection con = null;
          PreparedStatement prep = null;
  
          try
          {
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine", "root", "android");
              prep = con.prepareStatement(sql);
  
          } 
          catch (ClassNotFoundException e)
          {
              e.printStackTrace();
  
          }
          return "successfully delete";
      }





}