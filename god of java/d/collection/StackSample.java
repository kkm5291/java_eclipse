package d.collection;

import java.util.*;

public class StackSample {
	public static void main(String[] args) {
		StackSample sample = new StackSample();
		sample.checkPop();
		
	}
	public void checkPeek() {
		Stack<Integer> intStack = new Stack<Integer>();
		for(int loop=0; loop<5; loop++) {
			intStack.push(loop);
		}
		
		System.out.println("size = " + intStack.size());
	}
	
	public void checkPop() {
		Stack<Integer> intStack = new Stack<Integer>();
		for(int loop=0; loop<5; loop++) {
			intStack.push(loop);
		}
		for(int i=0; i<5; i++) {
			System.out.println(intStack.pop());
			
		}
		System.out.println(intStack.size());
	}
}
