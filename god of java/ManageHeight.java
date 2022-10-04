public class ManageHeight {
	int [][]gradeHeights;
	public static void main(String[] args) {
		ManageHeight manage = new ManageHeight();
		
		manage.setData();
		
		for(int i=1; i<=5; i++) {
//			manage.printHeight(i);
			manage.printAverage(i);
		}
	}
	

	
	public void setData() {
//		
//		gradeHeights = new int[5][];
//		gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
//		gradeHeights[1] = new int[] { 160, 165, 167, 186 };
//		gradeHeights[2] = new int[] { 158, 177, 187, 176 };
//		gradeHeights[3] = new int[] { 173, 182, 181 };
//		gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
		
		gradeHeights = new int [][] {{170, 180, 173, 175, 177}, {160, 165, 167, 186}, {158, 177, 187, 176},
				{173, 182, 181}, {170, 180, 165, 177, 172}};
		
	}
	
	public void printHeight(int classNo) {
		
		
		System.out.println("ClassNo : " + classNo);
		for(int data:gradeHeights[classNo - 1]) {
			System.out.println(data);
		}
	}
	
	public void printAverage(int classNo) {
		
		double sum=0;
		int studentCount=gradeHeights[classNo - 1].length;
		for(int data:gradeHeights[classNo -1]) {
			sum+=data;
		}
		
		System.out.println(sum/studentCount);
	}

}
