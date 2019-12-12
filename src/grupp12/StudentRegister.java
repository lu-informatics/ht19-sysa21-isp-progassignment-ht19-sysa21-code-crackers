
package grupp12;
import java.util.HashMap;

public class StudentRegister {

	private HashMap <String, Student> studentList = new HashMap <String, Student>();
	
	public HashMap <String, Student> getStudentList () {
		return studentList;
	}
	
	public void setStudentList (HashMap <String, Student> studentList) {
		this.studentList = studentList;
	}

	
	public void addStudent(Student student) {
		this.studentList.put(student.getStudentID(), student);
	}
	public Student findStudent(String studentID) {
		return this.studentList.get(studentID);
	}
	
	public void removeStudent(String studentID) {
		this.studentList.remove(studentID);
	}
		
	
	public void replace(String studentID, String oldName, String newName) {
		
		String curName= studentID.getName();
		if ( !Student.equals(curName, oldName) || (curName == null && !containsKey(StudentID))) {

		}

	}
	private boolean containsKey(String courseCode) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	}
		
		
	
	

