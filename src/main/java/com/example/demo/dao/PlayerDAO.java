package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Player;
import com.example.demo.model.Team;

/*
 * path – This section is used to mention the segment under which the resource is to be exported.
 * collectionResourceRel – This value is used to generate links to the collection resource.
{
  "_links" : {
    "teams_rel" : {
      "href" : "http://localhost:8080/teams_path"
    },
    "players_rel" : {
      "href" : "http://localhost:8080/players_path"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile"
    }
*/
@RestResource(path = "players_path", rel = "players_rel")
public interface PlayerDAO extends CrudRepository<Player, Long> {

}
