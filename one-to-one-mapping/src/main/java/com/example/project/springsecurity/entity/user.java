package com.example.project.springsecurity.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "up_id")
	private userProfile userProfile;
	
	public user() {
		
	}
	/**
	 * @param name
	 * @param email
	 * @param userProfile
	 */
	public user(String name, String email, com.example.project.springsecurity.entity.userProfile userProfile) {
		super();
		this.name = name;
		this.email = email;
		this.userProfile = userProfile;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public userProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(userProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	
	
}
