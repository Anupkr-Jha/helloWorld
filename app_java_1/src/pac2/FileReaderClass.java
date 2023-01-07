package pac2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) {
  //read the .text file 
		try {
			File f = new File("D:\\filehandling\\test1.txt");

			System.out.println(f.length());

			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) {

				System.out.print((char) fr.read());

			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
