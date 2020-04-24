package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.model.*;

public class ReadServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		List<WordModel>wordsList=new ArrayList<WordModel>();
		SqlRepository sqlrepo=new SqlRepository();
		WordListModel wlm=new WordListModel();
		List<Word>wordList=sqlrepo.getAllWords(); 
		for(int i=0;i<wordList.size();i++)
		{
			WordModel model=new WordModel();
			model.setId(wordList.get(i).getId());
			model.setWord(wordList.get(i).getWord());
			wlm.setWordsList(model);
		}
		request.setAttribute("wordlist",wlm.getWordsList());
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}