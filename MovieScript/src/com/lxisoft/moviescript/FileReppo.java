package com.lxisoft.moviescript;
import java.io.*;

import java.util.Scanner;

public class FileReppo{

	public void fileCreation(){
		File file = new File("new file.txt");
		 try {
	    	
	  	file.createNewFile();
	  }
	  catch(Exception ex){
	  	System.out.println(" "+ex);
	  }
	}

	public void writeToFile(String name){
		try{
		FileWritter mywritter=new FileWritter("Result.txt",true);
		mywritter.write(name+" wins\n");
		myWritter.close();
		}catch(IOException e){
			System.out.println("ERROR");
			
		}
	}

}