package com.phantom.formula1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phantom.formula1.dto.TeamsDTO;
import com.phantom.formula1.entity.Teams;
import com.phantom.formula1.repository.TeamsRepository;

import jakarta.transaction.Transactional;

@Service

public class TeamsService {
	
	@Autowired
	TeamsRepository teamsRepo;
	@Transactional
	public void addTeam(Teams team) {
		teamsRepo.save(team);
	}
	public List<Teams> getAllTeams(){
		return (List<Teams>)teamsRepo.findAll();
	}
	public Teams getTeambyId(Integer id) {
		return teamsRepo.findById(id).orElse(null);
	}
	public String deleteTeamById(Integer id) {
		 try{
			 teamsRepo.deleteById(id);
		 }
		 catch(Exception error) {
			 System.out.println(error.getMessage());
		 }
		 return "Deletion Successful";
	}
	public String deleteAllTeams() {
		teamsRepo.deleteAll();
		return "Deletion Successful";
	}
	public String updateById(Integer id,Teams team) {
		Teams oldTeam= getTeambyId(id);
		oldTeam.setName(team.getName());
		oldTeam.setDriver1(team.getDriver1());
		oldTeam.setDriver2(team.getDriver2());
		teamsRepo.save(oldTeam);
		return "Updated Successfully";
	}
}
