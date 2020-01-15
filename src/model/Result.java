package model;

public class Result {

	private int result;
	private String letterGrade;
	private Student student;
	private WrittenExam writtenExam;

	public Result() {
		
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
	
	public void generateLetterGrade(String examID, Student student, int points) {
		Result result = new Result();
		

		WrittenExam ex = result.getWrittenExam();
		result.setStudent(student);
		result.setWrittenExam(ex);
		result.setResult(points);
		result.setLetterGrade(this.calcExamGrade(points));
		ex.addResultforExam(result);

	}

	public String calcExamGrade(int result) {

		if (result >= 50 && result < 55) {
			return "E";
		} else if (result >= 55 && result < 65) {
			return "D";
		} else if (result >= 65 && result < 75) {
			return "C";
		} else if (result >= 75 && result < 85) {
			return "B";
		} else if (result >= 85 && result <= 100) {
			return "A";
		} else {
			return "Fail";
		}
	}

}
