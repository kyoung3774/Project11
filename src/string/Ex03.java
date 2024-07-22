package string;

public class Ex03 {

	public static void main(String[] args) {
		
		// 한 변수 안에서 문자열이 변경 될 때마다 주소값이 변경됨
		String str = "java";
		System.out.println("str의 주소: " + System.identityHashCode(str));
		str = str + " and";
		str = str + " android";
		System.out.println("값 변경 후 str의 주소:" + System.identityHashCode(str));
		System.out.println(str.toString());
		System.out.println(str);
		System.out.println();
		
		// 한 변수 안에서 문자열 내용이 바뀌어도 주소값은 변하지 않는다
		StringBuilder buffer = new StringBuilder("java");
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		System.out.println("값 변경 후 str의 주소:" + System.identityHashCode(buffer));
		System.out.println(buffer.toString());
		System.out.println(buffer);
	}

}
