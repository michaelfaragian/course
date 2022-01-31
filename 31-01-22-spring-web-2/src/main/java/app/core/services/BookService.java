package app.core.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
import app.core.repositories.BookRepo;

@Transactional
@Service
public class BookService {

	@Autowired
	 private BookRepo bookRepo;
	
	
	public int addBook(Book book) {
		return bookRepo.save(book).getId();
	}
	public Book getBook(int bookId) {
		Optional<Book> opt = bookRepo.findById(bookId);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new RuntimeException("getBook failed - not found");
		}
	}
	public void deleteBook(int bookId) {
		bookRepo.deleteById(bookId);
	}
}
