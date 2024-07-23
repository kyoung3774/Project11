package wrapper.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		// 1.래퍼클래스의 toString 사용
		String str1 = Integer.toString(10);
		String str2 = Double.toString(1.123);
		String str3 = Character.toString('c');
		String str4 = Boolean.toString(true);
		
		// 2.String 클래스의 valueOf 사용
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(1.123);
		String str7 = String.valueOf('c');
		String str8 = String.valueOf(true);
	}

}
