package Chapter7;
import java.util.*;
public class main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String info = sc.nextLine();
		String[] arr = info.split(", ");
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}
