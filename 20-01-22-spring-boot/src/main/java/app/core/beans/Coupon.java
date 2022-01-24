package app.core.beans;

import java.time.LocalDate;

import lombok.Data;


@Data

public class Coupon {
	
	
	private int id ;
	private String title;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private int amount;
		
	

}
