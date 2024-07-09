package com.lxisoft.contact2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Contact
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String secondName;
    private  int number;

    public long getId() 
    {
        return id;
    }

    public void setId(long id) 
    {
        this.id = id;
    }

    public void setFirstName(String name)
    {
        firstName = name;
    }

    public String getFirstName()
    {
        return firstName;
    }


    public void setSecondName(String secondName) 
    {
        this.secondName = secondName;
    }

    public String getSecondName() 
    {
        return secondName;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public int getNumber() 
    {
        return number;
    }



}