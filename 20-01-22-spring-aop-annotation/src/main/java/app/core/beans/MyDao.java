package app.core.beans;

import org.springframework.stereotype.Component;

import app.core.annotations.MyLogAnnotation;

@MyLogAnnotation // this annotation marks the method as join point
@Component
public class MyDao {
	
	public void save() {
		System.out.println("dao is saving");
	}
	public void find (int id) {
		System.out.println("dao is finding " + id);
	}
	public void delete() {
		System.out.println("dao is deleting ");
	}

}
