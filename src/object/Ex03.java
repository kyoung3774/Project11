package object;

public class Ex03 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "또치");
		B b = new B(1001, "둘리");

		System.out.println(student1.equals(b));
		System.out.println(student1.equals(student2));
		System.out.println("----1----");

		// 비교 연산자 비교 (주소값 비교)
		if (student1 == student2) {
			System.out.println("student1과 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다.");
		}
		System.out.println("----2----");
		
		// equals 비교 (리터럴 값 비교)
		if (student1.equals(student2)) {
			System.out.println("student1과 student2의 id는 같습니다.");
		} else {
			System.out.println("student1과 student2의 id는 다릅니다.");
		}
		System.out.println("----3----");
		
		// 
		if (student1.equals(b)) {
			System.out.println("student1과 b의 id는 같습니다.");
		} else {
			System.out.println("student1과 b의 id는 다릅니다.");
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
		if (obj instanceof Student) { // 같은 클래스(학생 클래스)가 맞는지 비교
			Student student = (Student) obj; // 매개변수의 필드를 사용하기 위한 다운 캐스팅
			if (this.id == student.id) { // 객체와 비교 객체의 id 값 비교
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