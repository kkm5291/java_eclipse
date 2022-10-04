package e.io.practice;
import java.io.*;
public class FileSizeSummary {
	
	public static void main(String[] args) {
		FileSizeSummary sample = new FileSizeSummary();
		String path = "C:\\Users\\kkm23\\Desktop\\DKU";
		long sum = sample.printFileSize(path);
		System.out.println(path + "'s total size = " + sum);
	}
	
	public long printFileSize(String dirName) {
		File dir = new File(dirName);
		long sum =0;
		if(dir.isDirectory()) {
			File[] fileList = dir.listFiles();
			for(File file:fileList) {
				if(file.isFile()) {
					String tempFileName = file.getAbsolutePath();
					long fileLength = file.length();
					System.out.println(tempFileName + "=" + convertFileLength(fileLength));
					sum += fileLength;
				} else {
					String tempDirName = file.getAbsolutePath();
					long fileLength = printFileSize(tempDirName);
					System.out.println("["+tempDirName+"] = "+ fileLength);
				}
			}
		}
		return sum;
		
	}
	
	private String convertFileLength(long fileLength) {
		long KB = 1024;
		long MB = 1024 * 1024;
		long GB = 1024 * 1024 * 1024;
		
		if(fileLength<KB) {
			return fileLength + " b";
		} else if (fileLength < MB) {
			return (1.0 * fileLength/KB) + " kb";
		}else if (fileLength < GB) {
			return 1.0*fileLength/MB + " mb";
		} else {
			return 1.0*fileLength/GB + " gb";
		}
	}
}
