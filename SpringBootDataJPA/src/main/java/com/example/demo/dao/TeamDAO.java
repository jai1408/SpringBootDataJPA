package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Team;

@RestResource(path = "teams",rel = "teams")
public interface TeamDAO extends CrudRepository<Team, Long>{
	
	public Team findByName(String name);

}
