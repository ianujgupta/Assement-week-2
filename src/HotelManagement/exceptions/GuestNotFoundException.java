package org.dxctraining.HotelManagement.exceptions;

public class GuestNotFoundException extends RuntimeException{
	
	public GuestNotFoundException(String msg) {
		super(msg);
	}

}