package com.mito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mito.model.Persona;


@RestController
@RequestMapping("/HolaMundo")
public class HolaMundo {

	@GetMapping
	public Persona Saludar() {		
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Mundo");
		return per;
	}
}
