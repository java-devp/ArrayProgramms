import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {

		int arr[] = {4,5,6};
		int sum = 0;
		int b[] = new int[arr.length];
		int d[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
                sum=sum+arr[i];
			b[i]=sum-arr[i];
		}
		for(int j=0;j<arr.length;j++) {
			d[j]=sum-arr[j];
		}
	System.out.println(sum);	
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(d));
	}
	
}
				
			
               		

