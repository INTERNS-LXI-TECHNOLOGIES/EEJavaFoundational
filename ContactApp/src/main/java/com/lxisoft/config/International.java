package com.lxisoft.config;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class International
{
	public  String getData(String key,String lang)
	{
		ResourceBundle bundle = ResourceBundle.getBundle("text", Locale.US);
		System.out.println("Message in " + Locale.US + ": " + bundle.getString("greeting"));
	}
}
