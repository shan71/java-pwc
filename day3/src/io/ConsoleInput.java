package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("type 'exit' to quit..");
		while(true) {
			String line = br.readLine();
			if(line.equalsIgnoreCase("exit")) break;
			System.out.println(line);
		}

	}

}
