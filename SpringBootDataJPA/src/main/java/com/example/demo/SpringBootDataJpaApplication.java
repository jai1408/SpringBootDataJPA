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
		Set<Player> players1 = new HashSet<Player>();
		players1.add(new Player("Charlie Brown","pitcher"));
		players1.add(new Player("Snoopy","shortstop"));
		
		Set<Player> players2 = new HashSet<Player>();
		players2.add(new Player("Jai","keeper"));
		
		Team team1 = new Team("lions","Gujrat",players1);
		Team team2 = new Team("rangers","Delhi",players2);
		
		teamDao.save(team1);
		teamDao.save(team2);
	}
}
