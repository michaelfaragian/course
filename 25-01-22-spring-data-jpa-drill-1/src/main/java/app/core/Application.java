package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.service.BookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		BookService service = ctx.getBean(BookService.class);
//		Book book = new Book(0, "cccac", "bbb", LocalDate.of(2000, 10, 10), 30, 0);
//		service.addbook(book);
//		System.out.println(service.getBookById(1)); 
//		service.updateBook(book);
//		service.deleteBook(1);
//		System.out.println(service.getBookByAuthor("aaa"));
//		System.out.println(service.findBooksByTitleStartingWith("a")); 
//		System.out.println(service.findBooksByPriceGreaterThanEqual(10));
//		System.out.println(service.findBooksByStockZero());
//		System.out.println(service.findBooksByPublicationUntil(LocalDate.of(2022, 1, 28)));
//		System.out.println(service.findBooksByPublicationBetween(LocalDate.of(2000, 1, 1), LocalDate.of(2022, 01, 20)));
//		System.out.println(service.findBooksTitle("aaa"));
//		System.out.println(service.existsByAuthor("aaa")); 
	}

}
