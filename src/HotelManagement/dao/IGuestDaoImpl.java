package org.dxctraining.HotelManagement.dao;

import java.util.List;

import org.dxctraining.HotelManagement.entities.Guest;

public interface IGuestDaoImpl {
	
	public void addGuest(Guest guest);
	
	public void removeGuest(String id);
	
	public List<Guest> guestList();
	
	public Guest findGuest(String id);
}
