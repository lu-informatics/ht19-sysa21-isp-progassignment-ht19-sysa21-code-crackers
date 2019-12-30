package model;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;


public class WrittenExamRegister {


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

}



