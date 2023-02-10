package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepo;
import com.example.demo.models.User;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(JpaExampleApplication.class, args);
		UserRepo repo =  context.getBean(UserRepo.class);
		
		//SAVE
//		User user = new User();
//		user.setId(1);
//		user.setName("IT WALA");
//		
//		User result =  repo.save(user);
//		System.out.println("Result: " + result.toString());
		
		//SAVE ALL
//		User user1 = new User();
//		user1.setId(1);
//		user1.setName("A");
//		
//		User user2 = new User();
//		user2.setId(2);
//		user2.setName("B");
//		
//		List<User> list = List.of(user1, user2);
//		Iterable<User> result = repo.saveAll(list);
//		System.out.println(result.toString());
		
		//GET USER
//		Optional<User> user = repo.findById(1);
//		System.out.println(user.toString());
//
//		Optional<User> user1 = repo.findById(10);
//		System.out.println(user1.toString());
		
		//GET ALL USERS
//		Iterable<User> users = repo.findAll();
//		for (User user : users) {
//			System.out.println(user.toString());
//		}
		
		//UPDATE USER
//		Optional<User> user = repo.findById(1);
//		if(user.isEmpty()) return;
//		
//		user.get().setName("IT WALA");
//		repo.save(user.get());
		
		//DELETE USER
//		Optional<User> user = repo.findById(2);
//		if(user.isEmpty()) return;
//		
//		repo.delete(user.get());
		
		//GET USER BY NAME
//		List<User> users = repo.getUserByName("VAIBHAV");
//		System.out.println(users.toString());
		
		//GET USER BY NAME and ID
//		List<User> users = repo.findByNameAndId("VAIBHAV", 1);
//		System.out.println(users.toString());
//		
	}

}
