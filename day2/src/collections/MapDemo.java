package collections;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class MapDemo {

	public static void main(String[] args) {
		//Map<Integer, String> empMap=new HashMap<>();
		//Map<Integer, String> empMap=new LinkedHashMap<>();
		//Map<Integer, String> empMap=new Hashtable<>();
		Map<Integer, String> empMap=new WeakHashMap<>();
		
		empMap.put(100, "Amit");
		empMap.put(101, "Ranga");
		empMap.put(102, "Chandra");
		empMap.put(103, "Shantanu");
		empMap.put(104, "Chandra");
		empMap.put(106, "John");
		
		
		System.out.println(empMap);
		System.out.println(empMap.containsValue("Shantanu"));
		
		empMap.remove(104);
		System.out.println(empMap);
		
		Set<Integer> keys=empMap.keySet();
		System.out.println(keys);
		
		for(Integer i:keys) {
			System.out.println(i+" : "+empMap.get(i));
		}
		

	}

}
