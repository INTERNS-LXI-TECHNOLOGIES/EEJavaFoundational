package com.lxisoft.servlets;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import com.lxisoft.dao.VegetableDao;
import com.lxisoft.vegetable.Vegetable;


public class CreateAndDeleteVegetableServlet extends HttpServlet {

public CreateAndDeleteVegetableServlet() {
	
	super();
	
}
	VegetableDao vegetableDao = new VegetableDao();
	
protected void doGet(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException
{

	int id = Integer.parseInt(request.getParameter("id"));
	System.out.println("Delete method working");
	
	try {
	
	vegetableDao.deleteVegetable(id);
	
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	response.sendRedirect("vegetable-list");

		}


protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
{

	System.out.println("add method working");
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/addVegetable.jsp");
	requestDispatcher.forward(request, response);


	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String stock = request.getParameter("stock");
	String orderQuantity = request.getParameter("orderQuantity");
	
	Vegetable veg = new Vegetable();
	
	veg.setName(name);
	veg.setPrice(price);
	veg.setStock(stock);
	veg.setOrderQuantity(orderQuantity);
	
try{
	vegetableDao.addVegetable(veg);
}catch(Exception e)  {
	e.printStackTrace();
}
	
	RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("jsp/vegetableConform.jsp");
	  requestDispatcher.forward(request, response);
}


}


