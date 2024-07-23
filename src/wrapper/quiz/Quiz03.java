package wrapper.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문자형을 저장하는 리스트 생성
		ArrayList<Character> list = new ArrayList<Character>();
		
		// 리스트에 문자형 추가
		list.add('a'); // list.add(new Character('a'))으로 변환 (오토박싱)
		list.add('b');
		list.add('c');
		list.add('d');
		
		// 리스트 안에 저장된 문자형을 모두 출력 (for Each문)
		for(Character c : list) {
			System.out.println(c);
		}
		System.out.println("----1----");
		
		// 리스트 안에 저장된 문자형을 모두 출력 (for문)
		for(int i =0; i<list.size();i++) {
			char ch = list.get(i); // list.get(i).charValue()으로 변환 (언박싱)
			System.out.println(ch);
		}
	}

}
