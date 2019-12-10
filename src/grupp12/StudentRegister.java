
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
	public void findStudent(int studentID) {
		for (Student tmp : studentregister) {
			if ( tmp.getStudentID()==studentID) {
				return tmp;
				
			}
		}
	}
	
	public removeStudent(studentID) {
		for (Student tmp : studentregister) {
			if ( tmp.getStudentId()==studentID) {
				remove tmp;
			}
		}
	}
	
}
