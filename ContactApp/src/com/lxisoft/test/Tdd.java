package com.lxisoft.test;
import com.lxisoft.controller.ContactControler;
/**
* TEST DRIVEN DESIGN
*/
public class Tdd
{
	/**
	* @param args[] command line Arrgument
	*/
	public static void main(String[] args)
	{
		ContactControler controler = new ContactControler();
		controler.contactApp(); 
	}
}