package com.mito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mito.dao.IPersonaDao;
import com.mito.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao dao;

	@Override
	public Persona crear(Persona per) {
		return dao.save(per);
	}

	@Override
	public Persona modifirac(Persona per) {
		return dao.save(per);
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public void Elminar(Integer id) {
		dao.delete(id);
	}
	
	
	
	
}
