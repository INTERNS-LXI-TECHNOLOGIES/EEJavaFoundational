package com.lxisoft.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.model.*;
import com.lxisoft.Repository.*;
import java.util.*;
import java.sql.*;

public class ViewServlet extends HttpServlet 
{
	private MySqlRepository repo=new MySqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{

            ArrayList<W_Dictionary> list=repo.getAllWords();
            DictionaryModel listmodel;
            WordList model=new WordList();
            if(list!=null)
            { 
              for(int i=0;i<list.size();i++)
              {
                listmodel=new DictionaryModel();
                listmodel.setWord(list.get(i).getWord());
                model.setWordList(listmodel);
              }
            }
            ArrayList<DictionaryModel> wordlist=model.getWordList();


            HttpSession session=request.getSession();
            session.setAttribute("wordlist",wordlist);
            RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
        	  rd.forward(request,response);
           }catch(Exception n)
          {
             n.printStackTrace();
          }
    	}


}