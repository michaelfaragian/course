package e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectToFile {
	public static void main(String[] args) {
		
	
	
	Person p = new Person(207, "nicha", 22, "mahane");
	File file = new File ("files/person.obj");
	
	// object serialization
	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));){
		out.writeObject(p);
		System.out.println("object wrriten");
		System.out.println(p);
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}