package grupp12;

public class Test {
	
	public static void main(String [] args) {
		
		Course course = new Course();
		
		course.setCourseCode("sysa21");
		course.setName("ISProjekt");
		course.setCredit(30);
		
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
