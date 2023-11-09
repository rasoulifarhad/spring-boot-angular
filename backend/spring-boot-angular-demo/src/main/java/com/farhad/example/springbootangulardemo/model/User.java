package com.farhad.example.springbootangulardemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id 
	private int id;

	@Column private String firstName;
	@Column private String lastName;
	@Column private String username;
	@Column private String password;
}
