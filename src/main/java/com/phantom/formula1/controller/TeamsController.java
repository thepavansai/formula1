package com.phantom.formula1.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phantom.formula1.dto.TeamsDTO;
import com.phantom.formula1.entity.Teams;
import com.phantom.formula1.service.TeamsService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TeamsController {
	@Autowired
	TeamsService teamsService;
	@Autowired
	ModelMapper modelMapper;
	public Teams dtoToEntity(TeamsDTO team) {
		Teams newTeam= new Teams();
		newTeam.setName(team.getName());
		newTeam.setDriver1(team.getDriver1());
		newTeam.setDriver2(team.getDriver2());
		return newTeam;
	}
	
	public TeamsDTO entityToDTO(Teams team) {
		TeamsDTO newTeam= new TeamsDTO();
		newTeam.setName(team.getName());
		newTeam.setDriver1(team.getDriver1());
		newTeam.setDriver2(team.getDriver2());
		return newTeam;
	}
	
	@PostMapping("/f1")
	public String addTeams(@RequestBody TeamsDTO teamsdto) {
//		Teams team =dtoToEntity(teamsdto);
		
		teamsService.addTeam(modelMapper.map(teamsdto, Teams.class));
		
		return "Inserted";
	}
	
	@GetMapping("/f1")
	public List<TeamsDTO> getAllTeams() {
		System.out.print(teamsService.getAllTeams());
		return teamsService.getAllTeams().stream().map(Teams->modelMapper.map(Teams,TeamsDTO.class )).toList();
	}
	@GetMapping("/f1/{id}")
	public TeamsDTO getTeamsbyId(@PathVariable Integer id) {
		TeamsDTO team= modelMapper.map((teamsService.getTeambyId(id)),TeamsDTO.class);
		return team!=null ? team : new TeamsDTO();
	}
	@DeleteMapping("/f1/{id}")
	public String deleteById(@PathVariable Integer id) {
		return teamsService.deleteTeamById(id);
	}
	@DeleteMapping("/deleteAll")
	public String deleteAllTeamsDTO() {
		return teamsService.deleteAllTeams();
	}
}
