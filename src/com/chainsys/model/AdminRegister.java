package com.chainsys.model;

import java.time.LocalDate;

public class AdminRegister {
	private int id;
	private String name;
	private String password;
	private LocalDate dob;
	private String email;
	private Long phoneno;

	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "AdminRegister [id=" + id + ", name=" + name + ", password="
				+ password + ", dob=" + dob + ", email=" + email + ", phoneno="
				+ phoneno + "]";
	}
}
