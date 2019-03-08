package com.chainsys.model;

import java.time.LocalDate;

public class Admins {
	int id;
	
	String name;
    Long Phonenumber;
    String studentName;
    String attendenceStatus;
    LocalDate dates;
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
	public Long getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAttendenceStatus() {
		return attendenceStatus;
	}
	public void setAttendenceStatus(String attendenceStatus) {
		this.attendenceStatus = attendenceStatus;
	}
	public LocalDate getDates() {
		return dates;
	}
	public void setDates(LocalDate dates) {
		this.dates = dates;
	}

@Override
public String toString() {
	return "Admins [id=" + id + ", name=" + name + ", Phonenumber="
			+ Phonenumber + ", studentName=" + studentName
			+ ", attendenceStatus=" + attendenceStatus + ", dates=" + dates
			+ "]";
}
}