package test.concept.core.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list = Arrays.asList("a","b","c","d","e","f");
		list.forEach(
				(String s) -> {
					print(s);
					
				}
		);
		
		Collections.reverse(list);
		list.forEach(
				(String s) -> print(s)
		);
		
		
		List<Integer> listNumber = Arrays.asList(3, 1, 4, 2, 6, 5, 9, 7, 8, 0);
		listNumber.sort((e1,e2)->e1.compareTo(e2));
		
		listNumber.sort((e1,e2)-> {
			int result = e1.compareTo(e2);
			return result;
		});
		listNumber.forEach(e->System.out.println(e));
	}
	
	public static void  print(String s){
		System.out.println(s);
	}
}
