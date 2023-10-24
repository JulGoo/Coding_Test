package _0816;

import java.util.Stack;

public class 택배배달과수거하기 {
	public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
		long answer = -1;

		Stack<Integer> dStack = new Stack<>();
		Stack<Integer> pStack = new Stack<>();

		for (int d : deliveries) {
			dStack.push(d);
		}

		for (int p : pickups) {
			pStack.push(p);
		}

		if (dStack.pop() < cap) {
			
		}

		
		return answer;
	}

	public static void main(String[] args) {
		solution(0, 0, null, null);
	}

}
