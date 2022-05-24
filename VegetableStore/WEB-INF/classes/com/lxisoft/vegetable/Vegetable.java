
package com.lxisoft.vegetable;



public class Vegetable {
 
private String name;
private double price;
private double stock;
private double orderQuantity;


public Vegetable(String name,double price, double stock, double orderQuantity) {

this.name = name;
this.price = price;
this.stock = stock;
this.orderQuantity = orderQuantity;


}



public String getName() {

 return name;
}
public void setName(String name)  {

this.name = name;
}     


public double getPrice() {

 return price;
}
public void setPrice(double price)  {

this.price = price;
}  


public double getStock() {

 return stock;
}
public void setStock(double stock)  {
 
this.stock = stock;
}  


public double getOrderQuantity() {

 return orderQuantity;
}
public void setOrderQuantity(double orderQuantity)  {

this.orderQuantity = orderQuantity;  
}  



}