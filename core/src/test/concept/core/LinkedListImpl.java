package test.concept.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl {
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for (int i = 0; i < 10; i++) {
			linkedList.add("Initial"+i);
		}
		/*for (int i = 0; i < 10; i++) {
			linkedList.add(list.get(i), "String"+i);
		}*/
		for ( final ListIterator<String> listIterator = linkedList.listIterator();listIterator.hasNext();) {
				final String string = listIterator.next();
				listIterator.add("Mid "+ listIterator.previousIndex());
		}
		for ( final ListIterator<String> listIterator = linkedList.listIterator();listIterator.hasNext();) {
			final String string = listIterator.next();
			System.out.println("Next element "+ string);
		}
	}
	
}
