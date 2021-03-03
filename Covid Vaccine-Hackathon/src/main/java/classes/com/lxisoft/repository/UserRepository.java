package com.lxisoft.repository;
import com.lxisoft.servlet.*;
import com.lxisoft.model.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class UserRepository
{  
   Connection con;
  ResultSet rs= null;
  Statement stmt = null;
  PreparedStatement ps = null;
  ArrayList<Userdetails> user = new ArrayList<Userdetails>();
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
  public void addToDatabase(String name,String age,String address,String email,String number,String blood)
  {
    createDatabaseConnection();
    try
    {
         PreparedStatement ps=con.prepareStatement("insert into patient(Name,Age,Address,MailID,Number,BloodGroup) values(?,?,?,?,?,?)");       
         ps.setString(1,name);
         ps.setString(2,age);
         ps.setString(3,address);
         ps.setString(4,email);
         ps.setString(5,number);
         ps.setString(6,blood);
            
      int a=ps.executeUpdate();
    

      ps.close();
      con.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }

  public ArrayList<Userdetails> viewDatabase()
  {
    user.clear();
    createDatabaseConnection();
    try
    {
         Statement stmt = con.createStatement();
       PreparedStatement ps =con.prepareStatement("select * from patient");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) 
     {
        Userdetails userdetails = new Userdetails(); 
      userdetails.setID(rs.getInt("id"));
      userdetails.setName(rs.getString("Name"));  
      userdetails.setAge(rs.getString("Age"));
      userdetails.setAddress(rs.getString("Address"));
      userdetails.setMailId(rs.getString("MailID"));
      userdetails.setNumber(rs.getString("Number"));
      userdetails.setBloodGroup(rs.getString("BloodGroup"));
      user.add(userdetails);
      
     }
     stmt.close();
   }
     catch(Exception e)
   {
      e.printStackTrace();
    }
    return user;
  }

  public void updateDatabase(String id,String name,String age,String address,String email,String number,String blood)
  {
    
    createDatabaseConnection();
    try
    {
      Statement stm = con.createStatement();
      ps = con.prepareStatement("update patient  set Name=?,Age=?,Address=?,MailID=?,Number=?,BloodGroup=? where id=?");
      ps.setString(7,id);
      ps.setString(1,name);
      ps.setString(2,age);
      ps.setString(3,address);
      ps.setString(4,email);
      ps.setString(5,number);
      ps.setString(6,blood);
      


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
       PreparedStatement ps =con.prepareStatement("select * from patient where Name = '"+name+"'");
       ResultSet rs = ps.executeQuery();
       while (rs.next())
      {  
        int id =rs.getInt("id");
        String fname =rs.getString("Name");
        String age =rs.getString("Age");
        String address =rs.getString("Address");
        String mailid =rs.getString("MailID");
        String number =rs.getString("Number");
        String blood =rs.getString("BloodGroup");
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
         String sql = "delete from patient whereName ='"+name+"'";
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