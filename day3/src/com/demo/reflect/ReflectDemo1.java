package com.demo.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo1 {

	public static void main(String[] args) throws Exception {
		Class c1=Class.forName("com.demo.reflect.Emp");
		
		Field[] fields=c1.getDeclaredFields();
		
		for(Field f:fields) {
			
			System.out.println(f.getName());
		}
		
		Constructor[] cons=c1.getDeclaredConstructors();
		
		Method[] methods=c1.getDeclaredMethods();
		
		for(Method m:methods) {
			System.out.println(m.getName()+"--->"+m.getParameterCount());
		}
		
		
		
		Emp emp =(Emp)c1.newInstance();
		
		emp.setName("Tiger");
		
		
		

	}

}
