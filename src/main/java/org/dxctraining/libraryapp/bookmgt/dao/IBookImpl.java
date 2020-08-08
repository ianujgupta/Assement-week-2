package org.dxctraining.libraryapp.bookmgt.dao;

import org.dxctraining.libraryapp.bookmgt.dao.*;
import org.dxctraining.libraryapp.bookmgt.entities.Book;
import java.util.*;

public interface IBookImpl {
	//public Book findById(Book book);

	void addBook(Book book);

	void bookDetails(Book book);

	void remove(String id);

	Book update(Book book);

	Book updateBook(String id, String name);

	public Book findById(String id);

	 List<Book> findAll();
}
