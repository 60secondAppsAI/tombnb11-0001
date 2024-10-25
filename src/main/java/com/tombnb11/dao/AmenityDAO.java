package com.tombnb11.dao;

import java.util.List;

import com.tombnb11.dao.GenericDAO;
import com.tombnb11.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


