package object;

public class Ex04 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "첫번째");
		Book book2 = new Book(2, "두번째");
		
		Book book3 = book2; // 주소값 카피
		
		Am am = new Am(2, "세번째");

		System.out.println(book1.toString()); // 재정의 한 toString()
		System.out.println(book1); // book1.toString()과 같음
		System.out.println(book2); 
		System.out.println();
		System.out.println(am.toString()); // 재정의 하지 않은 toString()
		System.out.println(am); // am.toString()과 같음
		
		
		System.out.println(book2.hashCode()); // 재정의한 toString의 주소값을 알고 싶을때 hashCode() 사용(10진수 출력)
		System.out.println(book3.hashCode());
	}

}

// 책 클래스
class Book {

	int bookNumber;
	String BookTitle;

	public Book(int bookNumber, String title) {
		super();
		this.bookNumber = bookNumber;
		this.BookTitle = title;
	}

	@Override
	public String toString() {
		return "Book [bookNumber= " + bookNumber + ", bookTitle = " + BookTitle + "]";
	}

}

// 비교 클래스
class Am {
	
	int num;
	String name;
	
	public Am(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

}