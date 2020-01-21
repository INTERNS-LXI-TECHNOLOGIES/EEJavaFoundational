package com.lxisoft.controller;
import java.util.Scanner;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
public class Controller
{
	public void activities()
	{
		View view=new View();
		view.display();
	}
	public void displayContacts()
	{
		
	}
	public void createNewContact()
	{
		Model model=new Model();
		Scanner scr=new Scanner(System.in);
        System.out.println("write name :");
        String name=scr.next();
        System.out.println("write number :");
        String number=scr.next();
        model.setDetails(name,number);
		

	}
	public void selectContact()
	{
		
	}
	

}