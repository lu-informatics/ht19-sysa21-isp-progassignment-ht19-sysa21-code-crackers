
package grupp12;
import java.lang.Math;
import java.util.Random;
import java.util.HashMap;

public class StudentRegister {

	private HashMap<String, Student> studentList = new HashMap<String, Student>();
	

	public HashMap<String, Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(HashMap<String, Student> studentList) {
		this.studentList = studentList;
	}
  
	public void addStudent(Student student) {
		this.studentList.put(student.getStudentID(), student);
	}

	public Student findStudent(String studentID) {
	  //	return this.studentList.get(studentID);
		for (Student s : studentList.values()) {
			if (s.getStudentID().equals(studentID)) {
				
				return s;
				
				
	}
	}
				return null;
	}

	public void removeStudent(String studentID) {
		this.studentList.remove(studentID);
	}

	public void replace(String studentID, String newName) {

		Student tmp = findStudent(studentID);
		if (tmp != null) {
            tmp.setName(newName);
			//String curName = tmp.getName();
			//if (!Student.equals(curName, oldName) || (curName == null && !containsKey(studentID))) {
				
		}
		public String generateID(Student studentID) {
			int max = 99999; 
		    int min = 10000; 
		    int range = max - min + 10000; 

		    for (int i = 10000; i < 99999; i++) { 
		        int rand = (int)(Math.random() * range) + min;
		        if (i != null) {
		        	String s ="S";
		        	s += rand ;
		        	return rand;
		}
}
		
	}
}


