package com.crissxs.service.domain;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@NodeEntity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	@GraphId
	Long id;

	private String title;
	
	
	@RelatedTo(type = "OWNS", direction = Direction.INCOMING)
	private Set<User> owner;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<User> getOwner() {
		return owner;
	}

	public void setOwner(Set<User> owner) {
		this.owner = owner;
	}

	/*
	 * Person director;
	 * 
	 * @RelatedTo(type="ACTS_IN", direction = INCOMING) Set<Person> actors;
	 * 
	 * @RelatedToVia(type = "RATED") Iterable<Rating> ratings;
	 * 
	 * @Query("start movie=node({self}) match movie-->genre<--similar return
	 * similar") Iterable<Movie> similarMovies;
	 */
}
