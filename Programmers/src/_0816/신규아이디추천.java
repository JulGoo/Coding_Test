package _0816;

public class 신규아이디추천 {
	public static String solution(String new_id) {
		String answer = "";
		// Step.1
		new_id = new_id.toLowerCase();
		//System.out.println(new_id);

		// Step.2
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		//System.out.println(new_id);

		// Step.3
		new_id = new_id.replaceAll("[.]+", ".");
		//System.out.println(new_id);

		// Step.4
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		//System.out.println(new_id);

		// Step.5
		if (new_id.length() == 0) {
			new_id = "a";
		}
		//System.out.println(new_id);

		// Step.6
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
		new_id = new_id.replaceAll("[.]$", "");
		//System.out.println(new_id);

		// Step.7
		if (new_id.length() <= 2) {
			while (new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		//System.out.println(new_id);

		return new_id;
	}

	public static void main(String[] args) {
		// System.out.println(solution("AKdf98_+"));
		// solution(".AK..df98_+.sldfj.edsjd");
		System.out.println(solution("abcdefghijklmn.p"));
	}
}
