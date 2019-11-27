package com.lxisoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSort());
		int result=binarySearch.binarySearch(new int[] {10,7,4,9},5);
		System.out.println(result);
		
		//SpringApplication.run(DemoApplication.class, args);
	}

}
