package string.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner scaaner = new Scanner(System.in);

		System.out.println("입력");
		String str = scaaner.nextLine();

		// 1. 하드코딩
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.println(str.charAt(0));

		System.out.println("----1----");

		// 2.문자열에서 뒤에서부터 한 글자씩 출력
		int i = str.length() - 1;
		while (i >= 0) {
			System.out.print(str.charAt(i));
			i--;
			if (str.charAt(i) == str.charAt(0)) {
				System.out.println(str.charAt(i));
				i--;
			}
		}
		System.out.println("----2----");

		for (int j = str.length() - 1; j >= 0; j--) {
			System.out.print(str.charAt(j));
			if (str.charAt(j) == str.charAt(0)) {
				
			}
		}

	}

}
