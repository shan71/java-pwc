package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileIO2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("c:\\workspace\\demo.txt");
			fos= new FileOutputStream("c:\\workspace\\demo_1.txt",true);
			
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
