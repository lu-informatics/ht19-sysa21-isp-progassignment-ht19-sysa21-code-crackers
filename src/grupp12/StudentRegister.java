
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
	public findStudent(String studentId) {
		for (Student tmp : studentlist) {
			if ( tmp.getStudentId().equals(studentId)) {
				return tmp;
				
			}
		}
	}
	
	public removeStudent(studentId) {
		for (Student tmp : studentlist) {
			if ( tmp.getStudentId().equals(studentId)) {
				remove tmp;
			}
		}
	}
	
}
