package control;
//import javafx.event.ActionEvent;
//Hej
//import javafx.fxml.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//import model.Course;
//import model.CourseRegister;
//import model.Student;
//import model.StudentRegister;

//import java.net.URL;
//import java.util.ListResourceBundle;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Course;
import model.CourseRegister;
import model.Student;
import model.StudentRegister;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class controller {
	
	CourseRegister courseRegister = new CourseRegister();
	StudentRegister studentRegister = new StudentRegister();
	

	public void btnAddStudent_Click(Student addThisStudent) {
		studentRegister.addStudent(addThisStudent);

	}
	
	public void btnAddCourse_Click(Course addThisCourse) {
		courseRegister.addCourse(addThisCourse);
		

	}
	
	public Course btnRemoveCourse_Click(String courseCode) {
		return courseRegister.removeCourse(courseCode);
		
	}
	
	
	public Student btnRemoveStudent_Click(String studentID) {
		return studentRegister.removeStudent(studentID);
		
	}
	
	public Student btnUpdateStudent_Click(String studentName, String studentID) {
		return studentRegister.updateStudent(studentID, studentName); // ska studentID också ändras?
		
	}
	
	public Course btnUpdateCourse_Click(String courseCode, String courseName) {
		return courseRegister.updateCourse(courseCode, courseName);
		

	}
	
	
	public Student btnFindStudent_Click(String studentID) {
		return studentRegister.findStudent(studentID);
		 
		}

	
		public Course btnFindCourse_Click(String courseCode) {
			return courseRegister.findCourse(courseCode);
			}
		
		public String[] retrieveAllStudentNames() {
			return studentRegister.retrieveAllStudentsNames();
		}

		//}
	

}
	
