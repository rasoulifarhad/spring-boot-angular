package com.farhad.example.springbootangulardemo.model.beer;

import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource
public interface BeerREpository extends JpaRepository<Beer, Long>{
	
}
