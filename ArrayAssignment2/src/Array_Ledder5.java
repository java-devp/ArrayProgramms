
public class Array_Ledder5 {
	
	public static void main(String[] args) {
		 
		int arr[]= { 1, 6, 6, 5, 8, 4, 1,8,8,8,8,8,8,8, 2 };
		int p=arr.length/2;
		int d=0;
		for(int i=0; i<arr.length;i++) {
		int q=arr[i];
		int	a=arr[i++];
			if(q==a) {
			 if(a>=p) {
				// System.out.println(a);
				 d=a;
			 }
			}
			
			  
		}
		System.out.println(d);
	}

}
