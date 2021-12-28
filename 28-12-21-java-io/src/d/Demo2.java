package d;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

public class Demo2 {

	public static void main(String[] args) {

		// 1. define a file to read from
		
		File file = new File("files/primitev.data");
		
		try( DataInputStream in = new DataInputStream(new FileInputStream(file));){
			// 2. read the data  - must to read like we write to the file
		//	out.writeByte(n2);
			//out.write(n1);
		//	out.writeDouble(n3);
		//	out.writeLong(n4);
		//	out.writeBoolean(b);
			
			byte x1 = in.readByte();
			int x2 = in.readInt();
			double x3 = in.readDouble();
			long x4 = in.readLong();
			boolean x5 = in.readBoolean();
			
			
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(x3);
			System.out.println(x4);
			System.out.println(x5);
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
