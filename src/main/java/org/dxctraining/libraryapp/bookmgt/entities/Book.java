package org.dxctraining.libraryapp.bookmgt.entities;
import org.dxctraining.libraryapp.authormgt.entities.*;

public class Book {
	private String id;
	private String name;
	private double cost;
	private Author author;
	
	public Book(String id,String name,double cost,Author author){
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.setAuthor(author);
	}
	
	
	
	public double getCost(){
		return cost;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name ) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}



	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
