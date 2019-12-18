package model;

import java.util.HashMap;
import java.util.Random;

public class CourseRegister {

	private HashMap<String, Course> courseList = new HashMap<String, Course>();

	public HashMap<String, Course> getCourseList() {
		return courseList;
	}

	public void setCourList(HashMap<String, Course> courlist) {
		this.courseList = courlist;
	}

	public void addCourse(Course course) {
		this.courseList.put(course.getCourseCode(), course);
	}

	public Course findCourse(String courseCode) {
		for (Course c : courseList.values()) {
			if (c.getCourseCode().contentEquals(courseCode)) {

				return c;
			}
		}
		return null;
	}

	public void remove(String courseCode) {
		this.courseList.remove(courseCode);
	}

	public void replace(String courseCode, String newName) {
		Course tmp = findCourse(courseCode);
		if (tmp != null) {

			// String curName = tmp.getName();
			// if (!Course.equals(curName, oldName) || (curName == null &&
			// !containsKey(courseCode))) {

			tmp.setCourseName(newName);
		}
	}
	public String generateCourseID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();
		
		return String.format("C-%05d", rand.nextInt(range));
	}
}
