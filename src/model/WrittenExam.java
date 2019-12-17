package model;

import java.util.HashMap;

public class WrittenExam {

	private String examID;
	private String date;
	private String location;
	private String time;
	private int maxpoints;
	private Course course;

	private HashMap<String, Result> resultList = new HashMap<String, Result>();

	public HashMap<String, Result> getResultList() {
		return resultList;
	}

	public void setResultList(HashMap<String, Result> resultList) {
		this.resultList = resultList;
	}

	public String getExamID() {
		return examID;
	}

	public void setExamID(String examID) {
		this.examID = examID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMaxpoints() {
		return maxpoints;
	}

	public void setMaxpoints(int maxpoints) {
		this.maxpoints = maxpoints;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void addResultforExam(Result result) {

		this.resultList.put(result.getResult(), result);
	}

}
