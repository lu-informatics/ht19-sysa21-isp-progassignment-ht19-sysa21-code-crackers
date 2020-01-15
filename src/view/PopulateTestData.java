package view;

import javax.swing.JFrame;

import control.CourseController;
import control.StudentController;
import model.Course;
import model.Result;
import model.Student;
import model.WrittenExam;

public class PopulateTestData extends JFrame {
	private CourseController courseController;
	private StudentController studentController;
	
	public CourseController getCourseController() {
		return courseController;
	}
	public void setCourseController(CourseController courseController) {
		this.courseController = courseController;
	}
	public StudentController getStudentController() {
		return studentController;
	}
	public void setStudentController(StudentController studentController) {
		this.studentController = studentController;
	}
	
	public PopulateTestData (CourseController courseRegister, StudentController studentRegister ) {
		this.studentController = studentRegister;
		this.courseController = courseRegister;
		
	//	CourseController courseRegister = new CourseController();
		//StudentController studentRegister = new StudentController();
		//ExamController examRegister = new ExamController();
		
		//Create courses
		Course course1 = new Course("Modeling", "15" );
		Course course2 = new Course("Programming", "30" );
		Course course3 = new Course("Music", "7.5" );
		
		//Create students
		Student student1 = new Student("Ronny");
		Student student2 = new Student("Lisa");
		Student student3 = new Student("Greg");
		
		//Create WrittenExams
		WrittenExam writtenExam1 = new WrittenExam(course1, "20 Jan 2020", "RoomA123", "08:00");
		WrittenExam writtenExam2 = new WrittenExam(course2, "30 Jan 2020", "RoomB067", "08:00");
		WrittenExam writtenExam3 = new WrittenExam(course3, "10 Feb 2020", "RoomA167", "08:00");
		
		//Result
		Result result1 = new Result();
		Result result2 = new Result();
		Result result3 = new Result();
		
		//Connection between course and exam
		writtenExam1.setCourse(course1);
		writtenExam2.setCourse(course2);
		writtenExam3.setCourse(course3);
		
		//Connection between exam and course
		//course1.addWrittenExam(writtenExam1);
		//course2.addWrittenExam(writtenExam2);
		//course3.addWrittenExam(writtenExam3);
		
		//Connection between result and writtenExam
		result1.setWrittenExam(writtenExam1);
		result2.setWrittenExam(writtenExam2);
		result3.setWrittenExam(writtenExam3);
		
		//Connection between result and student
		student1.addResultToStudent(result1);
		student2.addResultToStudent(result2);
		student3.addResultToStudent(result3);
		
		//Connection between result and student 
		result1.setStudent(student1);
		result2.setStudent(student2);
		result3.setStudent(student3);
		
		//Connection between writtenExam and result
		writtenExam1.addResultforExam(result1);
		writtenExam2.addResultforExam(result2);
		writtenExam3.addResultforExam(result3);
		
		//Swing swing = new Swing(new StudentController(studentRegister));
		//swing.setVisible(true);
		
		//testdata for swing
		//Swing frame = new Swing (new Controller (Student, Course, Result, WrittenExam));
		//frame.setVisible(true);
		
		studentController.addStudent("Greg");
		studentController.addStudent("Lisa");
		studentController.addStudent("Ronny");
		
	}
	

}
