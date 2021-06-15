package collections;

import java.util.HashMap;
import java.util.Set;

import collections.entity.Emp;

public class EmpApp {

	private HashMap<Integer, Emp> db = new HashMap<Integer, Emp>();

	public EmpApp() {
		db.put(100, new Emp(100, "Shantanu", "Hyderabad", 35000));
		db.put(101, new Emp(101, "Kiran", "Hyderabad", 35000));
		db.put(102, new Emp(102, "Pavan", "Hyderabad", 35000));
		db.put(103, new Emp(103, "John", "Hyderabad", 35000));
		db.put(104, new Emp(104, "Viren", "Hyderabad", 35000));
		db.put(105, new Emp(105, "Sampath", "Hyderabad", 35000));
	}

	public static void main(String[] args) {
		EmpApp app = new EmpApp();

		Set<Integer> idSet = app.db.keySet();
		for (Integer id : idSet) {
			Emp e = app.db.get(id);

			if (e.getName().equals("Viren")) {
				System.out.println(e);
				break;
			} else {
				continue;
			}
		}

	}

}
