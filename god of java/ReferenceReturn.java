
public class ReferenceReturn {

	public static void main(String[] args) {
		ReferenceReturn reference = new ReferenceReturn();
		
	}
	
	public int intReturn() {
		int returnInt = 0;
		return returnInt;
	}
	
	public int[] intArrayReturn() {
		int returnArray[] = new int[10];
		return returnArray;
	}
	
	public String strinReturn() {
		String returnString = "Return Value";
		return returnString;
	}
	
	public int calculateAfterIntReturn() {
		int returnInt=0;
		return returnInt;
	}

}
