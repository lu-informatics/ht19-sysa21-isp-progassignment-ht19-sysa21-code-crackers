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
	
public void replace(String courseCode, String oldName, String newName) {
	String curName= Course.getName();
	if ( !Course.equals(curName, oldName) || (curName == null && !containsKey(courseCode))) {
		return;
	}

}

private boolean containsKey(String courseCode) {
	// TODO Auto-generated method stub
	return false;
}
}
				



		

	


