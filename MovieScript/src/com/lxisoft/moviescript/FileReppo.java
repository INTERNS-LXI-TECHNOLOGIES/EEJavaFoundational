package com.lxisoft.moviescript;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;


import java.util.Scanner;

public class FileReppo{

	public void fileCreation(){
		File file = new File("newfile.txt");
		 try {
	    	
	  	file.createNewFile();
	  }
	  catch(Exception ex){
	  	System.out.println(" "+ex);
	  }
	}

	

}