package com.Lxisoft.MovieScriptApp;
//import java.io.*;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

import java.util.Scanner;

public class Filecrtn
{

	public void fileCreation()
	{
		try{

			File file = new File("filename.txt");
			if(file.createNewFile())
			{
				System.out.println("FILE CREATED:"+file.getName());


			}
			else{
				System.out.println("FILE ALREADY EXITS");
			}
		}
		catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
		



	}

	
}