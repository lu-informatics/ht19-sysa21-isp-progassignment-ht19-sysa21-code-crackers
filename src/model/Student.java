package model;

import java.util.*;

public class Student {
	private String studentID;
	private String StudentName;
	private StudentRegister studentRegister;
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
	

	public StudentRegister getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}

	public String generateStudentID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();
		
		return String.format("S-%05d", rand.nextInt(range));
	}

}
