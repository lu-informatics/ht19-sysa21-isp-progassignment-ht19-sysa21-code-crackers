package application;

import control.CourseController;
import control.StudentController;
import control.ExamController;
import model.Course;
import model.Result;
import model.Student;
import model.WrittenExam;
import view.Swing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CourseController courseRegister = new CourseController();
		StudentController studentRegister = new StudentController();
		ExamController examRegister = new ExamController();
		
		//Create courses
		Course course1 = new Course("Modeling", "15" );
		Course course2 = new Course("Programming", "30" );
		Course course3 = new Course("Music", "7.5" );
		
		//Create students
		Student student1 = new Student("Ronny");
		Student student2 = new Student("Lisa");
		Student student3 = new Student("Greg");
		
		//Create WrittenExams
		WrittenExam writtenExam1 = new WrittenExam("20 Januari 2020", "RoomA123", "08:00");
		WrittenExam writtenExam2 = new WrittenExam("30 Januari 2020", "RoomB067", "08:00");
		WrittenExam writtenExam3 = new WrittenExam("10 Februari 2020", "RoomA167", "08:00");
		
		//Result
		Result result1 = new Result();
		Result result2 = new Result();
		Result result3 = new Result();
		
		//Connection between course and exam
		writtenExam1.setCourse(course1);
		writtenExam2.setCourse(course2);
		writtenExam3.setCourse(course3);
		
		//Connection between exam and course
		course1.addWrittenExam(writtenExam1);
		course2.addWrittenExam(writtenExam2);
		course3.addWrittenExam(writtenExam3);
		
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
		
		
	}

}
