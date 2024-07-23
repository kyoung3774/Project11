package wrapper;

public class Ex02 {

	public static void main(String[] args) {

		// Integer의 객체 생성
		Integer iNum1 = new Integer(100);
		
		// 자바 버전이 올라가면서 생성자 생략
		Integer iNum2 = 100; // new Integer(100);(auto boxing)
		
		// Integer 객체에서 값 꺼내기
		int num1 = iNum1.intValue();
		int num2 = iNum1; // iNum1.intValue();(auto unboxing)
		
		// 참조형과 기본형간의 연산 가능
		int num3 = iNum1 + 100; // iNum1.intValue() + 100 -> 100 + 100
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println();
		
		// Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; // 오토박싱
		
		boolean bool1 = boolean1.booleanValue(); // boolean1값 꺼내기
		boolean bool2 = boolean2; // 값 꺼내기(언박싱)
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
	}

}
