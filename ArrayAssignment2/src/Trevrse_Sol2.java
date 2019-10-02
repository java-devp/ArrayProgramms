

import java.util.Arrays;

public class Trevrse_Sol2 {
	public static void main(String[] args) {
		 
		int arr[] = {1,0,0,1,0,1,0,1,0,1,1,1,1};
        int a=arr.length-1;
        int p=0;
        int arr1[]= new int[arr.length];
        
        System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1 ) {
				p=arr[i];
				arr1[a]=p;
				a--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}
				

}
