package string.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 무한 루프 정지
		while(true) {
			System.out.println("계속 실행");
			String str = scanner.nextLine();
			if(str.equals("END")|| str.equals("end")) {
				break;
			}
		}
		
		// 2. 무한 루프 정지
		while(true) {
			System.out.println("계속 실행");
			String str = scanner.nextLine();
			if(str.toLowerCase().equals("end")){
				break;
			}
		}
		
		// 3. 무한 루프 정지
		while(true) {
			System.out.println("계속 실행");
			String str = scanner.nextLine();
			if(str.equalsIgnoreCase("end")){
				break;
			}
		}
	}

}
