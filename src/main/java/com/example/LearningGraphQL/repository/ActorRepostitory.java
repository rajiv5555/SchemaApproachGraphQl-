/**
 * 
 */
package com.example.LearningGraphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LearningGraphQL.model.Actor;

/**
 * @author rajivranjan
 *
 */
@Repository
public interface ActorRepostitory extends JpaRepository<Actor,Integer>{

}
