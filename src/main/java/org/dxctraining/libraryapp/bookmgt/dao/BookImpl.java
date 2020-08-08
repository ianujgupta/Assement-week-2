package org.dxctraining.libraryapp.bookmgt.dao;
import org.dxctraining.libraryapp.bookmgt.entities.Book;
import org.dxctraining.libraryapp.bookmgt.exceptions.*;

import java.util.*;

public class BookImpl implements IBookImpl {
	private Map<String,Book> record = new HashMap<>();
	
	private int generateId;
	
	private String generateId(){
	String str =	" "+ generateId++;
		//String strId = String.valueOf("generateId++");
		return str;
	}
	
	 public List<Book> findAll(){
		Collection <Book> values =record.values(); 
		List<Book> list= new ArrayList<>();
		for(Book value:values) {
			list.add(value);
		}
		return list;
	}
	/*
	@Override
	public Book findById(Book book) {
		String id =book.getId();
		if(id==null){
			throw new BookNotFoundException("book not Found"+id);
		}
		return book;
	}*/
	
	private void checkId(Book book) {
		String id = book.getId();
		if(id==null) {
			throw new InvalidArgumentException("book can't be null"+id);
		}
	}

	@Override
	public void addBook(Book book) {
		String id =generateId();
		record.put(id,book);
		book.setId(id);
	}

	@Override
	public void bookDetails(Book book) {
		checkId(book);
		String detail=book.getId();
		record.get(detail);	
	}
	
	@Override
	public Book update(Book book){
		String id= book.getId();
		record.put(id,book);
		return book;
	}

	@Override
	public void remove(String id) {
		record.remove(id);
		
	}

	@Override
	public Book updateBook(String id, String name) {
		Book book=findById(id);
		book.setName(name);
		return book;
	}

	@Override
	public Book findById(String id) {
		boolean exists = record.containsKey(id);
		if(!exists) {
			throw new BookNotFoundException("Book not Found of id "+ id);
		}
		Book book =record.get(id);
		return book;
		
	}

	
}
