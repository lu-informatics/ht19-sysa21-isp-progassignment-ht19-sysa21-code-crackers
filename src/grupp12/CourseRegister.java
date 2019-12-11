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
		
		public void removeCourse (String courseToBeRemoved) {
			Course tmp = this.findCourse(courseToBeRemoved);
				if (tmp != null) {
				courseList.remove(tmp);
					
		}
		}	    	
		
        
		public void updateCourse ( String courseToBeUpdated, String newCourse) {
			
			Course tmp = findCourse(courseToBeUpdated);
				if (tmp != null) {
					tmp.setName(newCourse);
				}
			} 
		
			
				
		}


		

	


