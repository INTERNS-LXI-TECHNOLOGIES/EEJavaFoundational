package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.model.*;
import com.lxisoft.sqlrepository.*;

public class Add extends HttpServlet
{
	Sqlrepository rep = new Sqlrepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		Word word = new Word();
		word.setWord(request.getParameter("word"));
		word.setMeaning(request.getParameter("meaning"));
		rep.write(word);

		System.out.println("word saved"+word.getWord());
		RequestDispatcher rd = request.getRequestDispatcher("/Display");
		rd.forward(request,response);

	}
}