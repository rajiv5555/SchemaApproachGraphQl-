/**
 * 
 */
package com.example.LearningGraphQL.model;

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
@Getter
@Setter
@Entity
@Table(name="Actor")
@AllArgsConstructor
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACTOR_ID")
	private Integer actorId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="FILM_ID")
	private Integer filmId;
	

	/**
	 * 
	 */
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param dob
	 * @param address
	 * @param filmId
	 */
	public Actor( String firstName, String lastName, String dob, String address, Integer filmId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.filmId = filmId;
	}
	
	
	

}
