package com.divisosoft.car;
public class Door 
{
 String brandName;

 public Door(String brandName)
 {
    this.brandName = brandName;
 }

 public void setBrandName(String brandName)
 {
    this.brandName = brandName;
 }

 public String getBrandName()
 {
    return brandName;
 }

 public String toString()
 {
    String toString ="My Door BrandName is: "+brandName;
    return toString;
 }  
}
