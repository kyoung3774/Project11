package string;

public class Ex04 {

	public static void main(String[] args) {

		String str = "java";

		System.out.println("0번째 위치의 문자: " + str.charAt(0));
		System.out.println("문자열의 길이: " + str.length());
		System.out.println("문자열 연결하기: " + str.concat("study"));
		System.out.println();

		System.out.println("av라는 문자열을 포함하는지 확인하기: " + str.contains("av"));
		System.out.println("ja라는 문자열로 시작하는지 확인하기: " + str.startsWith("ja"));
		System.out.println("va라는 문자열로 끝나는지 확인하기: " + str.endsWith("va"));
		System.out.println();

		System.out.println("모든 문자열을 소문자로 변환하기: " + "AAA".toLowerCase());
		System.out.println("모든 문자열을 대문자로 변환하기:" + "aaa".toUpperCase());
		System.out.println("문자a를 c로 변경하기: " + str.replace('a', 'c'));
		System.out.println();

		System.out.println("2번 위치부터 4번 위치전까지 자르기: " + str.substring(2, 4));
		System.out.println("문자열 양쪽 공백 제거:" + " ab cd ".trim());
		System.out.println("boolean값을 문자열로 변환하기: " + String.valueOf(true));
		System.out.println();
		
		// 구분자:를 기준으로 문자열 자르기
		String str2 = "aa:bb:cc:dd";
		String[] strArr = str2.split(":");

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
