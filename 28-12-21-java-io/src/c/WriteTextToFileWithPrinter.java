package c;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextToFileWithPrinter {

	public static void main(String[] args) {

		File directory = new File ("C:/michael/temp/a/b");
		if (!directory.exists()) {
			directory.mkdirs();
			//directory.mkdir();
			
		}
		// this is the file we want to write to
		File file = new File (directory , "/file2.txt");
		
		// create an object that can write text to file
		// add buffer
		boolean append = true; // add to existing content or not
		try (PrintWriter out = new PrintWriter(new FileWriter(file,append))){
			out.println("this is the first line");
			out.println(8);
			out.println(8651956);
			
			System.out.println("text writeen");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
