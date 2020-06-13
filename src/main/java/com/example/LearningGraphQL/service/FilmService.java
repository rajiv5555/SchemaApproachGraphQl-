/**
 * 
 */
package com.example.LearningGraphQL.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.LearningGraphQL.model.Actor;
import com.example.LearningGraphQL.model.Film;
import com.example.LearningGraphQL.repository.FilmRepository;

/**
 * @author rajivranjan
 *
 */
@Service
public class FilmService implements GraphQLResolver<Actor> {

	@Autowired
	private FilmRepository filmRepo;
	
	private List<Film> films;
	
	@PostConstruct
    public void loadFilms() {
		films=Arrays.asList(
    			new Film(1,"3Idiot","12-02-1999"),
    			new Film(2,"3Idiot","12-02-1998")
    			);
    }
	
	public Film getFilm(Actor actor) {
		System.out.println("film data");
		Optional<Film> f=filmRepo.findById(actor.getActorId());
		return !f.isPresent()?films.stream().filter(i->i.getFilmId().equals(actor.getFilmId())).findFirst().get():f.get(); 
	}
}
