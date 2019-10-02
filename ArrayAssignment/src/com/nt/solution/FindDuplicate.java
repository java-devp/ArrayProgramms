package com.nt.solution;

public class FindDuplicate {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6,7,8,4,5,3,2,1};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
				
			}
			
		}
	}

}
