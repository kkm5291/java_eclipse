package Chapter7;
import java.util.*;
public class practice_4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0입력시 종료) >> ");
			int sum = 0;
			int rain = sc.nextInt();
			if (rain == 0) {
				break;
			}
			v.add(rain);
			for(int i=0; i<v.size(); i++) {
				System.out.println(v.get(i) + " ");
				sum += v.get(i);
			}
			System.out.print("현재 평균 ");
			System.out.println(sum/v.size());
			
		}
	}
}
