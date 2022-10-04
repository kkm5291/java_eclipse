
public class ArrayLength {

	public static void main(String[] args) {
		ArrayLength array = new ArrayLength();
		array.printArray();

	}
	public void printArrayLength() {
		int[] oneDim = new int[3];
		int [][] twoDim = new int[4][2];
		System.out.println(oneDim.length);
		System.out.println(twoDim.length);
	}
	public void printArray() {
		int [][] twoDim = {{1,2,3},{4,5,6}};
		System.out.println("twoDim.length="+twoDim.length); // 행값
		System.out.println("twoDim[0].length="+twoDim[0].length); // 열값
		
		for (int oneLoop=0;oneLoop<2;oneLoop++) {
			for(int twoLoop=0;twoLoop<3;twoLoop++) {
				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
						+twoDim[oneLoop][twoLoop]);
			}
		}
		int twoDimlength = twoDim.length;
		for(int oneLoop=0;oneLoop<twoDimlength;oneLoop++) {
			int twoDimOnelength = twoDim[oneLoop].length;
			for(int twoLoop=0;twoLoop<twoDimOnelength;twoLoop++) {
				System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="
						+twoDim[oneLoop][twoLoop]);
			}
		}
		
	}

}
