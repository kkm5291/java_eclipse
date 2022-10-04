package Chapter4;
import java.util.*;
class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}


public class ex_7 {
	public static void main(String[] args) {
		Book [] book = new Book[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println("("+book[i].title);
		}
	}
}
