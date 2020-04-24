package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Word w=new Word();
		SqlRepository sqlRepo=new SqlRepository();
		String word=request.getParameter("word");
		String meaning=request.getParameter("meaning");
		w.setWord(word);
		w.setMeaning(meaning);
		sqlRepo.insertWord(w);
		request.setAttribute("words",w);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}