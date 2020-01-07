package com.lxisoft.config;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class International
{
	public  String getLocale(String lang,String country)
	{
		// Locale.setDefault(new Locale("en", "IN"));
		// ResourceBundle bundle = ResourceBundle.getBundle("contacts",Locale.getDefault());
		// System.out.println("Message in 111" + Locale.getDefault() + ": " + bundle.getString("contacts"));

		Locale.setDefault(new Locale("en","QN"));
		ResourceBundle bundle = ResourceBundle.getBundle("text");
		System.out.println(Locale.getDefault()+" Message in 222" + Locale.QN + ": " + bundle.getString("contacts"));

		Locale.setDefault(new Locale(lang,country));
		ResourceBundle bundle = ResourceBundle.getBundle("text");
		System.out.println(Locale.getDefault()+" Message in 222" + Locale.country + ": " + bundle.getString("contacts"));

		Locale.setDefault(new Locale(lang,country));
		ResourceBundle bundle = ResourceBundle.getBundle("text");
		System.out.println(Locale.getDefault()+" Message in 222" + Locale.country + ": " + bundle.getString("contacts"));
		return null;
	}
}
