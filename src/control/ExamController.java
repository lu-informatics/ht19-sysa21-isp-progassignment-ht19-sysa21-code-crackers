package control;

import java.util.*;

import model.Result;
import model.Student;
import model.Course;
import model.WrittenExam;

import java.util.List;

public class ExamController {

	private WrittenExam writtenExam;

	public WrittenExam getWrittenExam() {
		return writtenExam;
	}

	public void setWrittenExam(WrittenExam writtenExam) {
		this.writtenExam = writtenExam;
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
			course.addWrittenExam(ex);
		} else {
			for (WrittenExam we : course.getWrittenExamList()) {
				if (we.equals(ex)) {

					course.addWrittenExam(ex);

				}
			}
		}
	}

	public WrittenExam findExam(String examID) {

		for (WrittenExam e : this.writtenExam.getCourse().getWrittenExamList())
			;
		{
			if (e.getExamID() == (examID)) {

				return e;

			}
		}
		return null;
	}

	public void removeExamFromCourse(String examID) {
		WrittenExam tmpExam = this.findExam(examID);
		if (tmpExam != null) {
			this.writtenExam.getCourse().getWrittenExamList().remove(tmpExam);
		}

	}

	private String generateExamID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max - min) + min;

		return String.format("E%05d", range);
	}

	public void generateLettergrade(String examID, Student student, int points) {
		Result result = new Result();
		WrittenExam ex = this.findExam(examID);
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

}
