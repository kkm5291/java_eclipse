
public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	public MemberDTO() {
		// �ƹ������� �� ��
	}
	
	public MemberDTO(String name) {
		// �̸��� �� ��
		this.name = name;
	}
	
	public MemberDTO(String name, String phone) {
		// �̸��� ��ȭ��ȣ �� ��
		this.name = name;
		this.phone = phone;
	}
	
	public MemberDTO(String name, String phone, String email) {
		// ������ �� �� ��
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public static void main(String[] args) {
		

	}
	
	

}
