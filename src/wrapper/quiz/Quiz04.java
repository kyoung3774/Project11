package wrapper.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력1");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("입력2");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println(num1 + num2);
	}

}
