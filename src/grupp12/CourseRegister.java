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

		public Course findCourse (String courseToBeFound) {

			for (Course c : this.courseList) {
				if (c.getCourseCode().equals(courseToBeFound)) {
					return c;
				}
			}
			       return null;
		}

		public void addCourse (Course courseToBeAdded) {
			courseList.add(courseToBeAdded);

			
		}
		
		public Course removeCourse (Course courseToBeRemoved) {
			Course tmp = findCourse(courseToBeRemoved);
				if (tmp != null) {
				courseList.remove(tmp);
					return tmp;
		}
			    	return null;
		}
        
		public void updateCourse (String courseCodeToBeUpdated, String courseNameToBeUpdated, int courseCreditToBeUpdated) {
			
			for ( Course c : courseList) {
			String newCourseCode = courseCodeToBeUpdated;
			String newName = courseNameToBeUpdated;
			int newCredit = courseCreditToBeUpdated;
			
				c.setName(newName);
				c.setCourseCode(newCourseCode);
				c.setCredit(newCredit);
				
			} //lägg till update course
		
				}
				
		}

		

	


