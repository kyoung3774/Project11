package string;

public class Ex01 {

	public static void main(String[] args) {
		
		// 리터럴 방식 (상수풀 저장소를 공유)
		String str1 = "tesr";
		String str2 = "tesr";
		
		// new 연산자 방식 (힙메모리 저장소를 사용)
		String str3 = new String("test");
		
		System.out.println(str1 == str2); // 주소값이 같음
		System.out.println(str1 == str3); // 주소값이 다름
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
