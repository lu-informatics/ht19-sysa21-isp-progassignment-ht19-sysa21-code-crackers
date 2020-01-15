package model;

import java.util.*;

public class Course {

	private String courseCode;
	private String name;
	private String credits;
	private List<WrittenExam> writtenExamList = new ArrayList<WrittenExam>();

	public Course(String courseName, String courseCredits) {
		this.name = courseName;
		this.credits = courseCredits;
	}

	public List<WrittenExam> getWrittenExamList() {
		return writtenExamList;
	}

	public void setWrittenExamList(List<WrittenExam> writtenExamList) {
		this.writtenExamList = writtenExamList;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return name;
	}

	public void setCourseName(String courseName) {
		this.name = courseName;
	}

	public String getCredit() {
		return credits;
	}

	public void setCredit(String credit) {
		this.credits = credit;
	}

	public void addExamToCourse(Course course, String date, String location, String time) {

		String examId = null;

		while (examId == null) {

			examId = this.generateExamID();
			if (this.findExam(examId) != null) {
				examId = null;
			}
		}
		WrittenExam ex = new WrittenExam(course, date, location, time);
		ex.setExamID(examId);
		if (course.getWrittenExamList().isEmpty()) {
			writtenExamList.add(ex);
		} else {
			for (WrittenExam we : course.getWrittenExamList()) {
				if (we.equals(ex)) {

					writtenExamList.add(ex);

				}
			}
		}
	}

	public WrittenExam findExam(String examID) {

		for (WrittenExam e : writtenExamList) {
			if (e.getExamID() == (examID)) {

				return e;

			}
		}
		return null;
	}

	public void removeExamFromCourse(String examID) {
		WrittenExam tmpExam = this.findExam(examID);
		if (tmpExam != null) {
			this.writtenExamList.remove(tmpExam);
		}

	}

	private String generateExamID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("E%05d", range);
	}

}
