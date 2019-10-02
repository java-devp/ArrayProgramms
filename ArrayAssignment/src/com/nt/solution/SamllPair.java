package com.nt.solution;

import java.util.Arrays;

public class SamllPair {
	public static void main(String[] args) {
		
	  Integer arr[]= {1,6,7,9,5,8};
	  int newarr[]= {0};
	  
	  
	 /* for(int i=0;i<arr.length;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]<a) {
				  a=arr[i];
				  if(arr[j+1]<b) {
					  b=arr[j];
				  }
				  
				  
				  
			  }
			  
		   
		  }
	  
	  }*/
	  
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	  int  a =arr[0];
	  int  b =arr[1];
	  System.out.println(arr[0]+","+arr[1]);
	  System.out.println(b-a+":: difference between pair of mimimum no");
	 
	}
	  

}
