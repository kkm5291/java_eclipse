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
		System.out.println("add(��)");
		System.out.println(numbers);
		
		numbers.add(1, 50);
		System.out.println("\nadd(�ε���, ��)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
//		System.out.println(numbers[2]);  ������ �߻��Ѵ�. �ֳĸ� [] �ε��������� ã�°��� �Ϲ� array ��
		// ���� ����ϴ� ���� ArrayList�ϱ� get�� �̿��ؼ� ������ �� ����
		
		
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
