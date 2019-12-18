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

	
	private JTextField txtStudentName;
	
	private JTextField txtStudentNewName;
	
	private JTextField txtStudentID;
	
	private JTextField txtCourseName;
	
	private JTextField txtCourseNewName;
	
	private JTextField txtCourseCode;
	
	private JTextField txtCourseCredit;
	
	private JButton btnAddStudent;
	
	private JButton btnRemoveStudent;
	
	private JButton btnFindStudent;
	
	private JButton btnUpdateStudent;
	
	private JButton btnAddCourse;
	
	private JButton btnRemoveCourse;
	
	private JButton btnFindCourse;
	
	private JButton btnUpdateCourse;
	
	private JButton txtPrint;
	
	private JTextArea txtInfoScreen;

	public void btnAddStudent_Click(Action event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		Student tmpStudent = new Student();
		tmpStudent.setName(studentName);
		tmpStudent.setStudentID(studentID);
		studentRegister.addStudent(tmpStudent);

	}
	
	public void btnAddCourse_Click(Action event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		int courseCredit = txtCourseCredit.getText();
		Course tmpCourse = new Course();
		tmpCourse.setCourseCode(courseCode);
		tmpCourse.setCredit(courseCredit); // ändra från txtCourseCredit till en btnCourseCredit? 
		tmpCourse.setName(courseName);
		courseRegister.addCourse(tmpCourse);

	}
	
	public void btnRemoveCourse_Click(Action event) {
		//String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		//String courseCredit = txtCourseCredit.getText();
		 courseRegister.remove(courseCode);
			
		 if(courseCode == null) {
				txtInfoScreen.setText("The course you searched for could not be found.");
			}
		 else 
			 	txtInfoScreen.setText("The course has been removed");
	}
	
	
	public void btnRemoveStudent_Click(Action event) {
		//String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		studentRegister.removeStudent(studentID);
			if ( studentID == null) {
				txtInfoScreen.setText("The student you searched for could not be found.");
			}
			else 
				txtInfoScreen.setText("The student has been removed");

	}
	
	public void btnUpdateStudent_Click(Action event) {
		//String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		String studentNewName = txtStudentNewName.getText();
		studentRegister.replace(studentID, studentNewName);
			if ( studentID == null) {
				txtInfoScreen.setText("The student you tried to update could not be found.");
				
				
			}
			else 
					txtInfoScreen.setText("The student you have choosen has been updated");
				
	}
	
	public void btnUpdateCourse_Click(Action event) {
		//String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		String courseNewName = txtCourseNewName.getText();
		courseRegister.replace(courseCode, courseNewName);
			if ( courseCode == null) {
				txtInfoScreen.setText("The course you searched for could not be found.");
			}
			else 
				txtInfoScreen.setText("The course you have choosen has been updated");
		

	}
	
	//Vet inte om denna metod är rätt..
	
	public void btnFindStudent_Click(Action event) {
		String studentID = txtStudentID.getText();
		Student tmpStudent = studentRegister.findStudent(studentID);
		
		//txtInfoScreen.setText(tmpStudent.getStudentID());
		//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
			txtInfoScreen.append(tmpStudent.getStudentName() + ", " + tmpStudent.getStudentID());  
		}

	//}
	
	//Vet inte om denna metod är rätt..
	
		public void btnFindCourse_Click(Action event) {
			String courseCode = txtCourseCode.getText();
			Course tmpCourse = courseRegister.findCourse(courseCode);
			
			//txtInfoScreen.setText(tmpStudent.getStudentID());
			//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
				txtInfoScreen.append(tmpCourse.getStudentName() + ", " + tmpCourse.getCourseCode() + ", " + tmpCourse.getCredit());  
			}

		//}
	

}
	
