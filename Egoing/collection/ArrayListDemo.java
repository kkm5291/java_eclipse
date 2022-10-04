package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		// arrayObj[2] = "three" 오류가 발생한다.
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>(); // collections Framework
		al.add("one");
		al.add("two");
		al.add("three"); // 얘는 위의 arrayObj[3]와 같은 건데 얘는 오류가 발생되지 않아
		for(int i =0; i<al.size();i++) {
			String value = al.get(i);
			System.out.println(al.get(i));
			System.out.println(value);
		}

	}

}
