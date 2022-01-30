package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import app.core.entities.Product;
import app.core.entities.Store;
import app.core.repositories.ProductRepo;
import app.core.repositories.StoreRepo;
@Transactional
@Service
public class MallService {
	
	@Autowired
	ProductRepo productRepo;
	@Autowired
	StoreRepo storeRepo;
	
	public int addStore(Store store) {
		storeRepo.save(store);
		return store.getId();
	}
	public Store getStore(int storeId) {
		Optional<Store> opt = storeRepo.findById(storeId);
		if(opt.isEmpty()) {
			throw new RuntimeException("getStore failed store "+ storeId+ " not exist");
		}else {
			System.out.println(storeRepo.getById(storeId));
			return storeRepo.getById(storeId);
		}
	}
	public List<Store> getAllStoresInmall(){
		System.out.println(storeRepo.findAll()); 
		return storeRepo.findAll();
	}
	public void updateStore(Store store) {
		Optional<Store> opt = storeRepo.findById(store.getId());
		if(opt.isPresent()) {
			storeRepo.save(store);			
		}else {
			throw new RuntimeException("updateStore failed");
		}
	}
	public void deleteStore (int storeId) {
		storeRepo.deleteById(storeId);
	}
	public int addProductToStore(Product product) {
		productRepo.save(product);
		return product.getId();
	}
	public Product getProduct(int productId) {
		Optional<Product> opt = productRepo.findById(productId);
		if(opt.isEmpty()) {
			throw new RuntimeException("getProduct failed product "+productId+" not exist");
		}else {
			return productRepo.getById(productId);
		}
	}

}
