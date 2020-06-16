package com.lxisoft.model;
import java.io.*;  
import java.util.*;  

public class User
{
private String name,password,role;
private int id,mark;

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

public void setRole(String role)                               
    { 
        this.role = role; 
    }   

public void setMark(int mark)
    {
        this.mark = mark;
    }
public int getMark()
    {
        return mark;
    }  

public String getRole()
    {
        return role;
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
