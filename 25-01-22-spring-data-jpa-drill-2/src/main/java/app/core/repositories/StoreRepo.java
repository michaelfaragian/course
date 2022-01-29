package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Product;
import app.core.entities.Store;

public interface StoreRepo extends JpaRepository<Store, Integer> {
	
	List<Store> findAll();

	void saveProductByStore(int storeID, Product product);

}
