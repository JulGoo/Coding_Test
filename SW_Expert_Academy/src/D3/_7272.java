package D3;

import java.util.Scanner;

public class _7272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		// 개행문자(\n) 삭제 -> nextInt 다음 바로 nextLine을 입력받게되면
		// 버퍼에 남아있는 개행문자 하나만 입력받은 후 메소드가 종료되어 오류발생!
		sc.nextLine(); // 사이에 sc.nextLine(); 삽입 시 오류 해결

		for (int tc = 1; tc <= T; tc++) {
			String alpha = sc.nextLine();
			String[] compare = alpha.split(" ");
			
			String[] front = compare[0].split("");
			String[] back = compare[1].split("");
			
			if(front.length != back.length) {
				System.out.printf("#%d DIFF\n", tc);
				continue;
			}
			
			boolean check = true;
			
			int len = front.length;
			for (int i = 0; i < len; i++) {
				if(inthere(front[i]) != inthere(back[i])) {
					check = false;
					break;
				}
			}
			
			System.out.printf(check ? "#%d SAME\n" : "#%d DIFF\n", tc);
			
		}
		sc.close();
	}
	
	public static int inthere(String a) {
		switch(a) {
		case "A", "D", "O", "P", "Q", "R":
			return 0;
		case "B":
			return 2;
		default:
			return 1;
		}
	}
}
