package model;

import control.MainController;
import model.Course;
import model.WrittenExam;
import model.Result;
import model.Student;

public class Test {

	public static void main(String[] args) {

		

		MainController controller =  new MainController();

		Student student1 = new Student("David");
		Student student2 = new Student("Martin");
		Student student3 = new Student("Jenny");
		Student student4 = new Student("Hanna");

		Course course1 = new Course("IS-Projekt", "15");
		Course course2 = new Course("Modellering", "15");

		WrittenExam exam1 = new WrittenExam(course1,"20 Feb 2020", "RoomA123", "08:00");
		WrittenExam exam2 = new WrittenExam(course2,"10 Feb 2020", "RoomA123", "08:00");

		Result result1 = new Result(50, exam1, student1);
		Result result2 = new Result(60, exam2, student2);
		

		controller.addStudent("David");
		controller.addStudent("Martin");
		controller.addStudent("Jenny");
		controller.addStudent("Hanna");

		controller.addCourse("IS-Projekt", "15");
		controller.addCourse("Modellering", "15");

		controller.addExamToCourse(course1, "20 Feb 2020", "RoomA123", "08:00");
		controller.addExamToCourse(course2, "10 Feb 2020", "RoomA123", "08:00");

		student1.addResultToStudent(result1);
		student1.addResultToStudent(result2);

		student2.addResultToStudent(result1);
		student2.addResultToStudent(result1);

		
		result1.setStudent(student1);
		result2.setStudent(student2);

		exam1.setCourse(course1);
		exam2.setCourse(course2);
		exam1.addResultforExam(result1);
		exam2.addResultforExam(result2);

	//	result1.setResult(50);
		//result2.setResult(60);
		result1.setWrittenExam(exam1);
		result2.setWrittenExam(exam2);
	
		

		
		for (Student tmp : controller.getStudentList()) {
				System.out.println( " StudentID: " + tmp.getStudentID() + ", Name: " + tmp.getStudentName());
			}
			
		
	
		for (Course ctmp : controller.getCourseList()){
			 
			System.out.println("Coursecode:" + ctmp.getCourseCode() + ", Course name:" + ctmp.getCourseName() + ", Cours credit:" + ctmp.getCredit());
		
		}
			
		for(WrittenExam ee : course1.getWrittenExamList()) {
			if (ee !=null) {
			System.out.println("ExamID: " + ee.getExamID() + " Date:" + ee.getDate() + ", Location: " + ee.getLocation() + ", Max points: " + ee.getMaxPoints() + ", time: " + ee.getTime());
			}
		}
		
		
		
			
	}
}

