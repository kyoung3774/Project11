package string.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";

		System.out.println("전체: " + str.length());

		int realLength = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				realLength++;
			}
		}
		System.out.println("공백: " + realLength);
	}

}
