
package grupp12;
import java.util.*;
public class StudentRegister {

	private ArrayList <Student> studentregister = new ArrayList <Student> ();

	public ArrayList <Student> getStudentregister() {
		return studentregister;
	}

	public void setStudentlist(ArrayList <Student> studentregister) {
		this.studentregister = studentregister;
	}
	
	public void addStudent(Student student) {
		studentregister.add(student);
	}
	public findStudent(string studentID) {
		for (Student tmp : studentregister) {
			if ( tmp.getStudentID().equals(studentID)) {
				return tmp;
				
			}
		}
	}
	
	public void removeStudent(string studentID) {
		for (Student tmp : studentregister) {
			if ( tmp.getStudentID().equals(studentID)) {
				remove tmp;
			}
		}
	}
	
}
