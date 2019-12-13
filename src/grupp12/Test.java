package grupp12;

public class Test {

	public static void main(String[] args) {

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

		wE2.addResultforExam(r2);
		s2.addResultToStudent(r2);
		r2.setStudent(s2);
		r2.setWrittenExam(wE2);

		wE1.addResultforExam(r3);
		s3.addResultToStudent(r3);
		r3.setStudent(s3);
		r3.setWrittenExam(wE1);

		wE4.addResultforExam(r4);
		s4.addResultToStudent(r4);
		r4.setStudent(s4);
		r4.setWrittenExam(wE4);

		StudentRegister studentregister = new StudentRegister();

		studentregister.addStudent(s1);
		studentregister.addStudent(s2);
		studentregister.addStudent(s3);
		studentregister.addStudent(s4);

		s1.setstudentRegister(studentregister);
		
		System.out.println(s1.getName() + s1.getStudentID());

	}

}
