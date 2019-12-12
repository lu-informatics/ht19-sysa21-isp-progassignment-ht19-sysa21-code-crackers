package grupp12;
import java.util.*;
public class Student {
	private static String studentID;
	private static  String name;
	private StudentRegister studentRegister;
	private HashMap <String, Result> studentResultList= new HashMap <String, Result> ();
	
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		Student.studentID = studentID;
	} 

	public void setStudentResultList(HashMap <String, Result> studentResultList) {
		this.studentResultList= studentResultList;
	}
	
	public HashMap <String, Result>getStudentResultList() {
		return studentResultList;
		
	}

	
	public static boolean equals(String curName, String oldName) {
		// TODO Auto-generated method stub
		return false;
	}
} 
