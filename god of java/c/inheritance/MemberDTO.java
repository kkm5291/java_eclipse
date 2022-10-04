package c.inheritance;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	public MemberDTO(String name) {
		this.name = name;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		MemberDTO other = (MemberDTO) obj;
		
		if (name == null) {
			if (other.name != null) return false;
		} else if(!name.equals(other.name)) return false;
		
		if (phone == null) {
			if (other.phone != null);
		} else if (!phone.equals(other.phone)) return false;
		
		return true;
	}
}
