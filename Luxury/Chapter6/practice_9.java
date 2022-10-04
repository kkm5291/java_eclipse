package Chapter6;
import java.util.*;
public class practice_9 {
	public static void main(String[] args) {
		Random r = new Random();
		int cheol, com;
		Scanner sc = new Scanner(System.in);
		String[] rsp = {"rock", "scissor", "paper"};
		System.out.print("cheolsu[rock(1), scissor(2), paper(3), end(4)] >> ");
		cheol = sc.nextInt() - 1;
		com = r.nextInt(3);
		System.out.print("cheol(" + rsp[cheol] + ") : computer(" + rsp[com] + ")");
		
		
	}
}
