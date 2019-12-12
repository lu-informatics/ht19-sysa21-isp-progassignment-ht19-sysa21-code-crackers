package grupp12;
import java.util.HashMap;


public class CourseRegister {

private HashMap<String, Course> courslist = new HashMap<String, Course>();

public HashMap<String, Course> getCourlist() {
	return courslist;
}

public void setCourlist(HashMap<String, Course> courlist) {
	this.courslist = courlist;
}

public void add(Course course) {
	this.courslist.put(Course.getCourseCode(), course);
}

public Course findCourse(String coursCode) {
	return this.courslist.get(coursCode);
}

public void remove(String courseCode) {
	this.courslist.remove(courseCode);
}
	
public boolean replace(coursCode, name, newName)
}

				



		

	


