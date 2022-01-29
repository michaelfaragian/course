package app.core.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Book;
import app.core.repositories.BookRepo;
@Transactional
@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
	
	public int addbook(Book book) {
		if(bookRepo.existsByTitle(book.getTitle())) {
			throw new RuntimeException("ERROR: the title " + book.getTitle() + " alrady exist");
		}else {
			bookRepo.save(book);
			return book.getId();
		}
	}
	public Book getBookById(int bookId) {
		 Optional<Book> opt = bookRepo.findById(bookId);
		 if(opt.isPresent()) {
			 return opt.get();
		 }else {
			 throw new RuntimeException("getBookById failed the book with id :" + bookId + " not exist");
		 }
	}
	public void updateBook(Book book) {
		Optional<Book> opt = bookRepo.findById(book.getId());
		if(opt.isEmpty()) {
			throw new RuntimeException("updateBook failed the book " + book.getId()+ " not exist");
		}
		Book book2 = opt.get();
		if(book.getTitle().equals(book2.getTitle())&& book.getAuthor().equals(book2.getAuthor())) {
			bookRepo.save(book);
		}else {
			throw new RuntimeException("you cannot update the title or author");
		}
	}
	public void deleteBook(int id) {
		Optional<Book> opt = bookRepo.findById(id);
		if(opt.isPresent()) {
			bookRepo.deleteById(id);
			System.out.println("book " + id+ " deleted");
		}else {
			throw new RuntimeException("deleteBook failed the book with id :" + id + " not exist");
		}
	}
	public List<Book>  getBookByAuthor(String author){
		List<Book> books= bookRepo.findBooksByAuthor(author);
		if(books.isEmpty()) {
			throw new RuntimeException("getBookByAuthor failed");
		}else {
			return books;
		}
	}
	public List<Book> findBooksByTitleStartingWith(String title){
		List<Book> books = bookRepo.findBooksByTitleStartingWith(title);
		if(books == null) {
			throw new RuntimeException("findBooksByTitleStartingWith failed");
		}
		return books;
	}
	public List<Book> findBooksByPriceGreaterThanEqual (double price){
		List<Book> books = bookRepo.findBooksByPriceGreaterThanEqual(price);
		return books;
	}
	public List<Book> findBooksByStockZero(){
		return bookRepo.findBooksByStock(0);
	}
	public List<Book> findBooksByPublicationUntil(LocalDate date){
		return bookRepo.findBooksByPublicationBefore(date);
	}
	 public List<Book> findBooksByPublicationBetween(LocalDate date1, LocalDate date2){
		return bookRepo.findBooksByPublicationBetween(date1 , date2);
	}
	public List<Book> findBooksTitle(String title){
		return bookRepo.findBooksByTitle(title);
	}
	
	public boolean existsByAuthor(String author) {
		return bookRepo.existsByAuthor(author);
	}
	
	
	

}
