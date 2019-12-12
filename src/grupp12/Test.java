package grupp12;

public class Test {
	
	public static void main(String [] args) {
		
		Course c = new Course();
		
		c.setCourseCode("sysa21");
		c.setName("ISProjekt");
		c.setCredit(30);
		
		Student s = new Student();
		
		s.setName("Gabriel");
		s.setStudentID("8771"); // Ska ha 5 siffror och ett S i början! 
		
		CourseRegister cRegister = new CourseRegister();
		
		
		
		Result r = new Result();
		
		r.setResult(87);
		r.setLetterGrade("A");
		// setLetterGrade String eller int, vad är bäst??
		
		
		
		StudentRegister sRegister = new StudentRegister();
		
		WrittenExam writtenE = new WrittenExam();
		writtenE.setExamID("JavaTenta1");
		writtenE.setDate("12-12-2019");
		writtenE.setLocation("Sparta1");
		writtenE.setTime("08.00");
		writtenE.setMaxpoints(100);
		
		//Kopplingar:
		cRegister.addCourse(c);
		c.setCourseRegister(cRegister);
		writtenE.setCourse(c);
		c.addWrittenExam(writtenE);
		r.addStudent(s);
		s.addResult(r);
		// lägg till en writtenExam till  en student
		
		// inte kopplat en student till ett resultat ev. "s.getExamresult();"
		
		s.setStudentRegister(sRegister);
		sRegister.addStudent(s);
		
		sRegister.updateStudentName("8771", "peter"); //Ska inte kunna uppdatera id, men kanske står för att det är en "key" för tt hitta rätt person? 
		
		System.out.println(s.getName());
		
		
		
		
	}

}
