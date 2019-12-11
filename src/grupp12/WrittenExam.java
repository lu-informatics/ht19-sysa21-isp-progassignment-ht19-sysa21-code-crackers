package grupp12;

import java.util.ArrayList;

public class WrittenExam {
			
			private String examID;
			private int date;
			private String location;
			private String time;
			private int maxpoints;
			private Course course;
			private ArrayList <Student> studentListForExam = new ArrayList <Student> ();
			

			
			public String getExamID() {
				return examID;
			}
			public void setExamID(String examID) {
				this.examID = examID;
			}
			public int getDate() {
				return date;
			}
			public void setDate(int date) {
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
			public int getMaxpoints() {
				return maxpoints;
			}
			public void setMaxpoints(int maxpoints) {
				this.maxpoints = maxpoints;
			}
			
			public Course getCourse() {
				return course;
			}
			public void setCourse(Course course) {
				this.course = course;
			}
			public ArrayList <Student> getStudentListForExam() {
				return studentListForExam;
			}
			public void setStudentListForExam(ArrayList <Student> studentListForExam) {
				this.studentListForExam = studentListForExam;
			}
			
		}

