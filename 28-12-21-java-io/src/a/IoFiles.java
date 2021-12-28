package a;

import java.io.File;
import java.io.IOException;

public class IoFiles {

	public static void main(String[] args) {

		String path = "C:/michael/temp/file1.txt";
		
		// create a file object that points to our file
		try {
		File file = new File(path); 
		if (! file.exists()) {
				file.createNewFile();
				System.out.println("file created: " + file);
		}else {
			System.out.println("file exists");
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
