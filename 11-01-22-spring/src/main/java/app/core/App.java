package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {

		// create spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Person p = ctx.getBean(Person.class);
		p.setName("micha");
		
		Person p2 = ctx.getBean(Person.class);
		p2.setAge(18);
		Person p3 = ctx.getBean(Person.class);
		p3.setId(21894568);
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		
		ctx.close();
	}

}
