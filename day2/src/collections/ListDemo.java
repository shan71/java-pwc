package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		// List<String> nameList = new ArrayList<>();
		// List<String> nameList = new LinkedList<>();
		List<String> nameList = new Vector<>();

		nameList.add("shantanu");
		nameList.add("pavan");
		nameList.add("chandra");
		nameList.add("ranga");
		nameList.add("tirumala");
		nameList.add("chandra");
		nameList.add("amit");

		System.out.println(nameList.get(5));

		nameList.remove(4);

		System.out.println(nameList);
		/*
		 * Iterator<String> itr=nameList.iterator();
		 * 
		 * while(itr.hasNext()) { String name=itr.next();
		 * System.out.println("Hello "+name); }
		 * 
		 */
		for (String name : nameList) {
			System.out.println(name);
		}

		// Collections.sort(nameList);
		Collections.sort(nameList, (o1,o2)->o1.compareTo(o2));
		
		
		ListIterator<String> listItr=nameList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println(nameList);
	}

}
