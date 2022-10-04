package Practice8;

class Student {
	String name;
	String address;
	String phone;
	String email;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String toString() {
		return name+" "+address+" "+phone+" "+email;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Student std = (Student) obj;
		if (name == null) {
			if (std.name != null) return false;
			}else if (!name.equals(std.name)) return false;
		if (address == null) {
			if (std.address != null) return false;
		}else if (!address.equals(std.address)) return false;
		
		if (phone == null) {
			if (std.phone != null) return false;
		}else if (!phone.equals(std.phone)) return false;
		if (email == null) {
			if (std.email != null) return false;
		}else if (!email.equals(std.email)) return false;
		return true;
	}
	
		
}
