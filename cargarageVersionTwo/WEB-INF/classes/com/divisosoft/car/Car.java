package com.divisosoft.car;
public class Car
{
 private String name;
 private String model;
 
public Car()
{
}
	

 public Car(String name,String model)
{
    this.name = name;
    this.model = model;
}    

public void setName(String name)
{
    this.name=name;
}

public String getName()
{
    return name;
}

public void setModel(String model)
{
    this.model=model;
}

public String getModdel()
{
    return model;
}

public String toString()
{
    String toString = "Car name is: "+name+"      "+"\n Car moddel is: "+model;
    return toString;
}

}