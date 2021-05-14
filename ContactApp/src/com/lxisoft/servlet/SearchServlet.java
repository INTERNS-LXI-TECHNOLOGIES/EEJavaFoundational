package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SearchServlet extends HttpServlet{
	public void doGet(HttpServletResponse response,HttpServletRequest request) throws IOException,ServletException{
		String name = request.getParameter("name");

		ContactDatabase contact = new ContactDatabase();
		contact.searchContact(name);
	}
}