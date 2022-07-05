
package com.lxisoft.vegetable;

import java.sql.Blob;

public class Vegetable {
 
private int id;
private String name;
private String price;
private String stock;
private String orderQuantity;
private String base64Image;
private Blob image;

public Vegetable() {


}


public Vegetable(String name,String price,String stock, String orderQuantity) {

this.name = name;
this.price = price;
this.stock = stock;
this.orderQuantity = orderQuantity;


}

public Vegetable(int id,String name,String price,String stock, String orderQuantity) {

	this.id = id;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.orderQuantity = orderQuantity;
	
	
	}
public Vegetable(int id,String name,String price,String stock, String orderQuantity,String base64Image) {

	
this.id = id;
this.name = name;
this.price = price;
this.stock = stock;
this.orderQuantity = orderQuantity;
this.base64Image = base64Image;

}




public int getId() {

	 return id;
	}
	public void setId(int id)  {

	this.id = id;
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
 
 
    public String getBase64Image() {
        return base64Image;
    }
 
    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

				public Blob getImage() {

					return image;
				}
				public void setImage(Blob image)  {
			
				this.image= image;
				}     
			

}