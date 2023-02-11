package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User;

public interface UserRepo extends CrudRepository<User, Integer>{

	public List<User> getUserByName(String name);
		
	public List<User> findByNameAndId(String name, int id);
	
	@Query("select user from User user")
	public List<User> getAllUsers();
	
	@Query("select user from User user where user.name =:name")
	public List<User> getUserByNamee(@Param("name") String name);
	
	@Query("select user from User user where user.name =:name and user.id =:id")
	public User getUserByNameeAndId(@Param("name") String name, @Param("id") int id);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getAllUserss();
	
	@Query(value = "select * from user where name =:name", nativeQuery = true)
	public List<User> getUserByNameee(@Param("name") String name);
	
	@Query(value = "select * from user where name =:name and id =:id", nativeQuery = true)
	public User getUserByNameeAndIdd(@Param("name") String name, @Param("id") int id);
	
}
