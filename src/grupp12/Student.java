package grupp12;
import java.util.*;
public class Student {
	private String studentID;
	private String name;
	private StudentRegister studentRegister;
	private ArrayList <Result> studentResult = new ArrayList<Result> ();
	
	
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

	public void setStudentResult(ArrayList<Result> studentResult) {
		this.studentResult = studentResult;
	}
	public ArrayList <Result> getStudentResult () {
		return studentResult;
	}

	public StudentRegister getStudentRegister() {
		return studentRegister;
	}
	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}
	
	public void addResult (Result result) {
		examresult.add(result);
	}
} 
