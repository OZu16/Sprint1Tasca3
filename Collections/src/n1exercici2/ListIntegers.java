	package n1exercici2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIntegers {

	public static void main(String[] args) {

		List<Integer> originalList = new ArrayList<Integer>();
		List<Integer> reverseList = new ArrayList<Integer>();
		
		int numList = 0;

		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(4);
		originalList.add(5);
		originalList.add(6);

		
		ListIterator<Integer> listIterator = originalList.listIterator(originalList.size());
		
		while(listIterator.hasPrevious()) {
			numList = listIterator.previous();
			reverseList.add(numList);
		}
		
		System.out.println("llista invertida:");
	        for (int num : reverseList) {
	            System.out.println(num);
	        }
	}

}
	