package grupp12;


import java.util.HashMap;

public class Course {
	
	private String courseCode;
	private String name;
	private int credit;
	private CourseRegister courseRegister;
	private HashMap<String, WrittenExam> writtenExamList = new HashMap<String, WrittenExam>();

	public HashMap<String, WrittenExam> getWrittenExamList() {
		return writtenExamList;
	}
	public void setWrittenExamList(HashMap<String, WrittenExam> writtenExamList) {
		this.writtenExamList = writtenExamList;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}	
	public void add(WrittenExam writtenExam) {
		this.writtenExamList.put(WrittenExam.getExamID(), writtenExam);
	}	
	public void remove(String examID) {
		this.writtenExamList.remove(examID); 
	}
	public CourseRegister getCourseRegister() {
		return courseRegister;
	}
	public void setCourseRegister(CourseRegister courseRegister) {
		this.courseRegister = courseRegister;
	}
	public static boolean equals(String curName, String oldName) { //vad betyder detta? wtf
		// TODO Auto-generated method stub
		return false;
	}
}
