package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.demo.dao.TeamDAO;
import com.example.demo.model.Player;
import com.example.demo.model.Team;

@SpringBootApplication
public class SpringBootDataJpaApplication {
	
	@Autowired
	TeamDAO teamDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Charlie Brown","pitcher"));
		players.add(new Player("Snoopy","shortstop"));
		Team team = new Team("peanuts","California",players);
		
		teamDao.save(team);
	}
}
