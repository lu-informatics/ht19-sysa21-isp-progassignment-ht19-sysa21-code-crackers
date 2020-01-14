package model;

import control.CourseController;
import control.StudentController;
import control.ExamController;
import model.Course;
import model.WrittenExam;
import model.Result;
import model.Student;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		StudentController studentRegister = new StudentController();

		CourseController courseRegister = new CourseController();

		ExamController examRegister = new ExamController();

		Student student1 = new Student("David");
		Student student2 = new Student("Martin");
		Student student3 = new Student("Jenny");
		Student student4 = new Student("Hanna");

		Course course1 = new Course("IS-Projekt", "15");
		Course course2 = new Course("Modellering", "15");

		WrittenExam exam1 = new WrittenExam(course1,"20 Feb 2020", "RoomA123", "08:00");
		WrittenExam exam2 = new WrittenExam(course2,"10 Feb 2020", "RoomA123", "08:00");

		Result result1 = new Result();
		Result result2 = new Result();

		studentRegister.addStudent("David");
		studentRegister.addStudent("Martin");
		studentRegister.addStudent("Jenny");
		studentRegister.addStudent("Hanna");

		courseRegister.addCourse("IS-Projekt", "15");
		courseRegister.addCourse("Modellering", "15");

		examRegister.addExamToCourse(course1, "20 Feb 2020", "RoomA123", "08:00");
		examRegister.addExamToCourse(course2, "10 Feb 2020", "RoomA123", "08:00");

		student1.addResultToStudent(result1);
		student1.addResultToStudent(result2);

		student2.addResultToStudent(result1);
		student2.addResultToStudent(result1);

		result1.setWrittenExam(exam1);
		result2.setWrittenExam(exam2);
		result1.setStudent(student1);
		result2.setStudent(student2);

		exam1.setCourse(course1);
		exam2.setCourse(course2);
		exam1.addResultforExam(result1);
		exam2.addResultforExam(result2);

		result1.setResult(50);
		result2.setResult(60);
		
		course1.addWrittenExam(exam1);
		course2.addWrittenExam(exam2);

		
		for (Student tmp : studentRegister.getStudentList()) {
			System.out.println( " StudentID: " + tmp.getStudentID() + ", Name: " + tmp.getStudentName());
			
		}
	
		for (Course ctmp : courseRegister.getCourseList()){
			 
			System.out.println("Coursecode:" + ctmp.getCourseCode() + ", Course name:" + ctmp.getCourseName() + ", Cours credit:" + ctmp.getCredit());
		
		}
		
		for(WrittenExam ee : course1.getWrittenExamList()) {
			if (ee !=null) {
			System.out.println( ee.getExamID() + "Date:" + ee.getDate() + ", Location: " + ee.getLocation() + ", Max points: " + ee.getMaxPoints() + ", time: " + ee.getTime());
			}
		}
		
		
			
	}
}

