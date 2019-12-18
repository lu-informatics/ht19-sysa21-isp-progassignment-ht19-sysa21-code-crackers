package model;
import java.util.Random;
import java.util.HashMap;


public class WrittenExamRegister {


private HashMap<String, WrittenExam> examList = new HashMap<String, WrittenExam>();

public HashMap<String, WrittenExam> getExamList() {
		return examList;
	}

	public void setExamList(HashMap<String, WrittenExam> studentList) {
		this.examList = studentList;
	}

	public void addExam(WrittenExam exam) {
		this.examList.put(examList.getExamID(), exam);
	}

	public WrittenExam findExam(String examID) {
		for (WrittenExam e : examList.values()) {
			if (e.getExamID().equals(examID)) {

				return e;

			}
		}
		return null;
	}

	public void removeExam(String examID) {
		this.examList.remove(examID);
	}

	
	
	public String generateID() {
		int max = 99999;
		int min = 10000;
		int range = max - min + 10000;
		Random rand = new Random();
		
		return String.format("E-%05d", rand.nextInt(range));
	}

}



