package collections;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) {
		
	Properties empProps=new Properties();
		
		empProps.put("100", "Amit");
		empProps.put("101", "Ranga");
		empProps.put("102", "Chandra");
		empProps.put("103", "Shantanu");
		empProps.put("104", "Chandra");
		empProps.put("106", "John");
		
	
		System.out.println(empProps);
		System.out.println(empProps.containsValue("Shantanu"));
		
		Enumeration keys = empProps.keys();
		
		while(keys.hasMoreElements()) {
			String key = (String)keys.nextElement();
			System.out.println(key+" : "+empProps.getProperty(key));
		}
		System.out.println(empProps);
		
		
		

	}

}
