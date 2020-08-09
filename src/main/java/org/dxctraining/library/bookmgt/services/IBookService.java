package org.dxctraining.library.bookmgt.services;
import org.dxctraining.library.bookmgt.entities.*;
import java.util.List;

public interface IBookService {

	public void addBook(Book book);

	public void bookDetails(Book book);

	public void remove(String id);

	public Book updateBook(String id, double cost);
	
	public Book updateBookName(String id,String Name);

	public Book findBookById(String id);

	 List<Book> findAllBook();
	
}
