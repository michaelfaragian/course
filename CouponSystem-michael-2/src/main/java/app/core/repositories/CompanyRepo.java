package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Company;
import app.core.exception.CouponSystemException;

public interface CompanyRepo extends JpaRepository<Company, Integer> {
	
	
	Company findCompanyByEmailAndPassword(String email, String password);
	
	boolean existsByNameOrEmail (String name, String Email);
	
	boolean existsByNameAndEmail (String name, String Email);
	
	Company findByNameAndEmail (String name, String Email);

}
