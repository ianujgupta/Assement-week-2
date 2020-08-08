package org.dxctraining.libraryapp.bookmgt.services;

import java.util.List;

import org.dxctraining.libraryapp.bookmgt.dao.*;
import org.dxctraining.libraryapp.bookmgt.entities.Book;
import org.dxctraining.libraryapp.bookmgt.exceptions.*;

public class BookServiceImpl implements IBookService {
	private IBookImpl dao =new BookImpl();
	
	@Override
	public Book findById(String id) {
		validateId(id);
		Book book = dao.findById(id);
		return book;
	}
	@Override
	public void addBook(Book book){
		dao.addBook(book);
	}
	@Override
	public void remove(String id) {
		validateId(id);
		dao.remove(id);
	}
	@Override
	public Book update(Book book) {
		return dao.update(book);
	}
	@Override
	public Book updateBook(String id, String name) {
		validateId(id);
		validateName(name);
		Book book = dao.updateBook(id, name);
		return book;
	}
	@Override
	public List<Book> findAll(){
		List <Book> book =dao.findAll();
		return book;
		
	}

	void validateName(String name) {
		if(name==null && name.isEmpty()){
			throw new InvalidArgumentException("Book Id can't be null or empty");
		}
	}
	
	void validateId(String id){
		if(id==null && id.isEmpty()) {
			throw new InvalidArgumentException("Book Id can't be null or empty");
		}
	}
	@Override
	public void bookDetails(Book book) {
		dao.bookDetails(book);
	}
	
}
