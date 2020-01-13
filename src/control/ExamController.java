package control;

import java.util.*;

import model.Result;
import model.Student;
import model.WrittenExam;
import 

import java.util.List;

public class ExamController {

	private List<WrittenExam> examList = new ArrayList<WrittenExam>();

	public List<WrittenExam> getExamList() {
		return examList;
	}

	public void setExamList(List<WrittenExam> examList) {
		this.examList = examList;
	}

	public void addExamToCourse(String courseCode, String date, String location, String time) {
		boolean examAdded = false;
		while (!examAdded) {
			String examID = this.generateExamID();
			for(Course tmpC : CourseControll)
			if (this.findExam(examID) == null) {
				WrittenExam ex = new WrittenExam(date, location, time);
				for (WrittenExam we : examList) {
					//if (ex.getTime() != we.getTime() && ex.getDate() != we.getDate()) {

						ex.setExamID(examID);
						ex.getMaxPoints();
						ex.setDate(date);
						ex.setLocation(location);
						ex.setTime(time);
						
						this.examList.add(ex);
						examAdded = true;
					}
				}
			}
		}
	//}

	public WrittenExam findExam(String examID) {
		for (WrittenExam e : examList) {
			if (e.getExamID().equals(examID)) {

				return e;

			}
		}
		return null;
	}

	public void removeExamFromCourse(String examID) {
		WrittenExam tmpExam = this.findExam(examID);
		if (tmpExam != null) {
			this.examList.remove(tmpExam);
		}

	}

	private String generateExamID() {
		Random rand = new Random();
		int max = 99999;
		int min = 10000;
		int range = rand.nextInt(max-min) + min;
		

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
			return "U";
		}
	}

}
