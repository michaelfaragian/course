package app.core.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // tell jpa that this a table
public class Person {
	
	@Id // tell jpa that this is a primary key
	private int id;
	private String name;
	private int age;

}
