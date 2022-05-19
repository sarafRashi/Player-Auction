package com.project.TeamService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TeamService.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{

	Team findByTeamName(String teamName);

}
