
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
			if (studentID != null) {
				this.studentList.remove(tmpStudent);
			}
				return null;
	}

	public Student updateStudent (String studentID, String newName) {

		Student foundStudent = this.findStudent(studentID);
			if (foundStudent != null) {
				foundStudent.setStudentName(newName);
				return foundStudent;
            
          
		}		
				return null;
			
		}
	
	public String generateStudentID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();
		
		return String.format("S-%05d", rand.nextInt(range));
	}

}
