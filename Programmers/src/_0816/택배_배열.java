package _0816;

import java.util.Stack;

public class 택배_배열 {
	public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
		long answer = -1;
		int distance = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (deliveries[i] <= cap) {
				cap = cap - deliveries[i];
				deliveries[i] = 0;
				System.out.println(cap + "cap");
				System.out.println(deliveries[i]);
				System.out.println(i + "i");

			} else {
				deliveries[i] = deliveries[i] - cap;
				cap = 0;

				System.out.println(cap + "cap");
				System.out.println(deliveries[i]);
				System.out.println(i + "i");
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// solution(4, 5, new int[] { 1, 0, 3, 1, 2 }, new int[] { 0, 3, 0, 4, 0 });
		solution(4, 5, new int[] { 1, 0, 3, 1, 2 }, new int[] { 0, 3, 0, 4, 0 });
	}

}
