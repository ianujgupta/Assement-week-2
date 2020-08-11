package org.dxctraining.HotelManagement.services;

import java.util.List;

import org.dxctraining.HotelManagement.dao.GuestDaoImpl;
import org.dxctraining.HotelManagement.dao.IGuestDaoImpl;
import org.dxctraining.HotelManagement.entities.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GuestService implements IGuestService {
	@Autowired
	private IGuestDaoImpl dao;

	@Override
	public void addGuest(Guest guest) {
		dao.addGuest(guest);
	}

	@Override
	public void removeGuest(String id) {
		dao.removeGuest(id);
	}

	@Override
	public List<Guest> guestList() {
		 return dao.guestList();
	}

	@Override
	public Guest findGuest(String id) {
		validateId(id);
		return dao.findGuest(id);
	}
	
    private void validateId(String id) {
        if(id==null || id.isEmpty())
        {
            throw  new NullPointerException("id cant be empty and null");
        }
    }

}
