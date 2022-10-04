package Practice8;

public class ManageStudent {
	
	public  Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofJava.com");
		return student;
	}
	
	public void printStudents(Student[] student){
		for(Student data : student) {
			System.out.println(data);
		}
		
	}
	public void checkEquals() {
		Student a = new Student("Min", "Seoul", "01023125291", "ask@godOfJava.com");
		Student b = new Student("Min", "Seoul", "01023125291", "ask@godOfJava.com");
		if(a.equals(b)) {
			System.out.println("a and b is same");
		}else {
			System.out.println("a nad b is different");
		}
	}
	public static void main(String[] args) {
//		Student[] student = null;
//		ManageStudent sample = new ManageStudent();
//		student = sample.addStudent();
//		sample.printStudents(student);
		ManageStudent management = new ManageStudent();
		management.checkEquals();
		
		
		
	}

}
