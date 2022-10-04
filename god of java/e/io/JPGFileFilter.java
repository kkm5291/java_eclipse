package e.io;
import java.io.*;
public class JPGFileFilter implements FileFilter{

	@Override
	public boolean accept(File file) {
		if(file.isFile()) {
			String fileName = file.getName();
			if(fileName.endsWith(".jpg")) return true;
		}
		return false;
	}
}

class JPGFilenameFilter implements FilenameFilter{
	
	@Override
	public boolean accept(File file, String fileName) {
		if(fileName.endsWith(".jpg")) return true;
		return false;
	}
	
	
}
