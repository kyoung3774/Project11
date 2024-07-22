package string.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		String str = "a:b:c:d";
		System.out.println(str.replace(':', '#'));
		
		String str2 = "안녕하세요 저는 둘리입니다.";
		System.out.println(str2.indexOf("둘"));
		System.out.println(str2.substring(9, 11));
	}

}
