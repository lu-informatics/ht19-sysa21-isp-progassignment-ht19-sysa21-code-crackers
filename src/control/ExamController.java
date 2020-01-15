package control;

import model.Result;
import model.Student;
import model.WrittenExam;
import model.Course;
//import control.CourseController;
//import control.StudentController;

//public class ExamController {
	/* private CourseController courseController;
	private StudentController studentController;
	
	public WrittenExam findExam(String examID) {
		
			for (Course c : courseController.getCourseList()) {
				for (WrittenExam ex : c.getWrittenExamList()) {
					if (ex.getExamID().equals(examID)) {
						
						return ex;
						
					}
			
				}
					
			}
			return null;
	}
				
	
	public void generateLetterGrade(String examID, String studentID, int points) {
		

		WrittenExam ex = findExam(examID);
		Student student = studentController.findStudent(studentID);
		
			Result result = new Result();
			result.setStudent(student);
			result.setWrittenExam(ex);
			result.setResult(points);
			result.setLetterGrade(this.calcExamGrade(points));
			ex.addResultforExam(result);

		}

		public String calcExamGrade(int result) {

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
*/
