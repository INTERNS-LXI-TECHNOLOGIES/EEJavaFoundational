package com.LxiSoft.Movie;
import java.io.File;
import java.io.*;
import java.io.IOException;

public class CreateFile
{
	public void fileMake()
	{
		try
		{
	File file = new File("C:\\home\\arun\\Desktop\\lxi_works1\\EEJavaFoundational\\MovieScript\\src\\com\\LxiSoft\\\\Movie\\dialogues.txt");

	if(file.createNewFile())
	{
		System.out.println("File created"+file.getName());
	}
	else
	{
		System.out.println("File Already Created");
	}

}
catch(IOException e)
{
	System.out.println("An error occured");
   e.printStackTrace();
   }
  }
  }