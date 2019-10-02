package com.nt.solution;

public class Array2 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6,7};
		int a=arr[0];
		int b=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
			else if(arr[i]<b) {
				b=arr[b];
			}	
		}
		System.out.println(a);
		System.out.println(b);
			
	}
		
	
	

}
