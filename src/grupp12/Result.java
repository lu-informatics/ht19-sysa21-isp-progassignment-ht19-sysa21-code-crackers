package grupp12;

import java.util.ArrayList;

public class Result {

	private int result;
	private int letterGrade;
	// private Student student;
	// private WrittenExam writtenexam;
	private ArrayList<WrittenExam> writtenexam = new ArrayList<WrittenExam>();
	private ArrayList<Student> studentlist = new ArrayList<Student>();

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

	
	

	 public void setWrittenExam(ArrayList <WrittenExam> writtenexam) {
	 this.writtenexam = writtenexam;
	 }

	public ArrayList<WrittenExam> getWrittenexam() {
		return writtenexam;
	}

	public void setStudentlist(ArrayList<Student> studentlist) {
		this.studentlist = studentlist;
	}

	public ArrayList<Student> getStudentlist() {
		return studentlist;
	}

	public void addResult(Student result) {
		studentlist.add(result);
	}

	public void addLetterGrade(WrittenExam letterGrade) {
		writtenexam.add(letterGrade);
	}

	public void addWrittenExam(WrittenExam writtenExam) {
		writtenexam.add(writtenExam);
		// TODO Auto-generated method stub
		
	}

	public void addStudent(Student student) {
		studentlist.add(student);
		// TODO Auto-generated method stub
		
	}
}