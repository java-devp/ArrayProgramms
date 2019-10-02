import java.util.Arrays;

public class ArrayRotation1 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 7, 9, 8 };
		int d = 2;
		int q = 0;
		
		for (int i = 0; i < d; i++) {
			q = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = q;
		}
		System.out.println(Arrays.toString(arr));

	}

}
