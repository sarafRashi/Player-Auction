package com.project.TeamService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Team 
{
	@Id
	@GeneratedValue
	private int teamId;
	private String teamName;
	private int maximumBudget_in_$;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, int maximumBudget_in_$) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.maximumBudget_in_$ = maximumBudget_in_$;
	}
	
	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMaximumBudget_in_$() {
		return maximumBudget_in_$;
	}

	public void setMaximumBudget_in_$(int maximumBudget_in_$) {
		this.maximumBudget_in_$ = maximumBudget_in_$;
	}
}