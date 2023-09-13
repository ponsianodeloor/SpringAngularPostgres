package com.apptics.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apptics.api.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
