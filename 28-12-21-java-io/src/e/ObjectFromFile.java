package e;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectFromFile {
	public static void main(String[] args) {
		
	
	
	Person p = new Person(207, "nicha", 22, "mahane");
	File file = new File ("files/person.obj");
	
	// object de-serialization
	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));){
		
		p = (Person )in.readObject();
		System.out.println(p);
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}