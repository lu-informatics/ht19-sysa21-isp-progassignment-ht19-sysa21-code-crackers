package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Course;
import model.Result;
import model.Student;
import model.WrittenExam;

public class MainController {

	private List<Course> courseList = new ArrayList<Course>();
	private List<Student> studentList = new ArrayList<Student>();

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	// ((C)RUD)

	public void addCourse(String courseName, String credits) {
		boolean corseAdded = false;
		while (!corseAdded) {
			String courseID = this.generateCourseID();
			if (this.findCourse(courseID) == null) {
				Course course = new Course(courseName, credits);
				course.setCourseCode(courseID);
				this.courseList.add(course);
				corseAdded = true;
			}
		}

	}

	// (C(R)UD)
	public Course findCourse(String courseCode) {
		for (Course c : courseList) {
			if (c.getCourseCode().equals(courseCode)) {

				return c;
			}
		}
		return null;
	}

	// (CR(U)D)
	public void updateCourse(String courseCode, String newCourseName) {
		Course foundCourse = this.findCourse(courseCode);
		if (foundCourse != null) {
			foundCourse.setCourseName(newCourseName);

		}

	}

	// (CRU(D))
	public Course removeCourse(String courseCode) {
		Course tmpCourse = this.findCourse(courseCode);
		if (tmpCourse != null) {
			this.courseList.remove(tmpCourse);

		}
		return null;
	}

	// GENERATE A COURSE ID AND IT STARTS WITH THE LETTER C
	private String generateCourseID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("C%05d", range);
	}

	// ADD AN EXAM TO A COURSE
	public void addExamToCourse(Course course, String date, String location, String time) {

		String examId = null;

		while (examId == null) {

			examId = this.generateExamID();
			if (findExam(examId) != null) {
				examId = null;
			}
		}
		WrittenExam ex = new WrittenExam(course, date, location, time);
		ex.setExamID(examId);
		course.getWrittenExamList().add(ex);

	}

	// REMOVE AN EXAM FROM A COURSE
	public void removeExamFromCourse(String courseID, String examID) {
		Course c = this.findCourse(courseID);
		WrittenExam ex = this.findExam(examID);
		

			if (ex.getExamID().equals(examID)) {
				c.getWrittenExamList().remove(ex);
			}
		
	}

	// GENERATES AN EXAM ID AND IT STARTS WITH THE LETTER E
	private String generateExamID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("E%05d", range);
	}

	// FIND EXAM
	public WrittenExam findExam(String examID) {

		for (Course c : courseList) {
			for (WrittenExam ex : c.getWrittenExamList()) {
				if (ex.getExamID().equals(examID)) {

					return ex;

				}

			}

		}
		return null;

	}

	// ADD ((C)RUD)
	public void addStudent(String studentName) {
		boolean studentAdded = false;
		while (!studentAdded) {
			String studentID = this.generateStudentID();
			if (this.findStudent(studentID) == null) {
				Student student = new Student(studentName);
				student.setStudentID(studentID);
				this.studentList.add(student);
				studentAdded = true;
			}

		}

	}

	// FIND (C(R)UD)
	public Student findStudent(String studentID) {
		for (Student s : studentList) {
			if (s.getStudentID().equals(studentID)) {

				return s;

			}
		}
		return null;
	}

	// UPDATE (CR(U)D)
	public void updateStudent(String studentID, String newName) {

		Student tmpStudent = this.findStudent(studentID);
		if (tmpStudent != null) {
			tmpStudent.setStudentName(newName);

		}

	}

	// REMOVE (CRU(D))
	public Student removeStudent(String studentID) {
		Student tmpStudent = this.findStudent(studentID);
		if (tmpStudent != null) {
			this.studentList.remove(tmpStudent);
		}
		return null;
	}

	// GENTERATE STUDENT ID AND IT STARTS WITH THE LETTER S
	private String generateStudentID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("S%05d", range);
	}

	// GENERATE A LETTERGRADE AND ADD RESULT TO A STUDENT AND A EXAM

	public void addResult(String studentID, String examID, int points) {
		WrittenExam we = this.findExam(examID);
		Student s = this.findStudent(studentID);
		// if(s.getStudentResultList().getWrittenExam().getExamID() != examID) {

		Result result = new Result(points, we, s);
		result.setStudent(s);
		result.setWrittenExam(we);
		result.setLetterGrade(this.calcExamGrade(points));
		s.addResultToStudent(result);

		// }
	}

	// CALCULATE A LETTER GRADE WITH GIVEN POINTS
	public String calcExamGrade(int result) {

		if (result >= 50 && result < 55) {
			return "E";
		} else if (result >= 55 && result < 65) {
			return "D";
		} else if (result >= 65 && result < 75) {
			return "C";
		} else if (result >= 75 && result < 85) {
			return "B";
		} else if (result >= 85 && result <= 100) {
			return "A";
		} else if (result >= 0 && result <= 49) {
			return "Fail";
		}
		return null;
	}

}