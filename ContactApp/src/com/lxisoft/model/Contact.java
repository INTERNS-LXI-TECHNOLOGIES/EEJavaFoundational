package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class Contact
{
private String firstname,lastname,number;
private int id;

public void setId(int id)
    {
        this.id = id;
    }

public void setFirstname(String firstname)                               
    { 
        this.firstname = firstname; 
    } 
                      
public void setLastname(String lastname)
    {
      this.lastname=lastname;
  }
public void setNumber(String number)                       
    {                          
        this.number=number;
    }

public int getId()
    {
        return id;
    }
public String getFirstname()  
    { 
        return firstname; 
    }    
public String getLastname()
    {
        return lastname;
    }   
public String getNumber()
    {
        return number;
    }   

}
