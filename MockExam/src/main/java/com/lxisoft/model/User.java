package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class User
{
private String name,password;
private int id;

public void setId(int id)
    {
        this.id = id;
    }

public void setName(String name)                               
    { 
        this.name = name; 
    } 
public void setPassword(String password)                               
    { 
        this.password = password; 
    }   
public int getId()
    {
        return id;
    }
public String getName()  
    { 
        return name; 
    }    
public String getPassword()
    {
        return password;
    }                           

}
