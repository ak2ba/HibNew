package com.hib.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project")
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pid")
	private int pid;
	@Column(name="pname")
	private String pname;
	@Column(name="noOfHours")
	private int noOfHours;
	@Column(name="marks")
	private int marks;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "projectList")
	private List<StudentDemo> studentList;
	
	
	public List<StudentDemo> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<StudentDemo> studentList) {
		this.studentList = studentList;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Project(int pid, String pname, int noOfHours, int marks) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.noOfHours = noOfHours;
		this.marks = marks;
	}
	public Project(String pname, int noOfHours, int marks) {
		super();
		this.pname = pname;
		this.noOfHours = noOfHours;
		this.marks = marks;
	}
	public Project() {
		super();
	}
	
}
