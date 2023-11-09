package com.farhad.example.springbootangulardemo.model.beer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "beers")
@Data
@NoArgsConstructor
public class Beer {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public Beer(String name) {
		this.name = name;
	}

	
}
