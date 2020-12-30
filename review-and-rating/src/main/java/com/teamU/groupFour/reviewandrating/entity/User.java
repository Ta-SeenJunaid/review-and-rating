package com.teamU.groupFour.reviewandrating.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	@JsonIgnore
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "roles")
	private String roles;
	@Column(name = "active")
	private boolean active;

}
