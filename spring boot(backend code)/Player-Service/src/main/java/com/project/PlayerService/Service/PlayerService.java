package com.project.PlayerService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.PlayerService.Entity.Player;
import com.project.PlayerService.Repository.PlayerRepository;
import com.project.PlayerService.model.Team;

@Service
public class PlayerService
{
	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private RestTemplate template;

	//find player details by giving team name
	public List<Player> findPlayerByTeamName(String teamName) 
	{
		return playerRepository.findByTeamName(teamName);
	}

	//find player details by giving player Id
	public ResponseEntity<?> findByPlayerId(int playerId)
	{
		if(playerRepository.findByPlayerId(playerId) == null)
		{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		return ResponseEntity.ok(playerRepository.findByPlayerId(playerId));	
	}
	
	//create player
	public ResponseEntity<?> savePlayer(Player player) 
	{	
		Team teamResponse = template.getForObject("http://TEAM-SERVICE/teams/findTeamDetails/" +player.getTeamName(), Team.class);
		
		int sum=0;
		List<Player> p=playerRepository.findByTeamName(teamResponse.getTeamName());
		for(Player p1:p)
		{
			sum=sum+p1.getBudgetprice_in_$();
		}
		
		if(sum<=teamResponse.getMaximumBudget_in_$())
		{
			sum=sum+player.getBudgetprice_in_$();
		}
		if(sum<=teamResponse.getMaximumBudget_in_$())
		{
			player.setTeamId(teamResponse.getTeamId());
			playerRepository.save(player);
			return ResponseEntity.ok(player);	
		}
		else 
		{
			player.setTeamId(0);
			player.setTeamName("NA");
			playerRepository.save(player);
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
}
