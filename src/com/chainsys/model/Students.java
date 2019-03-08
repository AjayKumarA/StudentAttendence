package com.chainsys.model;

public class Students {
	   private  int id;
       private  String name;
	   private  String rollno;
       private  String clas;
       private  String gender;
       private  String address;
       private  Long phoneno;
       private  String email;
       private  String password;
       public void setId(int id) {
   		this.id = id;
   	}
       public int getId() {
   		return id;
   	}
       public String getName() {
   		return name;
   	}
       public void setName(String name) {
   		this.name = name;
   	}
   	public String getRollno() {
   		return rollno;
   	}
   	public void setRollno(String rollno) {
   		this.rollno = rollno;
   	}
   	public String getClas() {
   		return clas;
   	}
   	public void setClas(String clas) {
   		this.clas = clas;
   	}
   	public String getGender() {
   		return gender;
   	}
   	public void setGender(String gender) {
   		this.gender = gender;
   	}
   	public String getAddress() {
   		return address;
   	}
   	public void setAddress(String address) {
   		this.address = address;
   	}
   	public Long getPhoneno() {
   		return phoneno;
   	}
   	public void setPhoneno(Long phoneno) {
   		this.phoneno = phoneno;
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
	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + ", clas="
				+ clas + ", gender=" + gender + ", address=" + address
				+ ", phoneno=" + phoneno + ", email=" + email + ", password="
				+ password + "]";
	}
}
