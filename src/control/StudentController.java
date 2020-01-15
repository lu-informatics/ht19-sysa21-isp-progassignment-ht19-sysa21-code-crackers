
package control;

import java.util.*;

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

	// ADD ((C)RUD)
	public void addStudent(String studentName) {
		boolean studentAdded = false;
		while (!studentAdded) {
			String studentID = this.generateStudentID();
			if (this.findStudent(studentID) == null) {
				Student student = new Student(studentName);
				student.setStudentID(studentID);
				this.studentList.add(student);
				studentAdded = true;
			}

		}

	}

	// FIND (C(R)UD)
	public Student findStudent(String studentID) {
		for (Student s : studentList) {
			if (s.getStudentID().equals(studentID)) {

				return s;

			}
		}
		return null;
	}

	// UPDATE (CR(U)D)
	public void updateStudent(String studentID, String newName) {

		Student tmpStudent = this.findStudent(studentID);
		if (tmpStudent != null) {
			tmpStudent.setStudentName(newName);

		}

	}

	// REMOVE (CRU(D))
	public Student removeStudent(String studentID) {
		Student tmpStudent = this.findStudent(studentID);
		if (tmpStudent != null) {
			this.studentList.remove(tmpStudent);
		}
		return null;
	}

	private String generateStudentID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("S%05d", range);
	}

}
