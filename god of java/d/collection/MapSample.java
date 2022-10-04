package d.collection;
import java.util.HashMap;
import java.util.*;
public class MapSample {
	public static void main(String[] args) {
		MapSample sample = new MapSample();
		sample.checkValue();
	}
	
	public void checkKeySet() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		Set<String> keySet = map.keySet();
		for(String tempKey:keySet) {
			System.out.println(tempKey+"="+map.get(tempKey));
		}
	}
	
	public void checkValue() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		
		Collection<String> values = map.values();
		System.out.println(map.values());
	}
}
