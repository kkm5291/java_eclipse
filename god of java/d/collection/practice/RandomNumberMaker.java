package d.collection.practice;
import java.util.*;
public class RandomNumberMaker {
	public static void main(String[] args) {
		RandomNumberMaker rnm = new RandomNumberMaker();
		for(int i=0; i<10; i++) {
			System.out.println(rnm.getSixNumber());			
		}
		
	}
	
	public HashSet<Integer> getSixNumber(){
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			int tempNumber = random.nextInt(45);
			hs.add(tempNumber);
			if(hs.size() == 6) { break; }
		}
		
		return hs;
	}
}
