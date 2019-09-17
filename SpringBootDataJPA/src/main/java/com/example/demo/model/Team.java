package com.example.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Team {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String location;
	private String mascotte;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Player> player;

	public Team() {
		super();
	}

	public Team(String name, String location, Set<Player> player) {
		this();
		this.name = name;
		this.location = location;
		//this.mascotte = mascotte;
		this.player = player;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascotte() {
		return mascotte;
	}

	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}

	public Set<Player> getPlayer() {
		return player;
	}

	public void setPlayer(Set<Player> player) {
		this.player = player;
	}

}
