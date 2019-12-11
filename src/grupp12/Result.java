package grupp12;

import java.util.ArrayList;

public class Result {

	private int result;
	private int letterGrade;
	// private Student student;
	// private WrittenExam writtenexam;
	private ArrayList <Student> studentList = new ArrayList<Student> ();

	public void setResult(int result) {
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setLetterGrade(int letterGrade) {
		this.letterGrade = letterGrade;
	}

	public int getLetterGrade() {
		return letterGrade;
	}

	public void setStudentlist(ArrayList <Student> studentList) {
		this.studentList = studentList;
	}
	public ArrayList getStudentList() {
		return studentList;
	}
}