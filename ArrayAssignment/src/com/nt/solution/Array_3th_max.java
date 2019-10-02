package com.nt.solution;

public class Array_3th_max {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3,7,2 ,6};
		int a = arr[0];
		int b = arr[0];
		int c = arr[0];
         
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				b=a;
		//	System.out.println("AA "+a);
				a = arr[i];// maximum no.
				
			} 
			else if (arr[i] > b) {
				
				c=b;
		//		System.out.println("BB  "+b);
				b = arr[i];
			}
			
			else if(arr[i] > c) {
				c = arr[i];
			}
			
		}
		System.out.println(c);
		System.out.println(b);
	}

}
