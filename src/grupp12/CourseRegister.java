package grupp12;
import java.util.HashMap;


public class CourseRegister {

private HashMap<String, Course> courseList = new HashMap<String, Course>();

public HashMap<String, Course> getCourselist() {
	return courseList;
}

public void setCourlist(HashMap<String, Course> courlist) {
	this.courseList = courlist;
}

public void addCourse(Course course) {
	this.courseList.put(Course.getCourseCode(), course);
}

public Course findCourse(String coursCode) {
	return this.courseList.get(coursCode);
}

public void remove(String courseCode) {
	this.courseList.remove(courseCode);
} 
	
public void replace(String courseCode, String oldName, String newName) {
	String curName= Course.getName();
	if ( !Course.equals(curName, oldName) || (curName == null && !containsKey(courseCode))) {

	}

}

private boolean containsKey(String courseCode) {
	// TODO Auto-generated method stub
	return false;
}
}
				



		

	


