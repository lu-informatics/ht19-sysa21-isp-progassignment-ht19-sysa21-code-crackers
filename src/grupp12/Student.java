package grupp12;
import java.util.*;
public class Student {
	private String studentID;
	private String name;
	private StudentRegister studentRegister;
	private ArrayList <Result> examresult = new ArrayList<Result> ();
	private ArrayList <WrittenExam> writtenExam = new ArrayList<WrittenExam> ();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	} 

	public void setExamresult(ArrayList<Result> examresult) {
		this.examresult = examresult;
	}
	public ArrayList <Result> getExamresult () {
		return examresult;
	}
	public ArrayList <WrittenExam> getWrittenExam() {
		return writtenExam;
	}
	public void setWrittenExam(ArrayList <WrittenExam> writtenExam) {
		this.writtenExam = writtenExam;
	}
	public StudentRegister getStudentRegister() {
		return studentRegister;
	}
	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}
}
