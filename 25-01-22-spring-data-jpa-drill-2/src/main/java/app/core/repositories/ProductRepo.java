package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	void saveProduct(int storeID, Product product);

}
