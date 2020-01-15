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

	public WrittenExam( String course, String date, String location, String time) {
		this.date = date;
		this.location = location;
		this.time = time;
		
		// this.course = course; // vill ha en hel kurs.
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

	public boolean equals(Object exam) {
		boolean isSame = false;
		if (exam instanceof WrittenExam) {
			if (((WrittenExam)exam).getTime() == this.getTime() && ((WrittenExam)exam).getDate() == this.getDate()
					&& ((WrittenExam)exam).getLocation() == this.getLocation()) {
				isSame = true;
			}
		}
		return isSame;
	}
	public void generateLettergrade(String examID, Student student, int points) {
		Result result = new Result();
		WrittenExam ex = course.findExam(examID);
		result.setStudent(student);
		result.setWrittenExam(ex);
		result.setResult(points);
		result.setLetterGrade(this.CalcExamGrade(points));
		ex.addResultforExam(result);

	}

	public String CalcExamGrade(int result) {

		if (result >= 50 && result < 55) {
			return "E";
		} else if (result >= 55 && result < 65) {
			return "D";
		} else if (result >= 65 && result < 75) {
			return "C";
		} else if (result >= 75 && result < 85) {
			return "B";
		} else if (result >= 85 && result <= 100) {
			return "A";
		} else {
			return "Fail";
		}
	}




}
