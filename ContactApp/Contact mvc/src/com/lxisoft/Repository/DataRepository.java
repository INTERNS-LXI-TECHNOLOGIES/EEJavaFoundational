package com.lxisoft.Repository;
import com.lxisoft.Domain.Contact;
import com.lxisoft.Model.SortName;
import java.io.*;
import java.util.*;
import java.sql.*;
public class DataRepository  
{
  public void display(){
  	  try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
    //here sonoo is database name, root is username and password  
    Statement stmt=con.createStatement();  
    
    ResultSet rs=stmt.executeQuery("select * from contactlist");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
  }
  public void add(Contact c)
   {
  try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");   
    Statement stmt=con.createStatement();  
    stmt.executeUpdate("insert into contactlist(name,number) values(  '"+c.getName()+"','"+c.getNumber()+"')");  
    con.close();  
    }catch(Exception e){ System.out.println(e);} 
   }


   // public String edit(String name,String newname,String newnumber)
   // {
   //  try{
   //      Class.forName("com.mysql.jdbc.Driver");  
   //      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
   //      Statement stmt=con.createStatement();
   //      if(newname==null)
   //      {
   //        stmt.executeUpdate("update contactlist set name ='"+newname+"' where name = '"+name+"'");
   //      //ResultSet rs = stmt.executeQuery("select * from contactlist");

   //      //while(rs.next())

   //      con.close();
   //     }
   //     }catch(Exception e){System.out.println(e);}
   // }
   public void editByName(String name,String newname)
   {
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
        Statement stmt=con.createStatement();
        stmt.executeUpdate("update contactlist set name ='"+newname+"' where name = '"+name+"'");
        con.close();
       }catch(Exception e){System.out.println(e);}
   }

   public void editByNumber(String name,String newnumber)
   {
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
        Statement stmt=con.createStatement();
        stmt.executeUpdate("update contactlist set number ='"+newnumber+"' where name = '"+name+"'");
        con.close();
       }catch(Exception e){System.out.println(e);}
   }
   public void delete(String name)
   {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","root");  
        Statement stmt=con.createStatement();
        stmt.executeUpdate("delete from contactlist where name = '"+name+"'");
        con.close();
       
    }catch(Exception e){}
   }
}