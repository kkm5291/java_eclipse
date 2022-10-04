public class CarManager {
	public static void main(String[] args) {
		Car dogCar = new Car();
		dogCar.speedUP();
		dogCar.speedUP();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.breakDown();
		System.out.println(dogCar.getCurrentSpeed());
		Car cowCar = new Car();
		cowCar.speedUP();
	}
}