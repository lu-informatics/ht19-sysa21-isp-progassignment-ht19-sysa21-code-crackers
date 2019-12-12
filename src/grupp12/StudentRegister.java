
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
		return this.studentList.get(studentID);
	}
	
	public void removeStudent(String studentID) {
		this.studentList.remove(studentID);
	}
		
	
	public boolean updateStudent(StudentID, oldName, newName) {
		Student curName = Student.get(name);
		if (!Student.equals(curName, oldName)||(curName == null && !containsKey(studentID))) {
			return false;
		}
		
		Student tmp = findStudent(studentToBeUpdated); 
			if (tmp != null) {
					tmp.setName(newName);
					
	}
		
	}
	}
		
		
	
	

