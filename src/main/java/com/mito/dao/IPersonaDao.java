package com.mito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mito.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Integer> {
	
	
	
}
