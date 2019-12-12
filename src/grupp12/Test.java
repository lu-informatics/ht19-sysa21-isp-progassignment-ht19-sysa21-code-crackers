package grupp12;

public class Test {
	
	public static void main(String [] args) {
		
		Course c1 = new Course();
		Course c2 = new Course();
		
		WrittenExam wE1 = new WrittenExam();
		WrittenExam wE2 = new WrittenExam();
		WrittenExam wE3 = new WrittenExam();
		WrittenExam wE4 = new WrittenExam();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Result r1 = new Result();
		Result r2 = new Result();
		Result r3 = new Result();
		Result r4 = new Result();
		
		c1.setCourseCode("sysa21");
		c1.setName("ISProjekt");
		c1.setCredit(30);
		
		c2.setCourseCode("sysa22");
		c2.setName("Modelering");
		c2.setCredit(55);
		
	wE1.setExamID("E10000");
	wE1.setDate("22 maj 2020");
	wE1.setLocation("Spartavägen 1");
	wE1.setTime("08:00");
	wE1.setMaxpoints(100);
	wE1.setCourse(c1);
	
	wE2.setExamID("E10001");
	wE2.setDate("22 maj 2020");
	wE2.setLocation("Spartavägen 1");
	wE2.setTime("08:00");
	wE2.setMaxpoints(100);
	wE2.setCourse(c2);
	
	wE3.setExamID("E10002");
	wE3.setDate("22 maj 2020");
	wE3.setLocation("Spartavägen 1");
	wE3.setTime("08:00");
	wE3.setMaxpoints(100);
	wE3.setCourse(c1);
	
	wE4.setExamID("E10003");
	wE4.setDate("22 maj 2020");
	wE4.setLocation("Spartavägen 1");
	wE4.setTime("08:00");
	wE4.setMaxpoints(100);
	wE4.setCourse(c2);
	
	s1.setName("David");
	s1.setStudentID("S10000");
	s2.setName("Hanna");
	s2.setStudentID("S10001");
	s3.setName("Martin");
	s3.setStudentID("S10002");
	s4.setName("Gabriel");
	s4.setStudentID("S10003");
	
	wE3.addResultforExam(r1);
	s1.addResultToStudent(r1);
	r1.setStudent(s1);
	r1.setWrittenExam(wE3);
	
		
		Student student = new Student();
		
		student.setName("Gabriel");
		student.setStudentID(getStudentID()); // Ska ha 5 siffror och ett S i början! SKA HÄMTAS FRÅN EN COUNTER 
		
		CourseRegister cRegister = new CourseRegister();
		
		
		
		Result result = new Result();
		
		result.setResult(87);
		result.setLetterGrade("A");
		// setLetterGrade String eller int, vad är bäst??
		
		
		
		StudentRegister sRegister = new StudentRegister();
		
		WrittenExam writtenE = new WrittenExam();
		writtenE.setExamID("JavaTenta1");
		writtenE.setDate("12-12-2019");
		writtenE.setLocation("Sparta1");
		writtenE.setTime("08.00");
		writtenE.setMaxpoints(100);
		
		//Kopplingar:
		cRegister.addCourse(course);
		course.setCourseRegister(cRegister);
		writtenE.setCourse(course);
		course.addWrittenExam(writtenE);
		result.addStudent(student);
		student.addResult(result);
		// lägg till en writtenExam till  en student
		
		// inte kopplat en student till ett resultat ev. "s.getExamresult();"
		
		student.setStudentRegister(sRegister);
		sRegister.addStudent(student);
		
		sRegister.updateStudentName("8771", "peter"); //Ska inte kunna uppdatera id, men kanske står för att det är en "key" för tt hitta rätt person? 
		
		System.out.println(student.getName());
		
		
		
		
	}

}
