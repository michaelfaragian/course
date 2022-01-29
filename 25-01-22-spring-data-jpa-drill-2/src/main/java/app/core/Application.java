package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Product;
import app.core.entities.Store;
import app.core.services.MallService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MallService mallService = ctx.getBean(MallService.class);
		Store store = new Store(1, "aaa", null);
		Product product = new Product(0, "aaa", 15);
//		mallService.addStore(store);
//		mallService.getStore(4);
//		mallService.getAllStoresInmall();
//		mallService.updateStore(store);
//		mallService.deleteStore(3);
		mallService.addProductToStore(1, product);
		
		
		
		
	}

}
