package object;

public class Ex03 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		B b = new B(1001, "둘리");

		System.out.println(student1.equals(b));
		System.out.println(student1.equals(student2));

		// 비교 연산자 비교 (주소값 비교)
		if (student1 == student2) {
			System.out.println("student1과 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다.");
		}

		// equals 비교 (리터럴 값 비교)
		if (student1.equals(student2)) {
			System.out.println("student1과 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다.");
		}
	}

}

// 학생 클래스
class Student extends Object {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// 리터럴 값 비교를 위한 재정의
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

// 비교 클래스
class B {
	int id;
	String name;

	public B(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}