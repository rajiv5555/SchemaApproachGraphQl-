/**
 * 
 */
package com.example.LearningGraphQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LearningGraphQL.model.Film;

/**
 * @author rajivranjan
 *
 */
@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {

}
