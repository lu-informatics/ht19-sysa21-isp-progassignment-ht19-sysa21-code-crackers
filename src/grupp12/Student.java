package grupp12;
import java.util.*;
public class Student {
	private String studentID;
	private String name;
	private ArrayList <Result> examresult = new ArrayList<Result> ();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentID;
	}
	public void setStudentId(String studentID) {
		this.studentID = studentID;
	} 

	public void setExamresult(ArrayList<Result> examresult) {
		this.examresult = examresult;
	}
	public ArrayList <Result> getExamresult () {
		return examresult;
	}
}
