package com.tombnb11.dao;

import java.util.List;

import com.tombnb11.dao.GenericDAO;
import com.tombnb11.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


