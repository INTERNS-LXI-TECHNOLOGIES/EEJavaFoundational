package com.lxisoft.contacts.controller;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.contacts.domain.*;
import com.lxisoft.contacts.controller.*;
@Controller
public class displayController 
{
	
	@Autowired
    repoController repo;
	ArrayList<Contact> words;
	@RequestMapping("/viewall")
	public ModelAndView display(HttpServletRequest request,HttpServletResponse response)
	{
		words=repo.getWords();
		request.setAttribute("asd","kkkk");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Dis.jsp");
		String j="dfghj";
		mv.addObject("arraylist",words);
		return mv;
	}
	@RequestMapping("/addnew")
	public ModelAndView add()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addnew.jsp");
		return mv;
	}
}
