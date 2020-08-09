package org.dxctraining.library.bookmgt.dao;
import org.dxctraining.library.bookmgt.entities.Book;
import java.util.*;

public interface IBookImpl {
	
	void addBook(Book book);

	void bookDetails(Book book);

	void remove(String id);
	
	public Book updateBookName(String id, String name);

	public Book findBookById(String id);

	 List<Book> findAllBooks();

	Book updateBook(String id, double cost);
}
