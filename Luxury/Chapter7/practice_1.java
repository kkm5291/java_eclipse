package Chapter7;
import java.util.*;
public class practice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		
		while(true) {
			int n = sc.nextInt();
			v.add(n);
			if(n == -1) {
				break;
			}
		}
		int max = 0;
		for (int i=0; i<v.size(); i++) {
			int cnt = v.elementAt(i);
			if (max < cnt) {
				max = cnt;
			}
		}
		System.out.println(max);
	}
}
