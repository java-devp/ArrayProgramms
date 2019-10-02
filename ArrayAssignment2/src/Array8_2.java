import java.util.Arrays;

public class Array8_2 {

	public static void main(String[] args) {

		int arr[] = { 3,2,1 };

		int a = arr[0];
		int p = 0;
		int sum = 0;
		int b[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			sum = arr[i] + arr[i++];
			p = sum;
		}

		for (int j = 0; j < arr.length; j++) {
			b[j] = sum - arr[j];
		}
//			int sum = a + arr[i + 1];
//			arr[i] = sum;
//			System.out.println(sum);
		System.out.println(p);
		System.out.println(Arrays.toString(b));

	}

}
