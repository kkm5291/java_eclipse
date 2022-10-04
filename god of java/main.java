
public class main {
	public static void main(String[] args) {
	
		int a = 1;
		int b = 100;
		int c = a; // passByValue
		
		c=c+1;
		
		System.out.println(a);
		
		String z = "z";
		String y = "y";
		String x = z;
		
		x=y;
		
		System.out.println(z);
		
	}
}
