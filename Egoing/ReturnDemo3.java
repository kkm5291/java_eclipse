
public class ReturnDemo3 {
	public static String getMember1() {
        return "ÃÖÁøÇõ";
    }
 
    public static String getMember2() {
        return "ÃÖÀ¯ºó";
    }
 
    public static String getMember3() {
        return "ÇÑÀÌ¶÷";
    }
    public static String[] getMembers() {
    	String[] members= {"ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑ¾Æ¶÷"};
    	return members;
    }
 
    public static void main(String[] args) {
        for (int i=0;i<getMembers().length;i++) {
        	System.out.println(getMembers()[i]);
        }
    }
}
