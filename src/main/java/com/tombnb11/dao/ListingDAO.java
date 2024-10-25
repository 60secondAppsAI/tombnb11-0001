package com.tombnb11.dao;

import java.util.List;

import com.tombnb11.dao.GenericDAO;
import com.tombnb11.domain.Listing;





public interface ListingDAO extends GenericDAO<Listing, Integer> {
  
	List<Listing> findAll();
	






}


