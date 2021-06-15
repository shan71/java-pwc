package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//Set<String> nameSet=new HashSet<>();
		//Set<String> nameSet=new LinkedHashSet<>();
		SortedSet<String> nameSet=new TreeSet<String>();
		

		nameSet.add("shantanu");
		nameSet.add("pavan");
		nameSet.add("chandra");
		nameSet.add("ranga");
		nameSet.add("tirumala");
		nameSet.add("chandra");
		nameSet.add("amit");

		nameSet.remove("pavan");
		System.out.println(nameSet);
		
		  Iterator<String> itr=nameSet.iterator();
		  
		  while(itr.hasNext()) { String name=itr.next();
		  System.out.println("Hello "+name); }
		  
		 
		for (String name : nameSet) {
			System.out.println(name);
		}
	}

}
