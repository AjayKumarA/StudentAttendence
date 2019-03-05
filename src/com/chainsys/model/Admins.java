package com.chainsys.model;

import java.time.LocalDate;

public class Admins {
       private int adminId;
       private String adminName;
	private Long adminPhoneno;
       private String studentName;
       private String attendenceStatus;
       private LocalDate dates;
       
       
       
	public int getAdminId() {
   		return adminId;
   	}
   	public void setAdminId(int adminId) {
   		this.adminId = adminId;
   	}
   	public String getAdminName() {
   		return adminName;
   	}
   	public void setAdminName(String adminName) {
   		this.adminName = adminName;
   	}
   	public Long getAdminPhoneno() {
   		return adminPhoneno;
   	}
   	public void setAdminPhoneno(Long adminPhoneno) {
   		this.adminPhoneno = adminPhoneno;
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
		return "Admins [adminId=" + adminId + ", adminName=" + adminName
				+ ", adminPhoneno=" + adminPhoneno + ", studentName="
				+ studentName + ", attendenceStatus=" + attendenceStatus
				+ ", dates=" + dates + "]";
	}
	
}
