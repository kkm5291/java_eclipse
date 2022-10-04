package constant;
//
//class Fruit{// interface는 public static final이 암시적으로 들어가 있는 친구임
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//}
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color){
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
}
//class Company{
//	public static final Company GOOGLE = new Company();
//	public static final Company APPLE = new Company();
//	public static final Company ORACLE = new Company();
//}
enum COMPANY{
	GOOLGLE, APPLE, ORACLE
}
public class ConstantDemo {
	public static void main(String[] args) {
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}
//		Fruit type = Fruit.APPLE;
//		switch(type) {
//		case APPLE:
//			System.out.println(57+" kcal, color "+Fruit.APPLE.getColor());
//			break;
//		case PEACH:
//			System.out.println(34+" kcal, color "+Fruit.PEACH.getColor());
//			break;
//		case BANANA:
//			System.out.println(93+" kcal, color "+Fruit.BANANA.getColor());
//			break;
//		}
//
	}

}
