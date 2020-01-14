package control;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import model.Course;
import model.WrittenExam;

public class ExamControllerTest {

	@Test
	public void testAddWrittenExam() {
		ExamController examController = new ExamController();
		Course course = new Course("TestCourse", "100");
		examController.addExamToCourse(course, "2020 12 19", "A123", "08:00");
		
		Assert.assertTrue(course.getWrittenExamList().size() == 1);
		Assert.assertTrue(course.getWrittenExamList().get(0).getExamID() != null);
	}
	
	@Test
	public void testFindExam() {
		ExamController examController = new ExamController();
		Course course = new Course("TestCourse", "100");
		examController.addExamToCourse(course, "2020 12 19", "A123", "08:00");
		
		List<WrittenExam> examList = course.getWrittenExamList();
		WrittenExam writtenExam = examList.get(0);
		WrittenExam exam = examController.findExam(writtenExam.getExamID());
		Assert.assertTrue(exam.equals(writtenExam));
	}

}
