package Chapter7;
import java.util.*;
public class practice_2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<6; i++) {
			String score = sc.next();
			al.add(score);
		}
		
		for(int i=0; i<al.size(); i++) {
			switch(al.get(i)) {
			case "A":
				sum += 4;
				break;
			case "B":
				sum += 3;
				break;
			case "C":
				sum += 2;
				break;
			case "D":
				sum += 1;
				break;
			case "F":
				sum += 0;
				break;
			}
		}
		System.out.println((double)sum/al.size());
	}
}
