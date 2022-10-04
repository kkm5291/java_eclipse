package d.collection;

import java.util.*;

public class SetSample {
	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String[] cars = new String[] {
				"Tico", "Sonata", "BMW", "Benz", "Lexus", "Mustang", "Grandeure", "The Beetle",
				"Mini Cooper", "i30", "BMW", "Lexus", "Carnibal", "SM5","SM7", "SM3", "Tico" };
		
		System.out.println(sample.getCarKinds(cars));
		
	}
	
	public int getCarKinds(String[] cars) {
		if(cars == null) return 0;
		if(cars.length == 1) return 1;
		
		Set<String> carset = new HashSet<String>();
		
		for(String car:cars) {
			carset.add(car);
		}
		printCarSet2(carset);
		return carset.size();
	}
	
	public void printCarSet(Set<String> carSet) {
		for(String temp:carSet) {
			System.out.print(temp + " ");
		}
	}
	
	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
