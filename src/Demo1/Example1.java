package Demo1;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

		int[] input = { 5, 2, 3, 1, 4 };
		int k = 5, f = 3, n = 5;
		
		System.out.println("candit and "+cal(input,k,f));
	}

	public static int getSum(int[] t) {
		int sum = 0;
		for (int su : t) {
			sum = sum + su;
		}

		return sum;
	}

	public static int cal(int[] input1, int input2, int input3) {
		int[] input = input1;
		int k = input2, f = input3, n = input1.length;
		if (k <= n) {
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
			sum = getSum(t);
			if (sum % f == 0) {

				return sum;
			}

			for (int i = 0; i < n; i++) {

				for (int j = k; j < n; j++) {

					t[temp] = input[j];
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

					t = Arrays.copyOf(t2, t2.length);

				} else {

					temp = k - 1;
					t2 = Arrays.copyOf(t, t.length);
					int h = input[0];
					input[0] = input[n - 1];
					input[n - 1] = h;
				}
			}

			return sum;

		} else {
			return -1;
		}

	}

}
