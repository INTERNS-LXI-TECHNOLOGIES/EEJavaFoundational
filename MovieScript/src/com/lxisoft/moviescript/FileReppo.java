package com.lxisoft.moviescript;
import java.io.*;
import java.io.File;
import java.io.IOException;


import java.util.Scanner;

public class FileReppo{

	public void fileCreation(){
		try{

			File file=new File("F:\\Program files\\EEJavaFoundational\\MovieScript\\src\\com\\lxisoft\\moviescript\\File1.txt");
			if(file.createNewFile()){
				System.out.println("FILE CREATED:"+file.getName());


			}
			else{
				System.out.println("FILE ALREADY EXITS");
				if(file.exists()){
					System.out.println(" FILE NAME:"+file.getName());
					System.out.println(" ABSOLUTE PATH:"+file.getAbsolutePath());
					System.out.println(" Readable:"+file.canRead());
					System.out.println(" Writtable:"+file.canWrite());
				}
			}
		}
		catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
		



	}

	
}