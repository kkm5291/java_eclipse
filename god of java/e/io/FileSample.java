package e.io;
import java.io.*;
public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName="C:\\Users\\kkm23\\Desktop\\text";
		sample.makeDir(pathName);
	}
	
	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName+" is exists? = " + file.exists());
	}
	
	public void makeDir(String pathName) {
		File file = new File(pathName);
		System.out.println("Make " + pathName + " result = "+file.mkdir());
	}
}
