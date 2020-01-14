package model;

import java.util.*;


public class WrittenExam {

	private String examID;
	private String date;
	private String location;
	private String time;
	private final int MAXPOINTS = 100;
	private Course course;

	private List<Result> resultList = new ArrayList<Result>();
	

	public WrittenExam(Course course, String date, String location, String time) {
		this.date = date;
		this.location = location;
		this.time = time;
		this.course=course;
	}
	
	
	public List<Result> getResultList() {
		return resultList;
	}

	public void setResultList(List<Result> resultList) {
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

	public double getMaxPoints() {
		return MAXPOINTS;
	}


	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void addResultforExam(Result result) {
		this.resultList.add(result);
	}

}
