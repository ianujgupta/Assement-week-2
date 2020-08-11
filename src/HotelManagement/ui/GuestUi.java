package org.dxctraining.HotelManagement.ui;

import java.util.List;

import org.dxctraining.HotelManagement.entities.Guest;
import org.dxctraining.HotelManagement.services.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuestUi {
	@Autowired
	private IGuestService guestservice;
	
	private void runApp() {
		Guest guest1 = new Guest("Anuj", "1");
		Guest guest2 = new Guest("Ankit", "2");
		Guest guest3 = new Guest("Ayushi", "3");
		Guest guest4 = new Guest("rahul", "4");
		guestservice.addGuest(guest1);
		guestservice.addGuest(guest2);
		guestservice.addGuest(guest3);
		guestservice.addGuest(guest4);
		guestservice.removeGuest("3");

		guestList();
	}

	private void guestList() {
		List<Guest> list = guestservice.guestList();
		for (Guest guest : list) {
			display(guest);
		}
	}

	private void display(Guest guest) {
		System.out.println("Name is = " + guest.getName() + "id is = " + guest.getId());
	}

}
