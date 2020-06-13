/**
 * 
 */
package com.example.LearningGraphQL.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.LearningGraphQL.model.Actor;
import com.example.LearningGraphQL.repository.ActorRepostitory;

/**
 * @author rajivranjan
 *
 */
@Service
public class ActorService implements GraphQLQueryResolver{

	@Autowired
	private ActorRepostitory repo;
	
	private List<Actor> actors;
	
	@PostConstruct
    public void loadActors() {
    	actors=Arrays.asList(
    			new Actor(101,"Amir","khan","12-02-1991","Bangalore",1),
    			new Actor(102,"Salman","khan","12-02-1988","Delhi",2)
    			);
    }
	
	public List<Actor> getAllActors(){
		System.out.println("inside all");
		List<Actor> act= repo.findAll();
		return act.size()==0?actors:act;
	}
	
	public Actor getActorById(Integer id) {
		return actors.stream().filter(i->i.getActorId().equals(id)).findAny().get();
	}
}
