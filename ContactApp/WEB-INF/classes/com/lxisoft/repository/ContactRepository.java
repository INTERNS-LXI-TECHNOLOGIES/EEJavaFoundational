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
  ArrayList<Contact> contactList = new ArrayList<Contact>();
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

  public ArrayList<Contact> viewDatabase()
  {
    createDatabaseConnection();
    contactList.clear();
    try
    {
         Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from contactapp");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) 
     {
        Contact contact = new Contact();  
      contact.setID(rs.getInt("id"));
      contact.setFirstName(rs.getString("name"));  
      contact.setLastName(rs.getString("lastname"));
      contact.setMailId(rs.getString("email"));
      contact.setNumber(rs.getString("number"));
      contactList.add(contact);

     }
   }
     catch(Exception e)
   {
      
    }
    return contactList;
  }

  public void updateDatabase(String id,String name,String lastname,String email,String number)
  {
    
    createDatabaseConnection();
    try
    {
      Statement stm = con.createStatement();
      ps = con.prepareStatement("update contactapp where id ='"+id+"' set FirstName=?,LastName=?,MailID=?,Number=?");
      ps.setString(1,id);
      ps.setString(2,name);
      ps.setString(3,lastname);
      ps.setString(4,email);
      ps.setString(5,number);
      


    ps.executeUpdate();
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

  public void deleteRecord(String id)
  {
    createDatabaseConnection();
    try
    {
         String sql = "delete from contactapp where id ='"+id+"'";
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