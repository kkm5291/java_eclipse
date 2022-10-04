package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;




public class MainPractice {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1, 50);
		System.out.println("\nadd(인덱스, 값)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
//		System.out.println(numbers[2]);  오류가 발생한다. 왜냐면 [] 인덱스값으로 찾는것은 일반 array 고
		// 지금 사용하는 것은 ArrayList니까 get을 이용해서 차증ㄹ 수 있음
		
		
		System.out.println(numbers.size());
		
//		Iterator<Integer> it = numbers.iterator();
//		while(it.hasNext()) {
//			int value = it.next();
//			if(value == 30) {
//				it.remove();
//			}
//		}
	}

	

}
