/**
 * 
 */
package com.crissxs.service.repository.graph;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.crissxs.service.domain.Event;

public interface EventRepository extends GraphRepository<Event> {

}
