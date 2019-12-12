package grupp12;
import java.util.*;
public class Student {
	private static String studentID;
	private static String name;
	private StudentRegister studentRegister;
	private ArrayList <Result> studentResult = new ArrayList<Result> ();
	
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		Student.studentID = studentID;
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
	
	public void addResult(Result result) {
		studentResult.add(result);
	}

	
	public static boolean equals(String curName, String oldName) {
		// TODO Auto-generated method stub
		return false;
	}
} 
