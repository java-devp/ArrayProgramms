package com.nt.solution;

public class MaximumDifference {
	public static void main(String[] args) {
		int arr[]= {9,7,5,6,4,3};
		int a=arr[0];
		int b=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
			else if(arr[i]<a);
			    b=arr[i];
		}
		System.out.println("Maximum no is ::"+a);
		System.out.println("Minimum no is ::"+b);
		 System.out.println("Maximum differnce detween max and min");
		System.out.println(a-b);
	}

}
