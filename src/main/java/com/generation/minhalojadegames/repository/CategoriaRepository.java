package com.generation.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhalojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
