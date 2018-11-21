package com.example.springbootmovie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@ GetMapping(value="/hello")
	public String helloMapping() {
		return "Hello! Welcome to my Movie Project";
	}

	@GetMapping(value="/allmovies")
	public List<Movies> getAllMovies(){
		return movieService.findAll();
	}
	
	@GetMapping(value="/getmovie/{name}")
	public Movies getAllMovies(@PathVariable("name") String movienameInput) {
		System.out.println(movienameInput);
		return movieService.getByName(movienameInput);
	}
	
	@PostMapping(value="/addnewmovie")
	public Movies addMovie(@RequestBody Movies newMovie) {
		return movieService.save(newMovie);
	}
}
