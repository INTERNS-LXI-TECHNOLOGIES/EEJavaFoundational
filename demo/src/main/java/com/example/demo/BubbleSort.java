package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort {
	public int[] sort(int[] a) {
		System.out.println("BubbleSort  array");
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				
			if(a[i]<a[j]) {
	         int temp=a[i];
	         a[i]=a[j];
	         a[j]=temp;
			}
		}}
		
		return a;
	}
}
