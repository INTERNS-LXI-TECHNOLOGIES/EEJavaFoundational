  package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
   //what are beans? 
	//what are the dependencies of the beans? 
	//where to search for beans?
	public static void main(String[] args) {
		
	//	BinarySearch bS=new BinarySearch(new LinearSort());
		ApplicationContext aC=SpringApplication.run(DemoApplication.class, args);
		BinarySearch bS=aC.getBean(BinarySearch.class); 
		int result=bS.search(new int[] {1,2,3,4,5,6}, 1);
		if(result>=0)
			System.out.println("Element found at "+result);
		else
			System.out.println("Element not Found!!");
	 
	}

}
 