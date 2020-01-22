package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.sqlrepository.*;

public class Display extends HttpServlet
{
	Sqlrepository rep = new Sqlrepository();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{

		ArrayList <Word> wordList = new ArrayList<Word>();
		wordList= rep.read();
		request.setAttribute("wordList",wordList);
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request,response);
					
	}
}  