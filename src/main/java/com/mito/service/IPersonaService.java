package com.mito.service;

import java.util.List;

import com.mito.model.Persona;

public interface IPersonaService {

	public Persona crear(Persona per);	
	public Persona modifirac(Persona per); 
	public List<Persona> listar();
	public Persona listarPorId(Integer id);
	public void Elminar(Integer id);
		
}
