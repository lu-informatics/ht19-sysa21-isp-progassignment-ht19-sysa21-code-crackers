package model;

import java.util.*;

public class Student {
	private String studentID;
	private String StudentName;
	private StudentRegister studentRegister;
	private ArrayList<Result> studentResultList = new ArrayList<Result>();
	

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setStudentResultList(ArrayList<Result> studentResultList) {
		this.studentResultList = studentResultList;
	}

	public ArrayList<Result> getStudentResultList() {
		return studentResultList;

	}

	public void addResultToStudent(Result result) {
		this.studentResultList.add(result);
	}
	public void addWrittenExamToStudent(WrittenExam exam) {
		this.studentResultList.add(exam);
	}
	

	public StudentRegister getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}



}
