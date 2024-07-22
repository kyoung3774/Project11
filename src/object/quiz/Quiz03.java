package object.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		Dog dog = new Dog("멍멍이", "진돗개");
		Cat cat = new Cat();

		System.out.println(dog); // toString() 재정의 했을때
		System.out.println(cat); // toString() 재정의 안했을때, 16진수 주소값
		
		System.out.println(dog.hashCode()); // 
		System.out.println(cat.hashCode()); // 10진수 주소값
	}

}

// 개 클래스
class Dog {

	String name;
	String type;

	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}

}

// 고양이 클래스
class Cat {
	
	String name;
	String type;
}