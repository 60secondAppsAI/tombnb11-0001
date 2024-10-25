package com.tombnb11.dao;

import java.util.List;

import com.tombnb11.dao.GenericDAO;
import com.tombnb11.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


