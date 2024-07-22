package string.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호 입력");

		String str1 = scanner.nextLine();

		String str2 = "881120-1068234";

		System.out.println(str2.charAt(7));

		// Scanner 사용
		if (str1.toString().charAt(7) == '1' || str1.toString().charAt(7) == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (str1.toString().charAt(7) == '2' || str1.toString().charAt(7) == '4') {
			System.out.println("성별은 여자입니다.");
		} else {
			System.out.println("신인류");
		}

		//
		if (str2.charAt(7) == '1' || str2.charAt(7) == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (str2.charAt(7) == '2' || str2.charAt(7) == '4') {
			System.out.println("성별은 여자입니다.");
		} else {
			System.out.println("신인류");
		}
	}

}
