package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
@Autowired 
	private SortAlgorithm sA;
public BinarySearch(SortAlgorithm sA) {
	super();
	this.sA=sA;
}

	public int search(int a[],int e) {
		//Sorting the given array
	 
		a=sA.sort(a);
		int res=-1;
		//Binary sorting using middle partition is not implemented yet!!
		for (int i = 0; i < a.length; i++) {
			//search the element
			if(a[i]==e) {
				res=i;
			}
		}
		//return the location or index
		return res;
	}
	}
