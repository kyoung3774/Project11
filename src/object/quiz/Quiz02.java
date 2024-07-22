package object.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Object object1 = new Student(1001, "둘리");
		Object object2 = new Student(1002, "또치");

		Student student1 = (Student) object1;
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println();

		if (object2 instanceof Student) {
			Student student2 = (Student) object2;
			System.out.println(student2.id);
			System.out.println(student2.name);
		}
	}

}

//학생 클래스
class Student extends Object {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// 주석 처리 전후 비교하시오
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { // 자식 클래스가 맞는지 확인
			Student student = (Student) obj; // 자식 객체의 필드를 사용하기 위한 형변환
			if (this.id == student.id) { // 자식 객체
				return true;
			}
		}
		return false;
	}

}