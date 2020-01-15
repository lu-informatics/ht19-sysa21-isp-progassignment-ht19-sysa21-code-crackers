package control;

import java.util.*;

import model.Course;
import model.WrittenExam;

public class CourseController {

	private List<Course> courseList = new ArrayList<Course>();

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

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

	public Course findCourse(String courseCode) {
		for (Course c : courseList) {
			if (c.getCourseCode().equals(courseCode)) {

				return c;
			}
		}
		return null;
	}

	public Course removeCourse(String courseCode) {
		Course tmpCourse = this.findCourse(courseCode);
		if (tmpCourse != null) {
			this.courseList.remove(tmpCourse);

		}
		return null;
	}

	public void updateCourse(String courseCode, String newCourseName) {
		Course foundCourse = this.findCourse(courseCode);
		if (foundCourse != null) {
			foundCourse.setCourseName(newCourseName);

		}

	}

	private String generateCourseID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("C%05d", range);
	}

	public void addExamToCourse(Course course, String date, String location, String time) {

		String examId = null;

		while (examId == null) {

			examId = this.generateExamID();
			if (this.findExam(examId) != null) {
				examId = null;
			}
		}
		WrittenExam ex = new WrittenExam(course , date, location, time);
		ex.setExamID(examId);
		for (Course co : courseList) {

			if (co.getWrittenExamList().isEmpty()) {
				course.getWrittenExamList().add(ex);
			} else {
				for (WrittenExam we : co.getWrittenExamList()) {
					if (!we.equals(ex)) {

						course.getWrittenExamList().add(ex);
					}
				}
			}
		}
	}

	public WrittenExam findExam(String examID) {
		for (Course c : courseList) {
			for (WrittenExam e : c.getWrittenExamList()) {
				if (e.getExamID() == (examID)) {

					return e;
					}
			}

		}
		return null;
	}

	public void removeExamFromCourse(String courseID, String examID) {
		Course c = this.findCourse(courseID);
		for (WrittenExam ex : c.getWrittenExamList()) {

			if (ex.getExamID().equals(examID)) {
				c.getWrittenExamList().remove(ex);
			}
		}
	}

	private String generateExamID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("E%05d", range);
	}
}
