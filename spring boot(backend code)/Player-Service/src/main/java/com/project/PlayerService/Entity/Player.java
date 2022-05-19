package com.project.PlayerService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player 
{
	@Id
	@GeneratedValue
	private int playerId;
	private String playerName;
	private int budgetprice_in_$;
	private String teamName;
	private int teamId;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int budgetprice_in_$, String teamName, int teamId) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.budgetprice_in_$ = budgetprice_in_$;
		this.teamName = teamName;
		this.teamId = teamId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBudgetprice_in_$() {
		return budgetprice_in_$;
	}

	public void setBudgetprice_in_$(int budgetprice_in_$) {
		this.budgetprice_in_$ = budgetprice_in_$;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
