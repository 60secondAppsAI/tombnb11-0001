package com.tombnb11.dao;

import java.util.List;

import com.tombnb11.dao.GenericDAO;
import com.tombnb11.domain.Booking;





public interface BookingDAO extends GenericDAO<Booking, Integer> {
  
	List<Booking> findAll();
	






}


