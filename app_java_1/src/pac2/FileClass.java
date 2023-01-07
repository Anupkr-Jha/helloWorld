package pac2;

import java.io.File;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) {
		
		// it fetches all the file name in given path
		try {
			File f = new File("D://filehandling");
			String[] val = f.list();
			for (String s : val) {
				System.out.println(s);

			}
			System.out.println(val.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
