
package grupp12;
import java.util.*;

public class StudentRegister {

	private ArrayList <Student> studentRegister = new ArrayList <Student> ();

	
	public void setStudentregister(ArrayList <Student> studentregister) {
		this.studentRegister = studentregister;
	}
	public ArrayList <Student> getStudentregister() {
		return studentRegister;
	}

	
	public void addStudent(Student student) {
		studentRegister.add(student);
	}
	public Student findStudent(Student studentID) {
		for (Student tmp : this.studentRegister) {
			if ( tmp.getStudentID().equals(studentID)) {
				return tmp;
				
			}
		}
		return null;
	}
	
	public Student removeStudent(Student studentID) {
		Student tmp = findStudent(studentID);
		
		if (tmp != null) {
			studentRegister.remove(tmp);
			return tmp;
		}
		return null;
			
			}
	
	public void updateStudent (String studentToBeUpdated) {
		
		for (Student s : studentRegister) {
			if (s.getStudentID().equals(studentToBeUpdated)) {
				s.setName(studentToBeUpdated);
				s.setStudentID(studentToBeUpdated);
			}
		}
	}
		}
		
		
	
	

