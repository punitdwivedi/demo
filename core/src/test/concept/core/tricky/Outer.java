package test.concept.core.tricky;

public class Outer {
	public static class StaticInner{
		public static class Child{
			public void print(){
				System.out.println("Child");
			}
		}
		public void print(){
			System.out.println("StaticInner");
		}
	}
	class NonStaticInner{
		public void print(){
			System.out.println("Inner");
		}
	}
	
	public static void main(String[] args) {
		Outer.StaticInner staticInner = new Outer.StaticInner();// Instantiate Static Class
		Outer.NonStaticInner nonStaticInner = new Outer().new NonStaticInner(); //Instantiate Non-static Class
		Outer.StaticInner.Child child = new Outer.StaticInner.Child();
		staticInner.print();
		nonStaticInner.print();
		child.print();
	}
}
