package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentpN;
	private String studentCity;
	public Student(int studentId, String studentName, String studentCity,  String studentpN) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentpN = studentpN;
		this.studentCity = studentCity;
	}
	public Student(String studentName, String studentCity, String studentpN) {
		super();
		this.studentName = studentName;
		this.studentpN = studentpN;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentpN() {
		return studentpN;
	}
	public void setStudentpN(String studentpN) {
		this.studentpN = studentpN;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentpN=" + studentpN
				+ ", studentCity=" + studentCity + "]";
	}
	
	
}
