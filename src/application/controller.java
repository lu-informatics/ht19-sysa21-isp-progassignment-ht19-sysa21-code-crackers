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
	private TextField txtAccount;
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnRemove;
	@FXML
	private Button btnFind;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button txtAddAccount;
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
	
	public void btnUpdateStudent_Click(ActionEvent event) {
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

	public void btnFind_Click(ActionEvent event) {
		String pNumber = txtPersonNbr.getText();
		Person tmpPerson = reg.findPerson(pNumber);
		
		txtInfoScreen.setText(tmpPerson.getName() + " äger dessa konton: ");
		for (Account account : tmpPerson.getAccountList()) { 
			txtInfoScreen.appendText( account.getNbr()+ ". " +" Saldot på kontot är: " + account.getbalance() + "kr. ");  
		}

	}

	public void btnRemove_Click(ActionEvent event) {
		String pNumber = txtPersonNbr.getText();
				Person p = reg.removePerson(pNumber);
				if (p == null) {
					txtInfoScreen.setText("Personen kunde inte hittas");
				}
	}

	public void ButtonAddAccount(ActionEvent event) {
		Account a1 = new Account();
		a1.setnbr(txtAccount.getText());
		String pNumber = txtPersonNbr.getText();
		Person tmpPerson = reg.findPerson(pNumber);
		tmpPerson.addAccount(a1);
		txtAccount.setText("");
	}

	public void ButtonPrint(ActionEvent event) {
		String pNumber = txtPersonNbr.getText(); 
		Person tmpPerson = reg.findPerson(pNumber);
		
		if (tmpPerson == null) {
			txtInfoScreen.setText("person borttagen");
		}
		else {
			txtInfoScreen.setText(tmpPerson.getName() + " äger dessa konton: ");
			for (Account account : tmpPerson.getAccountList()) { 
				txtInfoScreen.appendText("\n" + account.getNbr() + "." + " Saldot på kontot är: " + account.getbalance()+" kr. ");
			}
		}
	}
}

}
