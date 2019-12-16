package application;
import grupp12.Course;
import grupp12.CourseRegister;
import grupp12.Result;
import grupp12.Student;
import grupp12.StudentRegister;
import grupp12.WrittenExam;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import 

import java.net.URL;
import java.util.ListResourceBundle;

public class controller {
	
	CourseRegister courseRegister = new CourseRegister();
	StudentRegister studentRegister = new StudentRegister();

	@FXML
	private TextField txtStudentName;
	@FXML
	private TextField txtStudentID;
	@FXML
	private TextField txtCourseName;
	@FXML
	private TextField txtCourseCode;
	@FXML
	private TextField txtCourseCredit;
	@FXML
	private Button btnAddStudent;
	@FXML
	private Button btnRemoveStudent;
	@FXML
	private Button btnFindStudent;
	@FXML
	private Button btnUpdateStudent;
	@FXML
	private Button btnAddCourse;
	@FXML
	private Button btnRemoveCourse;
	@FXML
	private Button btnFindCourse;
	@FXML
	private Button btnUpdateCourse;
	
	@FXML
	@FXML
	private Button txtPrint;
	@FXML
	private TextArea txtInfoScreen;

	public void btnAddStudent_Click(ActionEvent event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		Student tmpStudent = new Student(studentName, studentID);
		studentRegister.addStudent(tmpStudent);

	}
	
	public void btnAddCourse_Click(ActionEvent event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		String courseCredit = txtCourseCredit.getText();
		Course tmpCourse = new Course(courseName, courseCode, courseCredit);
		courseRegister.addCourse(tmpCourse);

	}
	
	public void btnRemoveCourse_Click(ActionEvent event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		String courseCredit = txtCourseCredit.getText();
		Course tmpCourse = courseRegister.remove(courseCode);
			if ( tmpCourse == null) {
				txtInfoScreen.setText("The course you searched for could not be found.");
			}
		

	}
	
	public void btnRemoveStudent_Click(ActionEvent event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		Student tmpStudent = studentRegister.removeStudent(studentID);
			if ( tmpStudent == null) {
				txtInfoScreen.setText("The student you searched for could not be found.");
			}
		

	}
	
	public Student btnUpdateStudent_Click(ActionEvent event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		String studentNewName;
		Student tmpStudent = studentRegister.replace(studentID, studentNewName);
			if ( tmpStudent == null) {
				txtInfoScreen.setText("The student you searched for could not be found.");
				
				
			}
			else 
					txtInfoScreen.setText("The student you have choosen has been updated");

	}
	
	public void btnUpdateCourse_Click(ActionEvent event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		String courseNewName;
		Student tmpCourse = courseRegister.replace(courseCode, courseName);
			if ( tmpCourse == null) {
				txtInfoScreen.setText("The course you searched for could not be found.");
			}
			else 
				txtInfoScreen.setText("The course you have choosen has been updated");
		

	}
	
	//Vet inte om denna metod är rätt..
	
	public void btnFindStudent_Click(ActionEvent event) {
		String studentID = txtStudentID.getText();
		Student tmpStudent = studentRegister.findStudent(studentID);
		
		//txtInfoScreen.setText(tmpStudent.getStudentID());
		//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
			txtInfoScreen.appendText(tmpStudent.getName() + ", " + tmpStudent.getStudentID());  
		}

	//}
	
	//Vet inte om denna metod är rätt..
	
		public void btnFindCourse_Click(ActionEvent event) {
			String courseCode = txtCourseCode.getText();
			Course tmpCourse = courseRegister.findCourse(courseCode);
			
			//txtInfoScreen.setText(tmpStudent.getStudentID());
			//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
				txtInfoScreen.appendText(tmpCourse.getName() + ", " + tmpCourse.getCourseCode() + ", " + tmpCourse.getCredit());  
			}

		//}
	

}
	
