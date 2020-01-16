package model;

import java.util.*;

public class Student {
	private String studentID;
	private String name;
	private List<Result> studentResultList = new ArrayList<Result>();

	public Student(String studentName) {

		this.name = studentName;
	}

	public String getStudentName() {
		return name;
	}

	public void setStudentName(String studentName) {
		this.name = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setStudentResultList(List<Result> studentResultList) {
		this.studentResultList = studentResultList;
	}

	public List<Result> getStudentResultList() {
		return studentResultList;
	}

	public Result findResult(int result) {
		for (Result r : studentResultList) {
			if (r.getResult() == result) {
				return r;
			}
		}
		return null;
	}

	public void addResultToStudent(Result result) {
		this.studentResultList.add(result);
	}

}
