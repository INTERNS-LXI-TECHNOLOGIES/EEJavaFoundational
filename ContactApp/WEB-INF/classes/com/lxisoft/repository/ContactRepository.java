package com.lxisoft.repository;
import com.lxisoft.servlet.*;
import com.lxisoft.model.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class ContactRepository
{  
   Connection con = null;
  ResultSet rs= null;
  Statement stmt = null;
  PreparedStatement ps = null;
  Contact contact = new Contact();
  public void createDatabaseConnection()
  {
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
      try
      {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactapp","root","password"); 
      }
      catch(SQLException e)
      {
        e.printStackTrace();    
      }
      
    }
    catch(ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
  public void addToDatabase(Contact contact)
  {
    createDatabaseConnection();
    try
    {
         PreparedStatement ps=con.prepareStatement("insert into contactapp(FirstName,LastName,MailID,Number) values('"+contact.getFirstName()+"','"+contact.getLastName()+"','"+contact.getMailId()+"','"+contact.getNumber()+"')");       
         int a=ps.executeUpdate();

      ps.close();
      con.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }

  public void viewDatabase(Contact contact)
  {
    createDatabaseConnection();
    try
    {
         Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from contactapp");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) 
       {
        String fname =rs.getString("FirstName");
        String lname =rs.getString("LastName");
        String mailid =rs.getString("MailID");
        String number =rs.getString("Number");
        }
        }
     catch(Exception e)
     {
      
     }
  }

  public void searchDatabase(String name)
  {
    createDatabaseConnection();
    try
    {
       Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from contactapp where FirstName = '"+name+"'");
       ResultSet rs = ps.executeQuery();
       while (rs.next())
      {  
        int id =rs.getInt("id");
        String fname =rs.getString("FirstName");
        String lname =rs.getString("LastName");
        String mailid =rs.getString("MailID");
        String number =rs.getString("Number");
       } 
    }
     catch (Exception e)
     {
      
     }
  }

  public void deleteRecord(String name)
  {
    createDatabaseConnection();
    try
    {
         String sql = "delete from contactapp where FirstName ='"+name+"'";
         stmt = con.createStatement();
         stmt.executeUpdate(sql);
         stmt.close();
         con.close();
   }
     catch(Exception e)
     {
      
     }
  }
}