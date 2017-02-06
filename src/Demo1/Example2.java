package Demo1;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {

		int[] input = { 5, 2, 3, 1, 4 };
		int k = 3, f = 5, n = 5;
		int min = input[0];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (input[j] < input[i]) {
					min = input[j];
					input[j] = input[i];
					input[i] = min;
				}
			}

		}

		int[] t = new int[k];
		int[] t2 = new int[k];
		int sum = 0;
		int temp = k - 1;
		for (int j = 0; j < k; j++) {
			t[j] = input[j];
		}
		t2 = Arrays.copyOf(t, t.length);

		printme(t);
		sum = getSum(t);
		if (sum % f == 0) {
			System.out.println("this is ans :" + sum);
		}

		for (int i = 0; i < n; i++) {

			for (int j = k; j < n; j++) {
				
				t[temp] = input[j];
				printme(t);

				sum = getSum(t);
				if (sum % f == 0) {
					break;
				}

			}
			if (sum % f == 0) {
				break;
			}
			if (temp >= 1) {
				temp = temp - 1;
				System.out.println("Reassign :" + temp);
				t = Arrays.copyOf(t2, t2.length);
				printme(t);
			} else {
				System.out.println("Array Change");
				temp =k-1;
				t2 = Arrays.copyOf(t, t.length);
				int h=input[0];
				input[0]=input[n-1];                                                                                                                                                                                                                                                                                                                                                                                                     
				input[n-1]=h;
			}
		}

		System.out.println("Sum is the ans:" + sum);

	}

	public static int getSum(int[] t) {
		int sum = 0;
		for (int su : t) {
			sum = sum + su;
		}

		return sum;
	}

	public static void printme(int[] t) {
		for (int su : t) {
			System.out.println(su);
		}
		System.out.println("next");

	}

}
