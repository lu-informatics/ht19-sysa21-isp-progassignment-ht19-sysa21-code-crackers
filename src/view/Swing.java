package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JDateChooser;


import control.CourseController;
import control.ExamController;
import control.StudentController;
import model.Course;
import model.Student;

public class Swing {

	private JFrame frame;
	private JTextField textField_NewStudentName;
	private JTextField textField_EnterCourseName;
	private JTextField textField_EnterCourseCode;
	private JTextField textField_CourseToRemove;
	private JTextField textField_CourseToBeUpdated;
	private JTextField textField_NewNameForCourse;
	private JTextField textField_10;
	private StudentController studentController = new StudentController ();
	private CourseController courseController;
	private ExamController examController;
	private JTextPane textPane_enterStudentName;
	private JTextField textField_EnterStudentName;
	private JTextField textField_EnterStudentID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlLtHighlight);
		frame.setFont(new Font("Courier New", Font.PLAIN, 12));
		frame.setForeground(Color.WHITE);
		frame.setBackground(SystemColor.controlLtHighlight);

		frame.getContentPane().setLayout(null);

		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane_program = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_program.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_program.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		tabbedPane_program.setForeground(Color.DARK_GRAY);
		frame.getContentPane().add(tabbedPane_program);

		JTabbedPane tabbedPane_Contoso = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Contoso.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Contoso.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		tabbedPane_program.addTab("Contoso University", null, tabbedPane_Contoso, null);

		// JLabel lblNewLabel_18 = new JLabel(""); //Lägga in bild på contosouniversity
		// Image img = new ImageIcon
		// (this.getClass().getResource("/school.jpg")).getImage();

		// lblNewLabel_18.setBounds(10, 22, 432, 273);
		// panel_9.add(lblNewLabel_18);

		JTabbedPane tabbedPane_Student = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Student.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tabbedPane_Student.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_program.addTab("Students", null, tabbedPane_Student, null);

		JPanel panel_UpdateStudent = new JPanel();
		panel_UpdateStudent.setBackground(SystemColor.controlLtHighlight);
		panel_UpdateStudent.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		tabbedPane_Student.addTab("Update Student", null, panel_UpdateStudent, null);
		panel_UpdateStudent.setLayout(null);

		JLabel lblEnterTheStudent = new JLabel("Choose student to update");
		lblEnterTheStudent.setBounds(26, 71, 176, 24);
		panel_UpdateStudent.add(lblEnterTheStudent);

		JButton btnFind = new JButton("Find");
		btnFind.setForeground(new Color(0, 0, 0));
		btnFind.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnFind.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		btnFind.setBackground(SystemColor.controlLtHighlight);
		btnFind.setBounds(363, 102, 55, 23);
		panel_UpdateStudent.add(btnFind);

		JLabel lblEnterTheNew = new JLabel("Enter the new name:");
		lblEnterTheNew.setBounds(26, 171, 170, 14);
		panel_UpdateStudent.add(lblEnterTheNew);

		textField_NewStudentName = new JTextField();
		textField_NewStudentName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_NewStudentName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_NewStudentName.setSelectionColor(SystemColor.activeCaption);
		textField_NewStudentName.setBounds(225, 169, 96, 20);
		panel_UpdateStudent.add(textField_NewStudentName);
		textField_NewStudentName.setColumns(10);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(SystemColor.controlLtHighlight);
		btnUpdate.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnUpdate.setBounds(224, 205, 89, 23);
		panel_UpdateStudent.add(btnUpdate);

		JLabel lblResponse = new JLabel("Response:");
		lblResponse.setBounds(44, 263, 68, 14);
		panel_UpdateStudent.add(lblResponse);

		Choice choice_StudentList = new Choice(); // gör combobox
		choice_StudentList.setBounds(304, 69, 114, 26);
		panel_UpdateStudent.add(choice_StudentList);

		JLabel response_StudentUpdate = new JLabel("Response:");
		response_StudentUpdate.setBounds(44, 126, 68, 14);
		panel_UpdateStudent.add(response_StudentUpdate);

		JPanel AnswerStudentID = new JPanel();
		AnswerStudentID.setForeground(SystemColor.desktop);
		AnswerStudentID.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Student.addTab("Add Student", null, AnswerStudentID, null);
		AnswerStudentID.setLayout(null);

		JLabel lblEnterStudentsName = new JLabel("Enter Students name:");
		lblEnterStudentsName.setForeground(SystemColor.controlText);
		lblEnterStudentsName.setBackground(SystemColor.controlText);
		lblEnterStudentsName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblEnterStudentsName.setBounds(10, 42, 202, 29);
		AnswerStudentID.add(lblEnterStudentsName);

		JTabbedPane tabbedPane_Register = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Register.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		tabbedPane_program.addTab("Register", null, tabbedPane_Register, null);

		JTextArea textArea_StudentRegister = new JTextArea(20, 20);

		JScrollPane panel_StudentRegister = new JScrollPane(textArea_StudentRegister);
		tabbedPane_Register.addTab("Student Register", null, panel_StudentRegister, null);
		panel_StudentRegister.setLayout(null);

		JLabel lblEnterYourStudent = new JLabel("Enter your student ID:");
		lblEnterYourStudent.setBackground(Color.BLACK);
		lblEnterYourStudent.setBounds(10, 101, 175, 14);
		AnswerStudentID.add(lblEnterYourStudent);

		JLabel lblYourStudentId = new JLabel("your student ID must consist of six number");
		lblYourStudentId.setBounds(10, 126, 307, 14);
		AnswerStudentID.add(lblYourStudentId);

		JTextArea textArea_AddStudent = new JTextArea();
		textArea_AddStudent.setBackground(Color.LIGHT_GRAY);
		textArea_AddStudent.setBounds(33, 169, 243, 57);
		AnswerStudentID.add(textArea_AddStudent);

		JButton btnAddStudentButton = new JButton("Add Student");
		btnAddStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String studentName = textField_EnterStudentName.getText();
			//	String studentID = textField_EnterStudentID.getText();

				// Student foundStudent = controller.btnFindStudent_Click(studentID);

				if (!studentName.equals("")) {
					studentController.addStudent(studentName);
					textArea_AddStudent.setText("The student has been registered");
					
				
				//	if (studentController.btnFindStudent_Click(studentID) == null) {

					//	Student addThisStudent = new Student(studentID, studentName);
						//controller1.btnAddStudent_Click(addThisStudent);
					//	textArea_AddStudent.setText("This student has been added to the studentregister.");

					//} else if ((studentID) != null) {
						//textArea_AddStudent.setText("This student has already been registered.");
				}
			
				

				else {
					textArea_AddStudent.setText("Put valid information in fields: student-ID, student name");
				}

				textField_EnterStudentName.setText("");
				textField_EnterStudentID.setText("");

			

		}});
		btnAddStudentButton.setBounds(281, 153, 89, 23);
		AnswerStudentID.add(btnAddStudentButton);

		textField_EnterStudentName = new JTextField();
		textField_EnterStudentName.setBounds(222, 47, 86, 20);
		AnswerStudentID.add(textField_EnterStudentName);
		textField_EnterStudentName.setColumns(10);

		textField_EnterStudentID = new JTextField();
		textField_EnterStudentID.setBounds(222, 98, 86, 20);
		AnswerStudentID.add(textField_EnterStudentID);
		textField_EnterStudentID.setColumns(10);

		JPanel panel_RemoveStudent = new JPanel();
		panel_RemoveStudent.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		tabbedPane_Student.addTab("Remove Student", null, panel_RemoveStudent, null);
		panel_RemoveStudent.setLayout(null);
		

		JLabel label = new JLabel("");
		label.setBounds(52, 51, 48, 14);
		panel_RemoveStudent.add(label);

		JLabel lbl_StudentToBeRemoved = new JLabel("Select the student to remove:");
		lbl_StudentToBeRemoved.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lbl_StudentToBeRemoved.setBounds(23, 51, 203, 28);
		panel_RemoveStudent.add(lbl_StudentToBeRemoved);

		JLabel lbl_ResponseForRemovedStudent = new JLabel("Response:");
		lbl_ResponseForRemovedStudent.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		lbl_ResponseForRemovedStudent.setBounds(23, 101, 78, 14);
		panel_RemoveStudent.add(lbl_ResponseForRemovedStudent);

		JLabel lbl_DoYouWantToRemove = new JLabel("Do you want to remove this student?");
		lbl_DoYouWantToRemove.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lbl_DoYouWantToRemove.setBounds(23, 162, 228, 14);
		panel_RemoveStudent.add(lbl_DoYouWantToRemove);

		// Choice choice_2 = new Choice();
		// choice_2.setBounds(307, 59, 109, 20);
		// panel_7.add(choice_2);
		JComboBox<Student> boxStudentRemove = new JComboBox<Student>();
		boxStudentRemove.setBounds(307, 59, 109, 20);
		panel_RemoveStudent.add(boxStudentRemove);
		StudentController studentRegister = new StudentController();

		for (Student tmp : studentRegister.getStudentList()) {
			if (tmp != null) {
				boxStudentRemove.addItem(tmp);
			}

		}

		JButton btnRemoveStudent = new JButton("Remove Student");
		btnRemoveStudent.setBorder(new LineBorder(SystemColor.window, 1, true));
		btnRemoveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 Student student = (Student) boxStudentRemove.getSelectedItem();
				 studentController.removeStudent(student.getStudentID());
			
			}
		});
		btnRemoveStudent.setBackground(SystemColor.window);
		btnRemoveStudent.setBounds(245, 159, 109, 23);
		panel_RemoveStudent.add(btnRemoveStudent);

		JButton btnNewButton_1 = new JButton("Find");
		btnNewButton_1.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_1.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnNewButton_1.setBounds(426, 55, 89, 23);
		panel_RemoveStudent.add(btnNewButton_1);

		;

		// panel.add(btnAddStudent)

		JTabbedPane tabbedPane_Course = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Course.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Course.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		tabbedPane_program.addTab("Course", null, tabbedPane_Course, null);

		JPanel panel_AddCourse = new JPanel();
		panel_AddCourse.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Course.addTab("Add Course", null, panel_AddCourse, null);
		panel_AddCourse.setLayout(null);

		JRadioButton rdbtn_7_5points = new JRadioButton("7,5 points");
		rdbtn_7_5points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_7_5points.setBounds(212, 112, 109, 23);
		panel_AddCourse.add(rdbtn_7_5points);

		JRadioButton rdbtn_15points = new JRadioButton("15 points");
		rdbtn_15points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_15points.setBounds(212, 138, 109, 23);
		panel_AddCourse.add(rdbtn_15points);

		JRadioButton rdbtn_30points = new JRadioButton("30 points");
		rdbtn_30points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_30points.setBounds(212, 161, 109, 23);
		panel_AddCourse.add(rdbtn_30points);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn_7_5points);
		group.add(rdbtn_15points);
		group.add(rdbtn_30points);

		/*JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String courseName = textField_EnterCourseName.getText();
				String courseCode = textField_EnterCourseCode.getText();
				// int courseCredit = group.setSelected(m, b); // vilka paramentrar?
				if (!courseName.equals("") && !courseCode.equals("")) {
					if (courseController.findCourse(courseCode)(courseCode) == null) {
						Course addThisCourse = new Course(courseName, courseCode);

					}
				}

			}
	
		}
	});*/

		JLabel lbl_AddCourseEnterName = new JLabel("Enter the course name:");
		lbl_AddCourseEnterName.setBounds(20, 14, 160, 14);
		panel_AddCourse.add(lbl_AddCourseEnterName);

	//	btnAddCourse.setBounds(214, 203, 89, 23);
		//panel_AddCourse.add(btnAddCourse);

		JLabel lbl_EnterCourseCode = new JLabel("Enter the course code:");
		lbl_EnterCourseCode.setBounds(20, 54, 149, 14);
		panel_AddCourse.add(lbl_EnterCourseCode);

		JLabel lbl_SelectAmountOfPoints = new JLabel("Select amount of points:");
		lbl_SelectAmountOfPoints.setBounds(59, 116, 131, 14);
		panel_AddCourse.add(lbl_SelectAmountOfPoints);

		textField_EnterCourseName = new JTextField();
		textField_EnterCourseName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_EnterCourseName.setBounds(190, 12, 86, 20);
		panel_AddCourse.add(textField_EnterCourseName);
		textField_EnterCourseName.setColumns(10);

		textField_EnterCourseCode = new JTextField();
		textField_EnterCourseCode.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_EnterCourseCode.setBounds(190, 52, 86, 20);
		panel_AddCourse.add(textField_EnterCourseCode);
		textField_EnterCourseCode.setColumns(10);

		JPanel panel_RemoveCourse = new JPanel();
		tabbedPane_Course.addTab("Remove Course", null, panel_RemoveCourse, null);
		panel_RemoveCourse.setLayout(null);

		JLabel lbl_EnterCourseToRemove = new JLabel("Enter the course you want to remove:");
		lbl_EnterCourseToRemove.setBounds(33, 45, 240, 14);
		panel_RemoveCourse.add(lbl_EnterCourseToRemove);

		textField_CourseToRemove = new JTextField();
		textField_CourseToRemove.setBounds(250, 42, 86, 20);
		panel_RemoveCourse.add(textField_CourseToRemove);
		textField_CourseToRemove.setColumns(10);

		JLabel lbl_ResponseForRemoveCourse = new JLabel("Response:");
		lbl_ResponseForRemoveCourse.setBounds(33, 81, 77, 14);
		panel_RemoveCourse.add(lbl_ResponseForRemoveCourse);

		JButton btn_YesRemoveCourse = new JButton("Yes");
		btn_YesRemoveCourse.setBounds(250, 119, 86, 23);
		panel_RemoveCourse.add(btn_YesRemoveCourse);

		JLabel lbl_DoYouWantToRemoveCourse = new JLabel("Do you want to remove this course?");
		lbl_DoYouWantToRemoveCourse.setBounds(32, 123, 191, 14);
		panel_RemoveCourse.add(lbl_DoYouWantToRemoveCourse);

		JButton btn_NoRemoveCourse = new JButton("No");
		btn_NoRemoveCourse.setBounds(346, 119, 86, 23);
		panel_RemoveCourse.add(btn_NoRemoveCourse);

		JPanel panel_UpdateCourse = new JPanel();
		tabbedPane_Course.addTab("Update Course", null, panel_UpdateCourse, null);
		panel_UpdateCourse.setLayout(null);

		JLabel lbl_CourseToBeUpdated = new JLabel("Enter the course to be updated:");
		lbl_CourseToBeUpdated.setBounds(23, 38, 159, 14);
		panel_UpdateCourse.add(lbl_CourseToBeUpdated);

		textField_CourseToBeUpdated = new JTextField();
		textField_CourseToBeUpdated.setBounds(192, 35, 86, 20);
		panel_UpdateCourse.add(textField_CourseToBeUpdated);
		textField_CourseToBeUpdated.setColumns(10);

		JLabel lbl_NewNameForCourse = new JLabel("Enter the new name:");
		lbl_NewNameForCourse.setBounds(41, 103, 119, 14);
		panel_UpdateCourse.add(lbl_NewNameForCourse);

		textField_NewNameForCourse = new JTextField();
		textField_NewNameForCourse.setBounds(192, 100, 86, 20);
		panel_UpdateCourse.add(textField_NewNameForCourse);
		textField_NewNameForCourse.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Response:");
		lblNewLabel_11.setBounds(41, 221, 119, 14);
		panel_UpdateCourse.add(lblNewLabel_11);

		JButton btnUpdateCourse = new JButton("Update");
		btnUpdateCourse.setBounds(189, 142, 89, 23);
		panel_UpdateCourse.add(btnUpdateCourse);

		JPanel panel_AddExam = new JPanel();
		tabbedPane_Course.addTab("Add Exam", null, panel_AddExam, null);
		panel_AddExam.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("Enter the date");
		lblNewLabel_13.setBounds(10, 83, 99, 14);

		JLabel lbl_ChooseLocationToExam = new JLabel("Choose the location");
		lbl_ChooseLocationToExam.setBounds(10, 110, 111, 14);
		panel_AddExam.add(lbl_ChooseLocationToExam);

		JLabel lblNewLabel_15 = new JLabel("The exam will have 100 points");
		lblNewLabel_15.setBounds(10, 224, 144, 14);
		panel_AddExam.add(lblNewLabel_15);

		textField_10 = new JTextField();
		textField_10.setBounds(175, 221, 86, 20);
		panel_AddExam.add(textField_10);
		textField_10.setColumns(10);

		JRadioButton rdnbtn_RoomA123 = new JRadioButton("Room A123");
		rdnbtn_RoomA123.setBounds(152, 106, 109, 23);
		panel_AddExam.add(rdnbtn_RoomA123);

		JRadioButton rdbtn_RoomA167 = new JRadioButton("Room A167");
		rdbtn_RoomA167.setBounds(152, 132, 109, 23);
		panel_AddExam.add(rdbtn_RoomA167);

		JRadioButton rdbtn_RoomB198 = new JRadioButton("Room B198");
		rdbtn_RoomB198.setBounds(152, 158, 109, 23);
		panel_AddExam.add(rdbtn_RoomB198);

		JRadioButton rdbtn_RoomB067 = new JRadioButton("Room B067");
		rdbtn_RoomB067.setBounds(152, 184, 109, 23);
		panel_AddExam.add(rdbtn_RoomB067);

		JButton btnAddExam = new JButton("Add Exam");
		btnAddExam.setBounds(142, 266, 96, 23);
		panel_AddExam.add(btnAddExam);

		JLabel lbl_AddExamToCourse = new JLabel("Add exam to course:");
		lbl_AddExamToCourse.setBounds(10, 27, 111, 14);

		JLabel lblNewLabel_18 = new JLabel("Choose what exam to add to the course:");
		lblNewLabel_18.setBounds(10, 27, 46, 14);

		panel_AddExam.add(lbl_AddExamToCourse);

		Choice choice_AddExamToCourse = new Choice();
		choice_AddExamToCourse.setBounds(142, 23, 96, 20);
		panel_AddExam.add(choice_AddExamToCourse);

		JDateChooser dateChooser_ToExam = new JDateChooser();
		dateChooser_ToExam.setBounds(112, 63, 126, 20);
		panel_AddExam.add(dateChooser_ToExam);

		JLabel lbl_ChooseDateToExam = new JLabel("Choose Date:");
		lbl_ChooseDateToExam.setBounds(10, 63, 86, 14);
		panel_AddExam.add(lbl_ChooseDateToExam);

		Label label_1 = new Label("Response:");
		label_1.setBounds(21, 308, 62, 22);
		panel_AddExam.add(label_1);

		Panel panel_RemoveExam = new Panel();
		tabbedPane_Course.addTab("Remove Exam", null, panel_RemoveExam, null);
		panel_RemoveExam.setLayout(null);

		JLabel lbl_SelectExam = new JLabel("Select exam:");
		lbl_SelectExam.setBounds(51, 61, 94, 14);
		panel_RemoveExam.add(lbl_SelectExam);

		Choice choice_SelectExam = new Choice();
		choice_SelectExam.setBounds(162, 55, 166, 23);
		panel_RemoveExam.add(choice_SelectExam);

		Button btn_RemoveExam = new Button("Remove");
		btn_RemoveExam.setBounds(162, 118, 70, 22);
		panel_RemoveExam.add(btn_RemoveExam);

		JPanel panel_Result = new JPanel();
		tabbedPane_program.addTab("Results", null, panel_Result, null);
		panel_Result.setLayout(null);

		JLabel lbl_SelectStudentForResult = new JLabel("Select student:");
		lbl_SelectStudentForResult.setBounds(44, 41, 104, 14);
		panel_Result.add(lbl_SelectStudentForResult);

		JLabel lbl_SelectExamForResult = new JLabel("Select exam:");
		lbl_SelectExamForResult.setBounds(44, 116, 87, 14);
		panel_Result.add(lbl_SelectExamForResult);

		JLabel lbl_EnterAmountOfPoints = new JLabel("Enter amount of points:");
		lbl_EnterAmountOfPoints.setBounds(44, 193, 114, 14);
		panel_Result.add(lbl_EnterAmountOfPoints);

		Choice choice_SelectStudentForResult = new Choice();
		choice_SelectStudentForResult.setBounds(209, 35, 104, 20);
		panel_Result.add(choice_SelectStudentForResult);

		Choice choice_SelectExamForResult = new Choice();
		choice_SelectExamForResult.setBounds(211, 110, 102, 20);
		panel_Result.add(choice_SelectExamForResult);

		TextField textField_EnterAmountOfPoints = new TextField();
		textField_EnterAmountOfPoints.setBounds(209, 193, 104, 22);
		panel_Result.add(textField_EnterAmountOfPoints);

		Button btn_AddResult = new Button("Add result");
		btn_AddResult.setBounds(230, 267, 70, 22);
		panel_Result.add(btn_AddResult);

		// JTextPane textPane_EnterStudentName = new JTextPane();
		// studentRegister.getStudentList();
		// textPane_EnterStudentName.setBounds(10, 11, 400, 198);
		// panel_RemoveCourse.add(textPane_EnterStudentName);

		JPanel panel_CourseRegister = new JPanel();
		tabbedPane_Register.addTab("Course Register", null, panel_CourseRegister, null);
		panel_CourseRegister.setLayout(null);

		JTextPane textPane_CourseRegister = new JTextPane();
		textPane_CourseRegister.setBounds(21, 11, 400, 198);
		panel_CourseRegister.add(textPane_CourseRegister);
	}
}
