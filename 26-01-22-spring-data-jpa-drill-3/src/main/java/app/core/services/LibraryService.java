package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.repositories.BookRepo;
import app.core.repositories.LibraryRepo;

@Transactional
@Service
public class LibraryService {
	@Autowired
	LibraryRepo libraryRepo;
	@Autowired
	BookRepo bookRepo;

	
	public int addLibrary(Library library) {
		library = libraryRepo.save(library);
		return library.getId();
	} 
	
	public int addBook(Book book) {
		book = bookRepo.save(book);
		return book.getId();
	} 
	
	public void addBookToLibrary(Book book,int libraryId) {
		if(libraryRepo.existsById(libraryId)) {
			Library library = libraryRepo.findById(libraryId).get();
			library.se
			book.setLibraryId(libraryId);
			bookRepo.save(book);
		}else {
			System.out.println("ERROR: library "+ libraryId + " not found");
		}
	}
	public List<Book> getBookFromLibrary(int libraryId){
		Optional<Library> opt = libraryRepo.findById(libraryId);
		if(opt.isPresent()) {
			return bookRepo.findBookByLibraryId(libraryId);
		}else {
			System.out.println("ERROR: library "+ libraryId + " not found");
			return null;
		}
	}
}
