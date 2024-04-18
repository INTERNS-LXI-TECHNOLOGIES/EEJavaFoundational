package com.lxisoft.school;

import java.io.InputStream;

public class School
{
private int id;
private String name;
private InputStream img;  

public void setId(int id)
{
this.id = id;
}

public int getId()
{
  return id;
}
public void setName(String name)
{
this.name = name;
}

public String getName()
{
return name;
}

public void setInputstream(InputStream img)
{
  this.img = img;
}

public InputStream getInputstream()
{
    return img;
}


}