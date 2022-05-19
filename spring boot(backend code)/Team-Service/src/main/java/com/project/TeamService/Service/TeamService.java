package com.project.TeamService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.TeamService.Entity.Team;
import com.project.TeamService.Repository.TeamRepository;
import com.project.TeamService.model.Player;

@Service
public class TeamService
{
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private RestTemplate template;

	//create team and validate if team already exists or not
	public ResponseEntity<?> checkValidTeam(Team teamData)
	{
		
		if(teamRepository.findByTeamName(teamData.getTeamName()) != null)
		{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();	
		}
		teamRepository.save(teamData);
		return ResponseEntity.ok(teamData);	
	}

	//find player details by giving team name
	public Player[] findPlayerByTeamName(String teamName) 
	{
		ResponseEntity<Player[]> response =
				  template.getForEntity(
						  "http://PLAYER-SERVICE/players/findPlayerByTeamName/" +teamName,
						  Player[].class);
		
		Player[] p = response.getBody();
		return p;
	}
	
	//find team details by giving team name
	public Team findTeamDetails(String teamName)
	{
		return teamRepository.findByTeamName(teamName);
	}
}