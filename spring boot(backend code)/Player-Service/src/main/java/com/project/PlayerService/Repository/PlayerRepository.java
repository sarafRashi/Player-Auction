package com.project.PlayerService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PlayerService.Entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

	List<Player> findByTeamName(String teamName);

	Player findByPlayerId(int playerId);

}
