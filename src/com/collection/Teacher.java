package com.collection;

import java.util.List;

public class Teacher {
	
	private int tid;
	private String tname;
	private String position;
	private int salary;
	private List<Student> students;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, String position, int salary, List<Student> students) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.position = position;
		this.salary = salary;
		this.students = students;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", position=" + position + ", salary=" + salary
				+ ", students=" + students + "]";
	}
	
	

}
