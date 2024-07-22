package string.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		System.out.println(get("자바 프로그래밍 입문"));
		System.out.println(get("자바 프로그래밍 입문 아 응애요"));
	}
	
	static int get(String str) {
		int realLength = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				realLength++;
			}
		}
		return realLength;
	}
}
