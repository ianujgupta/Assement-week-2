package org.dxctraining.libraryapp.bookmgt.services;

import java.util.List;

import org.dxctraining.libraryapp.bookmgt.entities.Book;

public interface IBookService {

	public void addBook(Book book);

	public void bookDetails(Book book);

	public void remove(String id);

	public Book update(Book book);

	public Book updateBook(String id, String name);

	public Book findById(String id);

	 List<Book> findAll();
	
}
