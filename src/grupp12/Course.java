package grupp12;

import java.util.ArrayList;

public class Course {
	
	private int courseCode;
	private String name;
	private int credit;
	private ArrayList <Writtenexam> writtenExamRegister = new ArrayList <Writtenexam>();
	
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
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
	
}
