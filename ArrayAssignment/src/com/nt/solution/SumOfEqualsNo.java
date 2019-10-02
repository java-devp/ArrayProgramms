package com.nt.solution;

public class SumOfEqualsNo {
	public static void main(String[] args) {
		
		int arr[]={3, 6, 8, -8, 10, 8 } ;
		int sum=16;
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;i++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
			
		//	System.out.println(count++);
			
		}
	}

}
