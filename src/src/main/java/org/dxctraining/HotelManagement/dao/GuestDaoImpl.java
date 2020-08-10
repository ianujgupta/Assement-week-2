package org.dxctraining.HotelManagement.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dxctraining.HotelManagement.entities.Guest;
import org.dxctraining.HotelManagement.exceptions.GuestNotFoundException;
import org.dxctraining.HotelManagement.exceptions.InvalidArgumentException;

public class GuestDaoImpl implements IGuestDaoImpl {
	private Map<String, Guest> record = new HashMap<>();
	private int generateId;

	private String generateId() {
		String guestId = "" + generateId++;
		return guestId;
	}

	@Override
	public void addGuest(Guest guest) {
		String guestId = generateId();
		record.put(guestId, guest);
		guest.setId(guestId);

	}

	@Override
	public Guest findGuest(String id) {
		Guest guest = record.get(id);
		if (guest == null) {
			throw new GuestNotFoundException("Guest Not Found Exception for id = " + id);
		}
		return guest;
	}

	@Override
	public List<Guest> guestList() {
		Collection<Guest> value = record.values();
		List<Guest> list = new ArrayList<>();
		for (Guest values : value) {
			list.add(values);
		}
		return list;

	}

	@Override
	public void removeGuest(String id) {
		record.remove(id);

	}

	public void checkGuestId(Guest guest) {
		String id = guest.getId();
		if (id == null) {
			throw new InvalidArgumentException("Guest id can't be null" + id);
		}
	}

}
