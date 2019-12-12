package grupp12;

import java.util.ArrayList;

public class Result {

	private static int result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenexam;
	

	public void setResult(int result) {
		this.result = result;
	}

	public static int getResult() {
		return result;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getLetterGrade() {
		return letterGrade;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public WrittenExam getWrittenExam () {
		return writtenexam;
	}
	
	public void setWrittenExam (WrittenExam writtenexam) {
		this.writtenexam = writtenexam;
	}
	}

	
	
