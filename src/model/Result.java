package model;

public class Result {

	private double result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenExam;

	public void setResult(double result) {
		this.result = result;
	}

	public double getResult() {
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
	
	public void CalcExamGrade(String letterGrade) {
		
	
			
			if(result < 50) {
				this.letterGrade = "U";
			}else if(result >= 50&& result< 55){
				this.letterGrade = "E";
			}else if(result >= 55 && result < 65) {
				this.letterGrade = "D";
			}else if(result >= 65 && result < 75) {
				this.letterGrade = "C";
			}else if(result >= 75 && result < 85) {
				this.letterGrade = "B";
			}else if(result >= 85 && result <=100) {
				this.letterGrade = "A";
			}
		}


}
