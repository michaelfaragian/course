package app.core.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	
	boolean existsByTitle(String title);
	boolean existsByAuthor(String author);	
	List<Book> findBooksByAuthor(String author);
	List<Book> findBooksByTitleStartingWith(String title);
	List<Book> findBooksByPriceGreaterThanEqual(double price);
	List<Book> findBooksByStock(int zero);
	List<Book> findBooksByPublicationBefore(LocalDate date);
	List<Book> findBooksByPublicationBetween(LocalDate date1, LocalDate date2);
	List<Book> findBooksByTitle(String title);
	
	
	
	
	

}
