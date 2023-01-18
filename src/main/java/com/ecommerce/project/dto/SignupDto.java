package com.ecommerce.project.dto;

import java.util.List;

import javax.persistence.Column;

import com.ecommerce.project.model.UserRole;

public class SignupDto {

	private int userid;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private List<UserRole> roles;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	public SignupDto( String firstName, String lastName, String email, String password, List<UserRole> roles) {
		super();	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public SignupDto() {
		super();
		
	}

}
