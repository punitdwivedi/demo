package test.concept.core.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Java8InterfaceDefaultMethod {
	public default void print(String s){
		System.out.println("Default Implementation: "+s);
	}	
	public default List<Integer> getRandom(){
		System.out.println("Called Java8InterfaceDefaultMethod method...");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		return list;
	}	
}
