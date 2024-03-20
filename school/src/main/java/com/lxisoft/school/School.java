package com.lxisoft.school;

import java.io.InputStream;

public class School
{
private String name;
private InputStream img;  

public void setName(String name)
{
this.name = name;
}

public String getName()
{
return name;
}

public void setInputStream(InputStream img)
{
  this.img = img;
}

public InputStream getInputStream()
{
    return img;
}


}