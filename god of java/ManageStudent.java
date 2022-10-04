
class Student {

	String name, address, phone, email;

	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return name+" "+address+" "+phone+" "+email;
	}	
}

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null;
		
		ManageStudent manage = new ManageStudent();
		student = manage.addStudent();
		manage.printStudents(student);
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0]=new Student("Lim");
		student[1]=new Student("Lee");
		student[2]=new Student("Sook", "Seoul", "010xxxxxxx", "kkm5291@naver.com");
		return student;
	}
	
	public void printStudents(Student[] student) {
		for(Student data:student) {
			System.out.println(data);
		}
	}
}

