
package grupp12;
import java.util.*;

public class StudentRegister {

	private HashMap <String, Student> studentList = new HashMap <String, Student>();
	
	public HashMap <String, Student> getStudentList () {
		return studentList;
	}
	
	public void setStudentList (HashMap <String, Student> studentList) {
		this.studentList = studentList;
	}

	
	public void addStudent(Student student) {
		this.studentList.put(Student.getStudentID(), student);
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
		
		
	
	

