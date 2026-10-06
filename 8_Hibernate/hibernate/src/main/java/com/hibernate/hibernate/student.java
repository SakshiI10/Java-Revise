package com.hibernate.hibernate;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class student {
	@Id
	private int id;
	
	@Column(name="First_name")
	private String name;
	
	private String studentClass;
	
//	creating a reference to an object of the marks class.
	@Embedded
	private marks student_marks;
	public marks getStudent_marks() {
		return student_marks;
	}
	public void setStudent_marks(marks student_marks) {
		this.student_marks = student_marks;
	}

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
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", studentClass=" + studentClass + "]";
	}
	
}
