package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;
import com.lxisoft.domain.*;

public class ShowAllServlet extends HTTPServlet
{
	Repository repository=new DbRepository();

	doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList<Contact> contactList=repository.findAll();

	}
}