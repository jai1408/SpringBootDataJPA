package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TeamDAO;
import com.example.demo.model.Team;

@RestController
public class TeamController {
	
	@Autowired
	TeamDAO teamDao;
	
	
	@RequestMapping("/udemy/{name}")
	public Team getTeamDetails(@PathVariable String name) {
		return teamDao.findByName(name);
		
	}

}
