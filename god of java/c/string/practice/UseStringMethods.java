package c.string.practice;

public class UseStringMethods {

	public static void main(String[] args) {
		String sample = "The String class represents character strings.";
		UseStringMethods method = new UseStringMethods();
		method.printContainWords(sample, "ss");
		
	}
	
	public void printWords(String str) {
		String[] splitArray = str.split(" ");
		for(String data:splitArray) {
			System.out.println(data);
		}
	}
	
	public void findString(String str, String findStr) {
		System.out.println(str.indexOf(findStr));
	}
	
	public void findAnyCaseString(String str, String findStr) {
		String lowerSample = str.toLowerCase();
		String lowerFindStr = findStr.toLowerCase();
		int indx = lowerSample.indexOf(lowerFindStr);
		System.out.println(indx);
	}
	
	public void countChar(String str, char c) {
		char[] strArray = str.toCharArray();
		int count=0;
		for(char tempArray:strArray) {
			if (tempArray == 's') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void printContainWords(String str, String findstr) {
		String[] words = str.split(" ");
		for (String data:words) {
			if(data.contains(findstr)) {
				System.out.println(data);
			}
		}
	}
}