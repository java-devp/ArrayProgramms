import java.util.Arrays;

public class TraverseArray_3 {

	public static void main(String[] args) {

		int arr[] = {0,1,1,0,0,1,1,0,0,1,0,1,1,1};
        int a=0;
        int b=0;
     //   Arrays.sort(arr);
     //   System.out.println(a);
        System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]< 1 ) {
				
				//System.out.println(a);
				b =arr[a];
				System.out.println(b);
				arr[a]=arr[i];
				arr[i]=b;
				a++;
			//	System.out.println(Arrays.toString(arr));
		
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
