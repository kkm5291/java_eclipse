package Practice;

public class practice {

	public static void main(String[] args) {
		int[] numbers1 = new int[4];
		int i=0;
		while(numbers1.length > i) {
			System.out.println(numbers1[i]);
			i++;
		}
		for(i=0; numbers1.length > i; i++) {
			System.out.println(numbers1[i]);
		}
	}

}
