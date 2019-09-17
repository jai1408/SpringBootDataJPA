package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

@RestResource(path = "players",rel = "players")
public interface PlayerDAO extends CrudRepository<Player, Long>{
	
}
