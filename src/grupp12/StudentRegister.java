
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
	public Student findStudent(String studentID) {
		for (Student tmp : this.studentRegister) {
			if ( tmp.getStudentID().equals(studentID)) {
				return tmp;
			}
		}
				return null;
	}
	
	public Student removeStudent(String studentID) {
		Student tmp = findStudent(studentID);
		
		if (tmp != null) {
			studentRegister.remove(tmp);
			return tmp;
		}
			return null;
			
			}
	
	public void updateStudentName (String studentToBeUpdated,  String newName) {
		
		Student tmp = findStudent(studentToBeUpdated); 
			if (tmp != null) {
					tmp.setName(newName);
				
						}
		
	}
	}
		
		
	
	

