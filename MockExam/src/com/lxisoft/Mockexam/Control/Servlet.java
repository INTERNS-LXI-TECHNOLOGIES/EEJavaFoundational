package com.lxisoft.Control;
import com.lxisoft.Control.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet extends HttpServlet {

    public  void doPost()
    {
    	try
    	{
       	 	String un = request.getParameter("username");
        	String pw = request.getParameter("password");
        }
        catch(Exception e)
        {
        	
        }	
       
    }

}