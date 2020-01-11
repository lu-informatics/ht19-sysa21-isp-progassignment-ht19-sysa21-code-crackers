package model;

import java.util.*;

public class Course {

	private String courseCode;
	private String courseName;
	private double credits;
	private List<WrittenExam> writtenExamList = new ArrayList<WrittenExam>();

	public Course(String courseCode, String courseName, double courseCredits) {
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.credits = courseCredits;
	}

	public List<WrittenExam> getWrittenExamList() {
		return writtenExamList;
	}

	public void setWrittenExamList(List<WrittenExam> writtenExamList) {
		this.writtenExamList = writtenExamList;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCredit() {
		return credits;
	}

	public void setCredit(double credit) {
		this.credits = credit;
	}

}
