package model;

import control.CourseController;
import control.StudentController;
import control.ExamController;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		StudentController studentRegister = new StudentController();

		CourseController courseRegister = new CourseController();

		ExamController examRegister = new ExamController();

		Course course1 = new Course("", "IS-Projekt");
		Course course2 = new Course("", "Modellering");

		WrittenExam writtenExam1 = new WrittenExam();
		WrittenExam writtenExam2 = new WrittenExam();
		WrittenExam writtenExam3 = new WrittenExam();
		WrittenExam writtenExam4 = new WrittenExam();

		Student student1 = new Student("S10003", "David");
		Student student2 = new Student("S10002", "Martin");
		Student student3 = new Student("S10001, ", "Jenny");
		Student student4 = new Student("S10000", "Hanna");
		
		System.out.println(student1.getStudentName() + " " + student1.getStudentID());
		
		studentRegister.updateStudent("S1003", "John");
		
		System.out.println(student1.getStudentName());

}

}




/*Result result1 = new Result();

Result result2 = new Result();
Result result3 = new Result();
Result result4 = new Result();

course1.setCourseCode("sysa21");
course1.setCourseName("ISProjekt");
course1.setCredit(30);

course2.setCourseCode("sysa22");
course2.setCourseName("Modelering");
course2.setCredit(55);

writtenExam1.setExamID("E10000");
writtenExam1.setDate("22 maj 2020");
writtenExam1.setLocation("Spartavägen 1");
writtenExam1.setTime("08:00");
writtenExam1.setMaxPoints(100);
writtenExam1.setCourse(course1);

writtenExam2.setExamID("E10001");
writtenExam2.setDate("22 maj 2020");
writtenExam2.setLocation("Spartavägen 1");
writtenExam2.setTime("08:00");
writtenExam2.setMaxPoints(100);
writtenExam2.setCourse(course2);

writtenExam3.setExamID("E10002");
writtenExam3.setDate("22 maj 2020");
writtenExam3.setLocation("Spartavägen 1");
writtenExam3.setTime("08:00");
writtenExam3.setMaxPoints(100);
writtenExam3.setCourse(course1);

writtenExam4.setExamID("E10003");
writtenExam4.setDate("22 maj 2020");
writtenExam4.setLocation("Spartavägen 1");
writtenExam4.setTime("08:00");
writtenExam4.setMaxPoints(100);
writtenExam4.setCourse(course2);

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

studentRegister.addStudent(student1.getStudentName());
studentRegister.addStudent(student2.getStudentName());
studentRegister.addStudent(student3.getStudentName());
studentRegister.addStudent(student4.getStudentName());

examRegister.addExam(writtenExam1);

course1.add(writtenExam4);
course1.add(writtenExam3);
course2.add(writtenExam2);
course2.add(writtenExam1);

writtenExam1.setCourse(course2);
writtenExam2.setCourse(course2);
writtenExam3.setCourse(course1);
writtenExam4.setCourse(course1);


  result2.setLetterGrade("B"); result3.setLetterGrade("C");
  result4.setLetterGrade("U");
 
	result1.CalcExamGrade(100);
result2.CalcExamGrade(100);
result3.CalcExamGrade(100); //DETTA BEHÖVS VÄL INTE VARA MED? 
result4.CalcExamGrade(100);


result1.setResult(99);
result2.setResult(50);
result3.setResult(30);
result4.setResult(70);

courseRegister.addCourse(course1);
courseRegister.addCourse(course2);

	course1.setCourseRegister(courseRegister);
course2.setCourseRegister(courseRegister);




	for (Student tmp : studentRegister.getStudentList()) {
	System.out.println("Namn: " + tmp.getStudentName() + " StudentID: " + tmp.getStudentID());
}

Student student = studentRegister.updateStudent("S10000", "Jenny");
System.out.println("Student: " + student.getStudentID() + ", " + student.getStudentName());

studentRegister.removeStudent("S10000"); // Medvetna om att studentTmp inte används, hitta lösning!
for (Student tmp : studentRegister.getStudentList()) {
	System.out.println("Students: " + tmp.getStudentName() + " " + tmp.getStudentID());
}

for (Course c : courseRegister.getCourseList()) {
	System.out.println("Namn: " + c.getCourseName() + " CourseCode " + c.getCourseCode());
}
Course course = courseRegister.updateCourse("sysa21", "Hejsan svejsan");
System.out.println("Course: " + course.getCourseName() + ", " + course.getCourseCode());

courseRegister.removeCourse("sysa21");
for (Course courseX : courseRegister.getCourseList()) {
	System.out.println("Courses: " + courseX.getCourseName() + " ," + courseX.getCourseCode());
	System.out.println(courseRegister.findCourse("sysa21"));
}

for (Student ss : studentRegister.getStudentList()) {
	for (Result H : ss.getStudentResultList()) {
		System.out.println(
				H.getStudent().getStudentName() + " Grade: " + H.getLetterGrade() + " " + H.getResult());
	}
}

course2.setCourseCode(course2.generateCourseID());
for (Course cc : courseRegister.getCourseList()) {
	if (cc.getCourseCode() != null)
		;
	System.out.println("CourseCode: " + cc.getCourseCode() + " CourseName: " + cc.getCourseName());
}



 c1.remove("E10003"); for (WrittenExam tmp : c1.getWrittenExamList()) {
 System.out.println("Exam: " + tmp.getExamID()); } for (WrittenExam wee :
 c1.getWrittenExamList()) { System.out.println(wee.getExamID() + " " +
 wee.getLocation() + " " + wee.getMaxPoints() + " " + wee.getTime() + " " +
 wee.getDate()); }
 
 System.out.println(result1.getLetterGrade() + " " +
 result2.getLetterGrade());

 

studentRegister.updateStudent("S10001", "Klas");
System.out.println();
System.out.println(student2.getStudentName() + student2.getStudentID());

for (Student tmp : studentRegister.getStudentList()) {
	System.out.println(student1.getStudentID()+ " " + student1.getStudentName());
}

studentRegister.removeStudent("S10000");
for (Student tmp : studentRegister.getStudentList()) {
System.out.println("Studenter" + tmp.getStudentName() + tmp.getStudentID()); */


