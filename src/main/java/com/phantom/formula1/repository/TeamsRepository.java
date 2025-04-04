package com.phantom.formula1.repository;

import org.springframework.data.repository.CrudRepository;

import com.phantom.formula1.entity.Teams;

public interface TeamsRepository extends CrudRepository<Teams, Integer> {
	
}
