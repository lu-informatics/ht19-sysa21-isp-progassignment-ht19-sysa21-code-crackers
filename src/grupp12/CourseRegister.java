package grupp12;
import java.util.HashMap;


public class CourseRegister {

private HashMap<String, Course> courselist = new HashMap<String, Course>();

public HashMap<String, Course> getCourselist() {
	return courselist;
}

public void setCourlist(HashMap<String, Course> courlist) {
	this.courselist = courlist;
}

public void add(Course course) {
	this.courselist.put(Course.getCourseCode(), course);
}

public Course findCourse(String coursCode) {
	return this.courselist.get(coursCode);
}

public void remove(String courseCode) {
	this.courselist.remove(courseCode);
} 
	
public boolean replace(courseCode, oldName, newName) {
	Course curName= Course.get(name);
	if ( !Course.equals(curName, oldName) || (curName == null && !containsKey(courseCode))) {
		return false;
	}

}
}
				



		

	


