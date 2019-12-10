
package grupp12;
import java.util.*;
public class StudentRegister {

	private ArrayList <Student> studentlist = new ArrayList <Student> ();

	public ArrayList <Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(ArrayList <Student> studentlist) {
		this.studentlist = studentlist;
	}
	
	public void addStudent(Student s) {
		studentlist.add(s);
	}
	public findStudent(String studentID) {
		for (Student tmp : studentlist) {
			if ( tmp.getStudentID().equals(studentID)) {
				return tmp;
				
			}
		}
	}
	
	public removeStudent(studentID) {
		for (Student tmp : studentlist) {
			if ( tmp.getStudentId().equals(studentID)) {
				remove tmp;
			}
		}
	}
	
}
