package control;

import java.util.*;

import model.Course;


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
				Course course = new Course( courseName, credits);
				course.setCourseCode(courseID);
				course.setCredit(credits);
				this.courseList.add(course);
				corseAdded = true;
				System.out.println(course.getCourseCode());
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

}
