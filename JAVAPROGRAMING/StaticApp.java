class Foo{
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar);
		Foo.classMethod();
		
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "chagned by f1";
		

	}

}
