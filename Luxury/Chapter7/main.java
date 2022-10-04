package Chapter7;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(Integer.valueOf(5));
		v.add(4);
		v.add(-1);
		v.add(Integer.valueOf(10));
		
		Integer obj = v.get(1);
		int i = obj.intValue();
//		System.out.println(obj);
//		System.out.println(i); // int i = v.get(1);
		
		ArrayList<String> str = new ArrayList<String>();
		ArrayList<Integer> integer = new ArrayList<Integer>();
		
		str.add("hello");
		str.add("no cheating");
		str.add("Java");
		
		integer.add(30);
		
//		Vector<Integer> vi = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		
		
		
	}
}
