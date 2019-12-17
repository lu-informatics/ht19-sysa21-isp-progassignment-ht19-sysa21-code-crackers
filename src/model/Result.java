package model;

public class Result {

	private String result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenExam;

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
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
