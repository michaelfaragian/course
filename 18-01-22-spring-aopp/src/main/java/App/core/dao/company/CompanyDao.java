package App.core.dao.company;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {
	
	// business method 
	
	public void addCompany(int id, String name) {
		System.out.println("company added");
	}
	public void addCompany(Company company) {
		System.out.println("company added");
	}
	
	public void sayhello() {
		System.out.println("HELLO company dao");
	}

}
