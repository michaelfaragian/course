package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.repositories.LibraryRepo;
import app.core.services.LibraryService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		LibraryService libraryService = ctx.getBean(LibraryService.class);

		Library library1 = new Library(0, "aaa", "aaa", null);
		Library library2 = new Library(0, "bbb", "bbb", null);
		libraryService.addLibrary(library1);
		libraryService.addLibrary(library2);
		
		for (int i = 0; i < 11; i++) {
			Book book1 = new Book(i, "aaa", "aaa", LocalDate.now(),null);
			libraryService.addBookToLibrary(book1, library1.getId());
		}
		for (int i = 0; i < 11; i++) {
			Book book2 = new Book(i, "bbb", "bbb", LocalDate.now(),null);
			libraryService.addBookToLibrary(book2, library2.getId());
			
		}
		
		
	}

}
