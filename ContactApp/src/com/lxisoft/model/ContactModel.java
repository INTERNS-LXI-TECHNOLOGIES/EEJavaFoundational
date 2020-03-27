package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class ContactModel                      
{
private String firstname,lastname,number;
private int id;

public void setId(int id)
    {
        this.id = id;
    }

public void setfirstname(String firstname)                               
    { 
        this.firstname = firstname; 
    } 
                      
public void setlastname(String lastname)
    {
      this.lastname=lastname;
  }
public void setnumber(String number)                       
    {                          
        this.number=number;
    }

public int getId()
    {
        return id;
    }
public String getfirstname()  
    { 
        return firstname; 
    }    
public String getlastname()
    {
        return lastname;
    }   
public String getnumber()
    {
        return number;
    }   

}
