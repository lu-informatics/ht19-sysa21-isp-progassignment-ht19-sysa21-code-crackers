package grupp12;

public class Test {
	
	public static void main(String [] args) {
		
		Course c = new Course();
		
		c.setCourseCode("sysa21");
		c.setName("ISProjekt");
		c.setCredit(30);
		
		Student s = new Student();
		
		s.setName("Gabriel");
		s.setStudentID("8771");
		
		CourseRegister cRegister = new CourseRegister();
		
		
		
		Result r = new Result();
		
		r.setResult(87);
		r.setLetterGrade();
		// setLetterGrade String eller int, vad är bäst??
		
		
		
		StudentRegister sRegister = new StudentRegister();
		
		WrittenExam writtenE = new WrittenExam();
		writtenE.setExamID("JavaTenta1");
		writtenE.setDate(0612);
		//setDate String eller int, vad är bäst??
		writtenE.setLocation("Sparta1");
		writtenE.setTime("08.00");
		writtenE.setMaxpoints(100);
		
		//Kopplingar:
		cRegister.addCourse(c);
		c.setCourseRegister(cRegister);
		writtenE.setCourse(c);
		c.addWrittenExam(writtenE);
		writtenE.addResults(r);
		r.addWrittenExam(writtenE);
		
		r.addStudent(s);
		s.
		
		
		sRegister.addStudent(s);
		
	}

}
