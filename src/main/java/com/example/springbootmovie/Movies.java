package com.example.springbootmovie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movies {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Director")
	private String Director;
	
	@Column(name="Actor")
	private String Actor;
	
	@Column(name="Actress")
	private String Actress;
	
	@Column(name="ImagePath")
	private String ImagePath;
	
	@Column(name="Trailer")
	private String Trailer;
	
	@Column(name="Duration_min")
	private String Duration_min;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String actor) {
		Actor = actor;
	}

	public String getActress() {
		return Actress;
	}

	public void setActress(String actress) {
		Actress = actress;
	}

	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}

	public String getTrailer() {
		return Trailer;
	}

	public void setTrailer(String trailer) {
		Trailer = trailer;
	}

	public String getDuration_min() {
		return Duration_min;
	}

	public void setDuration_min(String duration_min) {
		Duration_min = duration_min;
	}
	
	
	
	
}
