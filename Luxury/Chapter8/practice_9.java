package Chapter8;
import java.io.*;
public class practice_9 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\kkm23\\Desktop\\R");
		File[] subfiles = f.listFiles();
		System.out.println(f.getPath() + "디렉토리의 모든 .txt 파일을 삭제합니다.");
		for(int i=0; i<subfiles.length; i++) {
			String name = subfiles[i].getName();
			int index = name.lastIndexOf(".txt");
			if(index != -1) {
				System.out.println(subfiles[i]+" 삭제");
				subfiles[i].delete();
			}
		}
		
	}
}
