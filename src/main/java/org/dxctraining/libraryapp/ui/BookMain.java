package org.dxctraining.libraryapp.ui;

import java.util.*;

import java.util.HashMap;
import org.dxctraining.libraryapp.authormgt.entities.Author;
import org.dxctraining.libraryapp.bookmgt.entities.*;
import org.dxctraining.libraryapp.bookmgt.exceptions.BookNotFoundException;
import org.dxctraining.libraryapp.bookmgt.exceptions.InvalidArgumentException;
import org.dxctraining.libraryapp.bookmgt.services.BookServiceImpl;
import org.dxctraining.libraryapp.bookmgt.services.IBookService;

//import org.dxctraining.libraryapp.bookmgt.*;

public class BookMain {
	private IBookService bookService = new BookServiceImpl();

	private Map<String, Book> record = new HashMap<>();

	public static void main(String[] args) {
		BookMain main = new BookMain();
		main.runUi();
	}

	public void runUi() {

		try {
			Author author1 = new Author("linux", "Linus Torvald");
			Author author2 = new Author("java", "james Gosling");
			Author author3 = new Author("C", "yashwant kanetkar");
			Author author4 = new Author("C++", "");

			Book book1 = new Book("11", "Mohan", 2000, author1);
			Book book2 = new Book("22", "Sohan", 3000, author2);
			Book book3 = new Book("33", "Rohan", 4000, author3);
			Book book4 = new Book("44", "Gohan", 5000, author4);
			bookService.addBook(book1);
			bookService.addBook(book2);
			bookService.addBook(book3);
			bookService.addBook(book4);

			displayAll();

		} catch (BookNotFoundException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (InvalidArgumentException e) {
			String msg = e.getMessage();
			System.out.print(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayAll() {
		System.out.println("*******Book*************");
		List<Book> list = bookService.findAll();
		for (Book book : list) {
			display(book);
		}
	}

	public void display(Book book) {
		System.out.println("book-- " + book.getId() + " " + book.getName() + book.getCost());
		Author author = book.getAuthor();
		System.out.println("pancard " + author.getName() + " balance=" + author.getId());

	}
}
