package com.project.TeamService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.TeamService.Entity.Team;
import com.project.TeamService.Service.TeamService;
import com.project.TeamService.model.Player;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/teams")
public class TeamController 
{
	@Autowired
	private TeamService teamService;
	
	@PostMapping("/saveTeam") //http://localhost:9001/teams/saveTeam
	public ResponseEntity<?> saveTeam(@RequestBody Team teamData)
	{
		return teamService.checkValidTeam(teamData);
	}
	
	 @GetMapping("/{teamName}") //http://localhost:9001/
	 public Player[] findPlayerByTeamName(@PathVariable("teamName") String teamName)
	 {
	        return teamService.findPlayerByTeamName(teamName);
	 }
	 
	 @GetMapping("/findTeamDetails/{teamName}") //http://localhost:9001/findTeamDetails/
	 public Team findTeamDetails(@PathVariable("teamName") String teamName)
	 {
		 return teamService.findTeamDetails(teamName);
	 }	 
}