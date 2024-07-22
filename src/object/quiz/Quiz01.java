package object.quiz;

import java.util.Objects;

public class Quiz01 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024, 7, 22);
		MyDate date2 = new MyDate(2024, 7, 22);

		if (date1.equals(date2)) {
			System.out.println("date1과 date2는 같은 날짜입니다.");
		} else {
			System.out.println("date1과 date2는 갈은 날짜가 아닙니다.");
		}

		MyDate date3 = new MyDate(2024, 7, 21);
		MyDate date4 = new MyDate(2024, 7, 22);

		if (date3.equals(date4)) {
			System.out.println("date3과 date4는 같은 날짜입니다.");
		} else {
			System.out.println("date3과 date4는 갈은 날짜가 아닙니다.");
		}

	}

}

// 날짜 클래스
class MyDate {

	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if (this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			}
		}
		return false;
	}

}