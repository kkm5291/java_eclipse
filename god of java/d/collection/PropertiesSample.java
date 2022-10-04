package d.collection;
import java.io.*;
import java.util.*;
public class PropertiesSample {
	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.saveAndLoadProperties();;
	}
	
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for(Object tempObject:keySet) {
			System.out.println(tempObject+"="+prop.get(tempObject));
		}
	}
	
	public void saveAndLoadProperties() {
		try {
			String fileName = "test.xml";
			File propertiesFile = new File(fileName);
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("Writer", "Kyungmo Kim");
			prop.setProperty("WriterHome", "kkm23125291@gmail.com");
			prop.storeToXML(fos, "Basic XML Property File"); // 파일에서 주석처리하는 부분
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);
			Properties propLoaded = new Properties();
			propLoaded.load(fis);
			fis.close();
			System.out.println(propLoaded);
		} catch(IOException e) {}
		
	}
}
