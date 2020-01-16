package model;

public class Result {

	private int result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenExam;

	public Result() { //int result, WrittenExam exam, Student student
		
		this.result = result;
		this.letterGrade = letterGrade;
		this.student = student;
		this.writtenExam = writtenExam;
		
	}
	
	public boolean setResult(int result) {
		boolean setResult = false;
		if(result <= 100 && result>=0) {
		this.result = result;
		setResult =true;
		}
		return setResult;
	}

	public int getResult() {
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

	public WrittenExam getWrittenExam() {
		return writtenExam;
	}

	public void setWrittenExam(WrittenExam writtenexam) {
		this.writtenExam = writtenexam;

	}

}
