
package com.lxisoft.vegetable;



public class Vegetable {
 
private String name;
private String price;
private String stock;
private String orderQuantity;

public Vegetable() {

}


public Vegetable(String name,String price,String stock, String orderQuantity) {

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


public String getPrice() {

 return price;
}
public void setPrice(String price)  {

this.price = price;
}  


public String getStock() {

 return stock;
}
public void setStock(String stock)  {
 
this.stock = stock;
}  


public String getOrderQuantity() {

 return orderQuantity;
}
public void setOrderQuantity(String orderQuantity)  {

this.orderQuantity = orderQuantity;  
}  



}