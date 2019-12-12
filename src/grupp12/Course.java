package grupp12;

import java.util.ArrayList;

public class Course {
	
	private static String courseCode;
	private String name;
	private int credit;
	private ArrayList <WrittenExam> writtenExamRegister = new ArrayList <WrittenExam>();
	private CourseRegister courseRegister;
	
	public static String getCourseCode() {
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
	
	public ArrayList <WrittenExam> getWrittenExamRegister() {
		return writtenExamRegister;
	}
	public void setWrittenExamRegister(ArrayList <WrittenExam> writtenExamRegister) {
		this.writtenExamRegister = writtenExamRegister;
	}
	public void addWrittenExam(WrittenExam exam) {
		writtenExamRegister.add(exam);
	}
	public void removeWrittenExam(WrittenExam exam) {
		writtenExamRegister.remove(exam);
	}
	public CourseRegister getCourseRegister() {
		return courseRegister;
	}
	public void setCourseRegister(CourseRegister courseRegister) {
		this.courseRegister = courseRegister;
	}
}
