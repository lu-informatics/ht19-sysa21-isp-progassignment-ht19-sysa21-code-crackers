package control;

import java.util.ArrayList;
import java.util.Random;

import model.Course;

public class CourseController {

	private ArrayList<Course> courseList = new ArrayList<Course>();

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

	public void addCourse(Course course) {
		boolean corseAdded = false;
		while (!corseAdded) {
			String courseID = this.generateCourseID();
			if (this.findCourse(courseID) == null) {
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

	public Course updateCourse(String courseCode, String newCourseName) {
		Course foundCourse = this.findCourse(courseCode);
		if (courseCode != null) {
			foundCourse.setCourseName(newCourseName);
			return foundCourse;

		}
		return null;
	}

	private String generateCourseID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();

		return String.format("C%05d", rand.nextInt(range));
	}

}
