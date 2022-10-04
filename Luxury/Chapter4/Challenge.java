package Chapter4;
import java.util.Scanner;
public class Challenge {
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다.");
		run();
		
	}
	
	static void run() {
		Scanner sc = new Scanner(System.in);
		Player[] player;
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int num = sc.nextInt(); // num = 3 이라고 생각
		
		player = new Player[num];
		for(int i=0; i<num; i++) {
			player[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요 >> ");
			player[i].name = sc.next();
		}
		
		System.out.println("시작하는 단어는 아버지 입니다.");
		String word = "아버지";
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex); // '지'
		char firstChar = word.charAt(0);
		
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print(player[i].name + ">>");
				word = player[i].getWordFromUser();
				firstChar = word.charAt(0);
				player[i].checkSuccess(lastChar, firstChar);
				lastIndex = word.length() - 1;
				lastChar = word.charAt(lastIndex);
			}
		}
		
	}
	
}


class Player {
	String name;
	String word;
	Scanner sc = new Scanner(System.in);
	
	String getWordFromUser() {
		word = sc.next();
		return word;
	}
	
	void checkSuccess(char lastChar, char firstChar) {
		if(lastChar != firstChar) {
			System.out.println(name + "이 졌습니다.");
			System.exit(0);
		}
	}
}
