public class Car {
	int speed;
	int distance;
	String color;
	
	public Car() {
	}
	public void speedUP() {
		speed = speed + 5;
	}
	public void breakDown() {
		speed = speed - 10;
	}
	public int getCurrentSpeed() {
		return speed;
	}
}
