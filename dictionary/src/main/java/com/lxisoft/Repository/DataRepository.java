package com.lxisoft.Repository;
//import com.lxisoft.Domain.*;
import com.lxisoft.Model.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class DataRepository  
{
  
  public ArrayList <Dictionary> displayAll()
  {   ArrayList <Dictionary> wordList = new ArrayList <Dictionary>();   
  	  try{ 
        
          Class.forName("com.mysql.jdbc.Driver");  
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");  
          Statement stmt=con.createStatement();  
          ResultSet rs=stmt.executeQuery("select * from word");  
      
        while(rs.next()) 
          {
            Dictionary d = new Dictionary();
            d.setNo(rs.getInt("NO"));
            d.setWord(rs.getString("WORD"));
            d.setMeaning(rs.getString("MEANING"));
            wordList.add(d);
          }
           con.close();  
          }catch(Exception e){ System.out.println(e);}  
          return wordList;
  }
 

  public Dictionary add(Dictionary d)
   {
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");   
        Statement stmt=con.createStatement();  
        stmt.executeUpdate("insert into contactlist(name,number) values(  '"+d.getWord()+"','"+d.getMeaning()+"')");  
        con.close();  
       }catch(Exception e){ System.out.println(e);} 
     return c;
   }
}
