package model;

import java.util.*;

import control.StudentController;

public class Student {
	private String studentID;
	private String StudentName;
	private StudentController studentRegister;
	private ArrayList<Result> studentResultList = new ArrayList<Result>();
	

	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.StudentName = studentName;
	}

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
	
	public Result findResult(int result) {
		for (Result r : studentResultList) {
			if(r.getResult() ==result) {
				return r;
			}
		}
		return null;
	}

	public void addResultToStudent(Result result) {
		this.studentResultList.add(result);
	}
	//public void addWrittenExam(Result result, String examID) {
		//for(Result r : studentResultList) {
		
				
				
		//	}
		//}
		
		
//	}
	

	public StudentController getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(StudentController studentRegister) {
		this.studentRegister = studentRegister;
	}

}
