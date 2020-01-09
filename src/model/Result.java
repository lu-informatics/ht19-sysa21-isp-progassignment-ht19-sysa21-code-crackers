package model;

public class Result {

	private int result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenExam;

	public void setResult(int result) {
		this.result = result;
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
	
/*	public void generateLetterGrade() {
		int res = this.getResult();
		
		if(res >= 85) {
			this.setLetterGrade("A");
		}
		if(res >= 75 && res )
	}
	
}
*/

	

}

