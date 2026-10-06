package com.hibernate.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class marks { 	
	private double engMarks;
	private double compMarks;
	private double mathMarks;
	
	public double getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(double engMarks) {
		this.engMarks = engMarks;
	}
	public double getCompMarks() {
		return compMarks;
	}
	public void setCompMarks(double compMarks) {
		this.compMarks = compMarks;
	}
	public double getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(double mathMarks) {
		this.mathMarks = mathMarks;
	}
	
}
