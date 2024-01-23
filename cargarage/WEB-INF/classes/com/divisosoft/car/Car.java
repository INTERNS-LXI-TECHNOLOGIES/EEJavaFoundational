public class Car
{
 private String name;
 private String model;
 private String colour;

 public Car(String name,String model,String colour)
{
    this.name = name;
    this.model = model;
    this.colour = colour;
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

public void setColour(String colour)
{
    this.colour=colour;
}

public String getColour()
{
    return colour;
}

public String toString()
{
    String toString = "Car name is: "+name+"Car moddel is: "+model+"Car colour is: "+colour;
    return toString;
}

}