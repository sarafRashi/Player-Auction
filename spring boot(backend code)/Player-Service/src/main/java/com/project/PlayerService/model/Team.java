package com.project.PlayerService.model;

public class Team 
{
	private int teamId;
	private int maximumBudget_in_$;
	private String teamName;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, int maximumBudget_in_$,
			String teamName) {
		super();
		this.teamId = teamId;
		this.maximumBudget_in_$ = maximumBudget_in_$;
		this.teamName = teamName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public int getMaximumBudget_in_$() {
		return maximumBudget_in_$;
	}

	public void setMaximumBudget_in_$(int maximumBudget_in_$) {
		this.maximumBudget_in_$ = maximumBudget_in_$;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}