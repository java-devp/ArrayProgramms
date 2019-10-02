package com.nt.solution;

import java.util.Arrays;
import java.util.Collections;

public class SecondMinandMax {
	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,6};
		int a=arr[0];
		int b=arr[0];
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Minimum NO  :"+arr[1]);
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Maximum no  :"+arr[1]);
	//	System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
			//		System.out.println(arr[j]);
				}
			}
			
			
		}
		
	}

}
