package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Customer findByEmailAndPassword(String Email, String Password);

	boolean existsByEmailAndPassword(String Email, String Password);

	boolean existsByEmail(String Email);

}
