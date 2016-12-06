package org.fiveware.test.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.fiveware.test.model.enums.GenreType;

@Entity
@Table(name = "insured")
public class Insured {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private GenreType genreType;
	
	private String ageGroup;


	public String getAgeGroup() {
		return ageGroup;
	}


	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public GenreType getGenreType() {
		return genreType;
	}


	public void setGenreType(GenreType genreType) {
		this.genreType = genreType;
	}
	
	
	
	
	
	


	
}
