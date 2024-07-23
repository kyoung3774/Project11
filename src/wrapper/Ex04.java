package wrapper;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		boolean b = list.get(0); // list.get(0).booleanValue()로 변환됨(언박싱)
	}

}
