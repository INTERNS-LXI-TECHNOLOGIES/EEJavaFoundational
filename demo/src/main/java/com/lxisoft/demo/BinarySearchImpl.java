package com.lxisoft.demo;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers,int numberToSearch)
	{
		//BubbleSort bubbleSort=new BubbleSort();
		int[] sortedNumbers=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
