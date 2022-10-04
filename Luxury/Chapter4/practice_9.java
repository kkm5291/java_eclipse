package Chapter4;
import java.util.*;
class ArrayUtil {
	public static int [] concat(int [] a, int[] b) {
		/* 배열 a와 b를 연결한 새로운 배열 리턴*/
		int [] c = new int[a.length + b.length];
		int i=0;
		for(i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(; i<a.length+b.length; i++) {
			c[i] = b[i-a.length];
		}
		return c;
	}
	public static void print(int[] a) {
		System.out.print("[ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
}

public class practice_9 {
	public static void main(String[] args) {
		int [] arr1 = {1, 5, 7, 9};
		int [] arr2 = {3, 6, -1, 100, 77};
		int [] arr3 = ArrayUtil.concat(arr1, arr2);
		ArrayUtil.print(arr3);
	}
}
