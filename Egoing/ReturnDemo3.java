
public class ReturnDemo3 {
	public static String getMember1() {
        return "������";
    }
 
    public static String getMember2() {
        return "������";
    }
 
    public static String getMember3() {
        return "���̶�";
    }
    public static String[] getMembers() {
    	String[] members= {"������", "������", "�Ѿƶ�"};
    	return members;
    }
 
    public static void main(String[] args) {
        for (int i=0;i<getMembers().length;i++) {
        	System.out.println(getMembers()[i]);
        }
    }
}
