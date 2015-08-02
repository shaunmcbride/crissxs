package com.crissxs.service.repository.graph;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.crissxs.service.domain.User;

@RepositoryRestResource
public interface UserRepository extends GraphRepository<User>{

}
