package test.concept.core.polymophism;

public class ABTester {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new B();
		B obj3 = new B();
		obj1.print("Punit");
		System.out.println(obj1.a);
		
		obj2.print("Punit");
		System.out.println(obj2.a);
		
		obj3.print("Punit");
		System.out.println(obj3.a);
	}
}
