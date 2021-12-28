package d;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Calculator {
	private double res;
	
	public void storeResolt() {
		// object that can write binary java data to file
		File dir = new File("files"); // relative path- created in the program directory
		
		//File file = new File(dir , "res.data");
		// data * java primitives
		// DataOutputStream - can write java data to a stream 
		// DataOutputStream - the stream to write to is a binary file
	//	try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file));)
			//	{
			
	
			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	public void add(double val) {
		res += val;
	}
	public void sub(double val) {
		res -= val;
	}
	public void mul(double val) {
		res *= val;
	}
	public void div(double val) {
		res /= val;
	}

}
