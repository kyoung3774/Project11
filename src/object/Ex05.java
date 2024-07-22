package object;

public class Ex05 {

	public static void main(String[] args) {

		String str1 = new String("test");
		System.out.println(str1.toString()); // 주소 대신 문자열 값 출력
		System.out.println(str1); // 참조변수를 출력시 자동으로 toString()메소드 호출
		
		String str2 = new String("test");
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열 입니다.");
		}
	}

}
