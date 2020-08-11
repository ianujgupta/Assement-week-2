package org.dxctraining.HotelManagement.dao;

import java.util.HashMap;
import java.util.Map;

import org.dxctraining.HotelManagement.entities.Guest;

public class GuestStore {
	private static Map<Integer, Guest> store = new HashMap<>();

	public static Map<Integer,Guest> getStore() {
		return store;
}
}