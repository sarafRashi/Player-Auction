package com.project.PlayerService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.PlayerService.Entity.Player;
import com.project.PlayerService.Service.PlayerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/players")
public class PlayerController
{
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/savePlayer")
	public ResponseEntity<?> savePlayer(@RequestBody Player player) //http://localhost:9002/players/savePlayer
	{
		return playerService.savePlayer(player);
	}
	
	@GetMapping("/findPlayerByTeamName/{teamName}") //http://localhost:9002/players/findPlayerByTeamName/
    public List<Player> findPlayerByTeamName(@PathVariable("teamName") String teamName) 
	{
		return playerService.findPlayerByTeamName(teamName);
    }
	
	@GetMapping("/findByPlayerId/{playerId}") //http://localhost:9002/players/findByPlayerId/
	public ResponseEntity<?> findByPlayerId(@PathVariable("playerId") int playerId)
	{
		return playerService.findByPlayerId(playerId);
	}
}