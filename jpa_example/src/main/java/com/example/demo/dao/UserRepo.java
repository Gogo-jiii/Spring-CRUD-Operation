package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

public interface UserRepo extends CrudRepository<User, Integer>{

	public List<User> getUserByName(String name);
		
	public List<User> findByNameAndId(String name, int id);
}
