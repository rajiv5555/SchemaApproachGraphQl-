/**
 * 
 */
package com.example.LearningGraphQL.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rajivranjan
 *
 */
@Setter
@Getter
@Entity
@Table(name="Film")
@AllArgsConstructor
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FILM_ID")
	private Integer filmId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LAUNCH_YEAR")
	private String launchYear;

	/**
	 * 
	 */
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param launchYear
	 */
	public Film(String name, String launchYear) {
		super();
		this.name = name;
		this.launchYear = launchYear;
	}
	
	
	
	
	
	

}
