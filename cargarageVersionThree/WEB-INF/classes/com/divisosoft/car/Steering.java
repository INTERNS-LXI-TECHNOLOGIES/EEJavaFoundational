package com.divisosoft.car;
public class Steering 
{
 String colour;

 public Steering(String colour)
 {
    this.colour = colour;
 }

 public void setColour(String colour)
 {
    this.colour = colour;
 } 

 public String getColour()
 {
    return colour;
 }

 public String toString()
 {
 String toString="My Steering Colour is: "+colour;
 return toString;
 } 
}
