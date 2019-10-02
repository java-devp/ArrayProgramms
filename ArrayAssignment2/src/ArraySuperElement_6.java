import java.util.Arrays;

public class ArraySuperElement_6 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,9,2,8};
		int p=arr[0];
		int q= arr[0];
		for(int i=0; i<arr.length;i++) {
			if(p<arr[i]) {
                q=p;
				p=arr[i];
			}
			else if(q<arr[i]) {
				q=arr[i];
			}
		
		}
		System.out.println(p);
		System.out.println(q);
	}
	 

}
