package model;

import java.util.ArrayList;

public class Course {

	private String courseCode;
	private String courseName;
	private int credit;
	private CourseRegister courseRegister;
	private ArrayList<WrittenExam> writtenExamList = new ArrayList<WrittenExam>();

	//public Course(String courseName, String courseCode) {
	//	this.courseName = courseName;
		//this.courseCode = courseCode;
	//}

	

	public ArrayList<WrittenExam> getWrittenExamList() {
		return writtenExamList;
	}

	public void setWrittenExamList(ArrayList<WrittenExam> writtenExamList) {
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public void add(WrittenExam writtenExam) {
		this.writtenExamList.add(writtenExam);
	}

	public void remove(String examID) {
		WrittenExam tmpExam = this.findExam(examID);
		if (tmpExam != null){
			this.writtenExamList.remove(tmpExam);
		}
	}
	

	public CourseRegister getCourseRegister() {
		return courseRegister;
	}

	public void setCourseRegister(CourseRegister courseRegister) {
		this.courseRegister = courseRegister;
	}
	public WrittenExam findExam(String examID) {
		for (WrittenExam e : writtenExamList) {
			if (e.getExamID().equals(examID)) {

				return e;

			}
		}
		return null;
}
}
