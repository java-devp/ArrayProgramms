import java.util.Arrays;

public class ArraySegregate4 {
	public static void main(String[] args) {
		
		 
			int arr[] = {0,1,2,2,1,0};
	        int a=arr.length-1;
	        int p=0;
	        int arr1[]= new int[arr.length];
	        int q=arr.length-1;
	        
	        for (int j = 0; j < arr.length; j++) {
				 if(arr[j]==2) {
					p =arr[j];
					System.out.println(p);
					arr1[a]=p;
					a--;
				}
	        }
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==1 ) {
					p=arr[i];
					arr1[a]=p;
					a--;
				}
				
			}
			System.out.println(Arrays.toString(arr1));
			
			System.out.println(Arrays.toString(arr1));
			
		 
	}

}
