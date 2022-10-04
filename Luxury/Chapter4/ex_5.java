package Chapter4;

public class ex_5 {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author);}
	
	public ex_5() {
		this(" ", " ");
		System.out.println("생성자 호출됨");
	}
	
	public ex_5(String title) {
		this(title, "작자미상");
	}
	
	public ex_5(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		ex_5 book_1 = new ex_5("춘향뎐");
		book_1.show();
	}
}
