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
<<<<<<< Updated upstream
import java.util.URL;


=======



>>>>>>> Stashed changes
import java.util.ListResourceBundle;
import java.util.Scanner;

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
<<<<<<< Updated upstream
	private  txtCourseCredit;
=======
	private  TextField txtNewStudentName;
	@FXML
	private  TextField txtNewCourseName;
>>>>>>> Stashed changes
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
	private Button txtPrint;
	@FXML
	private TextArea txtInfoScreen;

	public void btnAddStudent_Click(ActionEvent event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
		Student tmpStudent = new Student();
		tmpStudent.setName(studentName);
		tmpStudent.setStudentID(studentID);
		studentRegister.addStudent(tmpStudent);

	}
	
	public void btnAddCourse_Click(ActionEvent event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
<<<<<<< Updated upstream
		//int courseCredit = txtCourseCredit.gette();
		Course tmpCourse = new Course();
		tmpCourse.setCourseCode(courseCode);
		//tmpCourse.setCredit(courseCredit);
=======
												//int courseCredit = txtCourseCredit.gette();
		Course tmpCourse = new Course();
		tmpCourse.setCourseCode(courseCode);
												//tmpCourse.setCredit(courseCredit);
>>>>>>> Stashed changes
		tmpCourse.setName(courseName);
		courseRegister.addCourse(tmpCourse);

	}
	
	public void btnRemoveCourse_Click(ActionEvent event) {
															// String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
			Course tmpCourse = courseRegister.getCourseList().get(courseCode); 
		
				if ( tmpCourse == null) {
				txtInfoScreen.setText("The course you searched for could not be found.");
			}
					else 
					tmpCourse.remove(courseCode);
<<<<<<< Updated upstream
				
=======
				txtInfoScreen.setText("The course has been removed from list.");
>>>>>>> Stashed changes
			}
	
	
	public void btnRemoveStudent_Click(ActionEvent event) {
																//String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
<<<<<<< Updated upstream
		Student tmpStudent = studentRegister.removeStudent(studentID); // void, retrunera student 
=======
		Student tmpStudent = studentRegister.getStudentList().get(studentID); // void, retrunera student 
>>>>>>> Stashed changes
			if ( tmpStudent == null) {
					txtInfoScreen.setText("The student you searched for could not be found.");
			
			}
			else 
				tmpStudent.getStudentRegister().removeStudent(studentID);
					txtInfoScreen.setText("The student has been removed from list.");
			

	}
	
	public void btnUpdateStudent_Click(ActionEvent event) {
		String studentName = txtStudentName.getText();
		String studentID = txtStudentID.getText();
<<<<<<< Updated upstream
		String studentNewName;
		
		studentRegister.replace(studentID, studentNewName); // returnera student 
		
			if ( tmpStudent == null) {
				txtInfoScreen.setText("The student you searched for could not be found.");
				
=======
		String studentNewName = txtNewStudentName.getText(); // skapade en ny textsträng.
			studentRegister.replace(studentID, studentNewName); // hur retunerar vi tillbaka studenten??
>>>>>>> Stashed changes
				
			txtInfoScreen.setText("the students name has been updated");
			}
				//if ( studentRegister.findStudent(studentID) == null) {
				//	txtInfoScreen.setText("The student you searched for could not be found.");
				
			 
				//else 
					//studentRegister.replace(studentID, studentNewName); // returnera student	
						//txtInfoScreen.setText("The student you have choosen has been updated");
					
						
		

	
	
	public void btnUpdateCourse_Click(ActionEvent event) {
		String courseName = txtCourseName.getText();
		String courseCode = txtCourseCode.getText();
		String courseNewName = txtNewCourseName.getText(); // skapade en ny textsträng.
		courseRegister.replace(courseCode, courseNewName); // hur retunerar vi tillbaka kursen? 
			
			txtInfoScreen.setText("The course name has been updated.");
		//if ( courseRegister.getCourseList().get(courseCode) == null) {
				//txtInfoScreen.setText("The course you searched for could not be found.");
			
	}
		
				//else 
				//txtInfoScreen.setText("The course you have choosen has been updated");
					
					

	
	
	//Vet inte om denna metod är rätt..
	
	public void btnFindStudent_Click(ActionEvent event) {
		String studentID = txtStudentID.getText();
		Student tmpStudent = studentRegister.findStudent(studentID);
			
			txtInfoScreen.appendText(tmpStudent.getName() + ", " + tmpStudent.getStudentID());  
		//txtInfoScreen.setText(tmpStudent.getStudentID());
		//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
			
		}

	//}
	
	//Vet inte om denna metod är rätt..
	
		public void btnFindCourse_Click(ActionEvent event) {
			String courseCode = txtCourseCode.getText();
			Course tmpCourse = courseRegister.findCourse(courseCode);
				txtInfoScreen.appendText(tmpCourse.getName() + ", " + tmpCourse.getCourseCode() + ", " + tmpCourse.getCredit());  

			//txtInfoScreen.setText(tmpStudent.getStudentID());
			//for (Student student : tmpStudent.getStudentRegister().findStudent(studentID)) { 
			}
		//}
		

		
	

}
	
