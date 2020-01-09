
package model;

import java.util.Random;
import java.util.ArrayList;


public class StudentRegister {

	private ArrayList<Student> studentList = new ArrayList<Student>();

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student student) {
		this.studentList.add(student);
	}

	public Student findStudent(String studentID) {
		for (Student s : studentList) {
			if (s.getStudentID().equals(studentID)) {

				return s;

			}
		}
				return null;
	}

	public Student removeStudent(String studentID) {
		Student tmpStudent = this.findStudent(studentID);
			if (tmpStudent != null) {
				this.studentList.remove(tmpStudent);
			}
				return null;
	}

	public Student updateStudent (String studentID, String newName) {

		Student tmpStudent = this.findStudent(studentID);
			if (tmpStudent != null) {
				tmpStudent.setStudentName(newName);
				return tmpStudent;
            
          
		}		
				return null;
			
		}
	


}
