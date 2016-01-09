package test.concept.core.polymophism;

public class B extends A{
	public int a = 20;
	public void print(String s){
		super.print(s);
		System.out.println("Class B : "+s);
	}
}
