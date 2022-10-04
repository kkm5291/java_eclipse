package Chapter7.ex;
import java.util.*;
public class ex_8 {
	static void printList(LinkedList<String> l) {
		
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String e = it.next();
			String separator;
			if (it.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("트랜스포머");
		list.add("스타워즈");
		list.add("매트릭스");
		list.add(0, "터미네이터");
		list.add(2, "아바타");
		
		Collections.sort(list);;
		printList(list);
		
		Collections.reverse(list);
		printList(list);
		
		int index = Collections.binarySearch(list, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}
