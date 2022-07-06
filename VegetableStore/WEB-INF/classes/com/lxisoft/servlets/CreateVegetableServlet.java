package com.lxisoft.servlets;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.Part;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import com.lxisoft.dao.VegetableDao;
import com.lxisoft.vegetable.Vegetable;

@MultipartConfig(location="/add-vegetable", fileSizeThreshold=1024*1024, 
    maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class CreateVegetableServlet extends HttpServlet {

public CreateVegetableServlet() {
	
	super();
	
}
	
protected void doGet(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException
{
	
	response.getWriter().append("served at:").append(request.getContextPath());

	RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/addVegetable.jsp");
	requestDispatcher.forward(request, response);


		}


protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
{

	VegetableDao vegetableDao = new VegetableDao();

	System.out.println("add method working");

String	name = request.getParameter("name");
	String price = request.getParameter("price");
	 String stock = request.getParameter("stock");
	 String orderQuantity = request.getParameter("orderQuantity");
 javax.servlet.http.Part image = request.getPart("image");

	if(image != null){


System.out.println(image.getName());
System.out.println(image.getSize());
System.out.println(image.getContentType());


	}
 InputStream inputStream  = image.getInputStream();
		System.out.println(image);



	Vegetable veg = new Vegetable();


	veg.setName(name);
	veg.setPrice(price);
	veg.setStock(stock);
	veg.setOrderQuantity(orderQuantity);
	//veg.setImage(inputStream);
	
try{
	vegetableDao.addVegetable(veg,inputStream);
}catch(Exception e)  {
	e.printStackTrace();
}
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/vegetableConform.jsp");
	  requestDispatcher.forward(request, response);
}

}


