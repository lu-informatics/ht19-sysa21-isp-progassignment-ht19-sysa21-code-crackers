
package control;

import java.util.*;

import model.Course;
import model.Student;

import java.util.ArrayList;


public class StudentController {

	private List<Student> studentList = new ArrayList<Student>();

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
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

	public void addStudent(String studentName) {
		boolean studentAdded = false;
		while (!studentAdded){
			String studentID = this.generateStudentID();
			if(this.findStudent(studentID)== null) {
				Student student = new Student(studentID, studentName);
				student.setStudentID(studentID);
				this.studentList.add(student);
				studentAdded = true;
			}
		
		
	}
	
		
			}
		
	

	private String generateStudentID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();
		
		return String.format("S-%05d", rand.nextInt(range));
	}
	


}
