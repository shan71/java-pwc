package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import collections.entity.Emp;

public class ReflectDemo {

	public static void main(String[] args) throws Exception{
		Emp emp= new Emp();
		
		Method[] methods=emp.getClass().getDeclaredMethods();
		
		System.out.println(methods.length);
		
		for(Method m:methods) {
			if(m.getName().equals("setName"))
			m.invoke(emp, "Sanjay");
		}
		
		Constructor[] cons=emp.getClass().getDeclaredConstructors();
		System.out.println(cons.length);
		System.out.println(cons[1].getParameters().length);

	}

}
