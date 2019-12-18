package model;

import java.util.*;

public class Student {
	private String studentID;
	private String StudentName;
	private StudentRegister studentRegister;
	private HashMap<String, Result> studentResultList = new HashMap<String, Result>();
	// private BasicCounter counter = new BasicCounter();

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

	public void setStudentResultList(HashMap<String, Result> studentResultList) {
		this.studentResultList = studentResultList;
	}

	public HashMap<String, Result> getStudentResultList() {
		return studentResultList;

	}

	public void addResultToStudent(Result result) {
		this.studentResultList.put(result.getResult(), result);
	}
	public void addWrittenExamToStudent(WrittenExam exam) {
		this.studentResultList.put(WrittenExam.getExamID(), exam);
	}
	

	public StudentRegister getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}



}
