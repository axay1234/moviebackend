package com.example.springbootmovie;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieService extends JpaRepository<Movies, Integer>{

	
	@Query(name="getAllMovies" , value="select m from Movies m")
	public List<Movies> getAllMovies();
	
	public Movies getByName(String name); 
}
