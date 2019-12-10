package grupp12;

import java.util.ArrayList;

public class CourseRegister {
	
	private ArrayList <Course> courseList = new ArrayList <Course> ();

	public ArrayList <Course> getCoursList() {
		return courseList;
	}

	public void setCoursList(ArrayList <Course> coursList) {
		this.courseList = coursList;
	}
	
	//public Course findCourse (Course course) {
		
	//	for (Course c : this.courseList) {
		//	if (c.getCourseCode().equals(course)) {
		//		return c;
		//	}
		//}
		 //      return null;
	//}
	
	public void addCourse (Course course) {
		courseList.add(course);
		
		//lägg till remove course och update course
	}
	

}
