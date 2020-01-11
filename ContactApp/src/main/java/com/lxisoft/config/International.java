package com.lxisoft.config;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class International
{
	public  String getLocale(String word,String lang,String country)
	{
		// Locale.setDefault(new Locale("en", "IN"));
		// ResourceBundle bundle = ResourceBundle.getBundle("contacts",Locale.getDefault());
		// System.out.println("Message in 111" + Locale.getDefault() + ": " + bundle.getString("contacts"));
		Locale.setDefault(new Locale(lang,country));
		ResourceBundle bundle = ResourceBundle.getBundle("text");
		String key=bundle.getString(word);
		System.out.println(" Message in 222" + Locale.getDefault() + ": " + bundle.getString(word));

		// Locale.setDefault(new Locale("en","QN"));
		// bundle = ResourceBundle.getBundle("text");
		// System.out.println(Locale.getDefault()+" Message in 222" + Locale.getDefault() + ": " + bundle.getString("contacts"));

		// Locale.setDefault(new Locale("en","IN"));
		// bundle = ResourceBundle.getBundle("text");
		// System.out.println(Locale.getDefault()+" Message in 222" + Locale.getDefault() + ": " + bundle.getString("contacts"));

		return key;
	}
}
