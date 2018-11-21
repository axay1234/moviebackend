package com.example.springbootmovie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ GetMapping(value="/moviehello")
	public String helloMapping() {
		return "Hello! Welcome to my Movie Project";
	}

	@GetMapping(value="/allusers")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping(value="/getuser/{Username}")
	public User getAllUsers(@PathVariable("Username") String usernameInput) {
		System.out.println(usernameInput);
		return userService.getByUsername(usernameInput);
	}
	
	@PostMapping(value="/addnewuser")
	public User addUser(@RequestBody User newUser) {
		return userService.save(newUser);
	}
}
