package grupp12;

import java.util.ArrayList;

public class Course {
	


	private String courseCode;

	private String name;
	private int credit;
	private ArrayList <Writtenexam> writtenExamRegister = new ArrayList <Writtenexam>();
	private CourseRegister courseRegister;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {

		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public ArrayList <Writtenexam> getWrittenExamRegister() {
		return writtenExamRegister;
	}
	public void setWrittenExamRegister(ArrayList <Writtenexam> writtenExamRegister) {
		this.writtenExamRegister = writtenExamRegister;
	}
	public void addWrittenExam(Writtenexam exam) {
		writtenExamRegister.add(exam);
	}
	public void removeWrittenExam(Writtenexam exam) {
		writtenExamRegister.remove(exam);
	}
	public CourseRegister getCourseRegister() {
		return courseRegister;
	}
	public void setCourseRegister(CourseRegister courseRegister) {
		this.courseRegister = courseRegister;
	}
}
