package control;

import java.util.Random;

import model.Result;
import model.Student;
import model.WrittenExam;

import java.util.ArrayList;

import java.util.List;

public class ExamController {

	private ArrayList<WrittenExam> examList = new ArrayList<WrittenExam>();

	public ArrayList<WrittenExam> getExamList() {
		return examList;
	}

	public void setExamList(ArrayList<WrittenExam> examList) {
		this.examList = examList;
	}

	public void addExam(WrittenExam exam) {
		this.examList.add(exam);
	}

	public WrittenExam findExam(String examID) {
		for (WrittenExam e : examList) {
			if (e.getExamID().equals(examID)) {

				return e;

			}
		}
		return null;
	}

	public void removeExam(String examID) {
		this.examList.remove(examID);
	}

	public String generateExamID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();

		return String.format("E-%05d", rand.nextInt(range));
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
		}
		return "U";
	}

}
