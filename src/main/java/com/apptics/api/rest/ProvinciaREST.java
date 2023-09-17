package com.apptics.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apptics.api.model.Provincia;
import com.apptics.api.service.ProvinciaService;

@RestController
@RequestMapping("/provincias/")
public class ProvinciaREST {

	@Autowired
	private ProvinciaService provinciaService;
	
	@GetMapping
	private ResponseEntity<List<Provincia>> getAllProvincias(){
		return ResponseEntity.ok(provinciaService.findAll());
	}
	 
	@GetMapping ("{id}")
	private ResponseEntity<List<Provincia>> getAllProvinciasByPais (@PathVariable("id") Long paisId){
		return ResponseEntity.ok(provinciaService.findAllByPais(paisId));
		
	}

}
