
package grupp12;
import java.util.*;
public class StudentRegister {

	private ArrayList <Student> studentregister = new ArrayList <Student> ();

	
	public void setStudentregister(ArrayList <Student> studentregister) {
		this.studentregister = studentregister;
	}
	public ArrayList <Student> getStudentregister() {
		return studentregister;
	}

	
	public void addStudent(Student student) {
		studentregister.add(student);
	}
	public String findStudent(Student studentID) {
		for (Student tmp : this.studentregister) {
			if ( tmp.getStudentID().equals(studentID)) {
				return tmp;
				
			}
		}
		return null;
	}
	
	public void removeStudent(String studentID) {
		for (Student tmp : studentregister) {
			if ( tmp.getStudentID().equals(studentID)) {
				remove tmp;
			}
		}
	}
	
}
