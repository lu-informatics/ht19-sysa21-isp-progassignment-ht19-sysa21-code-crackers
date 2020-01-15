package model;

import java.util.*;

public class Course {

	private String courseCode;
	private String name;
	private String credits;
	private List<WrittenExam> writtenExamList = new ArrayList<WrittenExam>();

	public Course(String courseName, String courseCredits) {
		this.name = courseName;
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
		return name;
	}

	public void setCourseName(String courseName) {
		this.name = courseName;
	}

	public String getCredit() {
		return credits;
	}

	public void setCredit(String credit) {
		this.credits = credit;
	}
	public WrittenExam findExam(String examID) {
		for(WrittenExam exam:writtenExamList) {
			if(exam.getExamID().equals(examID)) {
				return exam;
			}
		}
		return null;
	}
}
