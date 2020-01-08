package model;

import java.util.List;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		StudentRegister studentRegister = new StudentRegister();

		Course c1 = new Course();
		Course c2 = new Course();

		WrittenExam writtenExam1 = new WrittenExam();
		WrittenExam writtenExam2 = new WrittenExam();
		WrittenExam writtenExam3 = new WrittenExam();
		WrittenExam writtenExam4 = new WrittenExam();

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();

		Result result1 = new Result();
		Result result2 = new Result();
		Result result3 = new Result();
		Result result4 = new Result();

		c1.setCourseCode("sysa21");
		c1.setCourseName("ISProjekt");
		c1.setCredit(30);

		c2.setCourseCode("sysa22");
		c2.setCourseName("Modelering");
		c2.setCredit(55);

		writtenExam1.setExamID("E10000");
		writtenExam1.setDate("22 maj 2020");
		writtenExam1.setLocation("Spartavägen 1");
		writtenExam1.setTime("08:00");
		writtenExam1.setMaxPoints(100);
		writtenExam1.setCourse(c1);

		writtenExam2.setExamID("E10001");
		writtenExam2.setDate("22 maj 2020");
		writtenExam2.setLocation("Spartavägen 1");
		writtenExam2.setTime("08:00");
		writtenExam2.setMaxPoints(100);
		writtenExam2.setCourse(c2);

		writtenExam3.setExamID("E10002");
		writtenExam3.setDate("22 maj 2020");
		writtenExam3.setLocation("Spartavägen 1");
		writtenExam3.setTime("08:00");
		writtenExam3.setMaxPoints(100);
		writtenExam3.setCourse(c1);

		writtenExam4.setExamID("E10003");
		writtenExam4.setDate("22 maj 2020");
		writtenExam4.setLocation("Spartavägen 1");
		writtenExam4.setTime("08:00");
		writtenExam4.setMaxPoints(100);
		writtenExam4.setCourse(c2);

		student1.setStudentName("David");
		student1.setStudentID("S10000");
		student2.setStudentName("Hanna");
		student2.setStudentID("S10001");
		student3.setStudentName("Martin");
		student3.setStudentID("S10002");
		student4.setStudentName("Gabriel");
		student4.setStudentID("S10003");

		writtenExam3.addResultforExam(result1);
		student1.addResultToStudent(result1);
		result1.setStudent(student1);
		result1.setWrittenExam(writtenExam3);

		writtenExam2.addResultforExam(result2);
		student2.addResultToStudent(result2);
		result2.setStudent(student2);
		result2.setWrittenExam(writtenExam2);

		writtenExam1.addResultforExam(result3);
		student3.addResultToStudent(result3);
		result3.setStudent(student3);
		result3.setWrittenExam(writtenExam1);

		writtenExam4.addResultforExam(result4);
		student4.addResultToStudent(result4);
		result4.setStudent(student4);
		result4.setWrittenExam(writtenExam4);

		studentRegister.addStudent(student1);
		studentRegister.addStudent(student2);
		studentRegister.addStudent(student3);
		studentRegister.addStudent(student4);

		student1.setStudentRegister(studentRegister);
		student2.setStudentRegister(studentRegister);
		student3.setStudentRegister(studentRegister);
		student4.setStudentRegister(studentRegister);

		c1.add(writtenExam4);
		c1.add(writtenExam3);
		c2.add(writtenExam2);
		c2.add(writtenExam1);

		writtenExam1.setCourse(c2);
		writtenExam2.setCourse(c2);
		writtenExam3.setCourse(c1);
		writtenExam4.setCourse(c1);

		CourseRegister courseRegister = new CourseRegister();

		courseRegister.addCourse(c1);
		courseRegister.addCourse(c2);

		c1.setCourseRegister(courseRegister);
		c2.setCourseRegister(courseRegister);

	}

}
