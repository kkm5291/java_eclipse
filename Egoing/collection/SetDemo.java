package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
	
	public static void main(String[] args) {
		Collection<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
//		HashSet<Integer> B = new HashSet<Integer>();
//		B.add(3);
//		B.add(4);
//		B.add(5);
//		
//		HashSet<Integer> C = new HashSet<Integer>();
//		C.add(1);
//		C.add(2);
//		
//		// 포함이 되느냐! 보는 코드 containsAll  boolean타입
//		System.out.println(A.containsAll(B)); // false
//		System.out.println(A.containsAll(C)); // true
//		
//		A.addAll(B); // 합집합
//		A.retainAll(B); //집합 A에도 있고 B에도 있는 값만! A에 담겠다
//		A.removeAll(B); //차집합
		
		Iterator hi = A.iterator();
		while(hi.hasNext()){
			System.out.println(hi.next());
		}
		
		//HashSet<Integer> B = new HashSet<Integer>();
	}

}
