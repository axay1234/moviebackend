package com.example.springbootmovie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ GetMapping(value="/hello")
	public String helloMapping() {
		return "Hello! Welcome to my Movie Project";
	}

	@GetMapping(value="/allusers")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping(value="/getuser/{Username}")
	public User getAllUsers(@PathVariable("Username") String usernameInput) {
		return userService.getByUsername(usernameInput);
	}
	
	@GetMapping(value="/addnewuser")
	public User addUser(@RequestBody User newUser) {
		return userService.save(newUser);
	}
}
