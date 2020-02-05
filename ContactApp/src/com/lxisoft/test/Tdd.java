package com.lxisoft.test;
import com.lxisoft.controller.ContactControler;
/**
* TEST DRIVEN DESIGN
*/
public class Tdd
{
	/**
	* @param args[]
	*/
	public static void main(String[] args)
	{
		ContactControler controler = new ContactControler();
		controler.displayOrAddContact(); 
	}
}