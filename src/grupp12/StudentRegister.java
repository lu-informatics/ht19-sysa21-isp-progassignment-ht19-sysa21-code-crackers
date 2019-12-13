
package grupp12;

import java.util.HashMap;

public class StudentRegister {

	private HashMap<String, Student> studentList = new HashMap<String, Student>();
	

	public HashMap<String, Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(HashMap<String, Student> studentList) {
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

	public void replace(String studentID, String newName) {

		Student tmp = findStudent(studentID);
		if (tmp != null) {

			//String curName = tmp.getName();
			//if (!Student.equals(curName, oldName) || (curName == null && !containsKey(studentID))) {
				tmp.setName(newName);
			}
		}

	

	

}
