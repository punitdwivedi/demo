package test.concept.core.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8InterfaceDefaultMethodTest implements Java8InterfaceDefaultMethod{
	@Override
	public void print(String s) {
		System.out.println("Overriding Default Implementation: "+ s);
	}
	@Override
	public List<Integer> getRandom() {
		System.out.println("Called Java8InterfaceDefaultMethodTest method...");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i < 20; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		return list;
	}
	public static void main(String[] args) {
		Java8InterfaceDefaultMethod defaultMethodTest = new Java8InterfaceDefaultMethodTest();
		defaultMethodTest.print("Punit Dwivedi");
		for (Integer integer : defaultMethodTest.getRandom()) {
			System.out.println(integer);
		}
		
	}
}
