package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileIO {

	public static void main(String[] args) {

		FileReader fis = null;
		FileWriter fos=null;
		try {
			fis = new FileReader("c:\\workspace\\demo.txt");
			fos= new FileWriter("c:\\workspace\\demo_1.txt",true);
			
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
				fos.write(b);
				fos.flush();
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist..");
		} catch (IOException e) {
			System.out.println("Read error..");
		}

		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
