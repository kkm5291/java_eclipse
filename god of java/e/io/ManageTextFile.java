package e.io;
import static java.io.File.separator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class ManageTextFile {

	public static void main(String[] args) {
		ManageTextFile manage = new ManageTextFile();
		int numberCount = 10;
		String fullPath = "C:\\Users\\kkm23\\Desktop\\text\\text.txt";
//		manage.writeFile(fullPath,numberCount);
//		manage.readFile(fullPath);
//		manage.readFileWithScanner(fullPath);
		
	}
	
	public void writeFile(String fileName, int numberCount) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter=null;
		try {
			fileWriter = new FileWriter(fileName, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			for(int i=0; i<numberCount; i++) {
				bufferedWriter.write(Integer.toString(i));
				bufferedWriter.newLine();
			}
			System.out.println("Write Success !!!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void readFile(String fileName) {
		FileReader fileReader = null;
		BufferedReader bufferedReader=null;
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			String data;
			while( (data=bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
			System.out.println("Read Success !!!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void readFileWithScanner(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("Read Success !!!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
