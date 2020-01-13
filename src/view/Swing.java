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
	private JTextField textField_NewNameForCourse;
	private StudentController studentController = new StudentController ();
	private CourseController courseController = new CourseController();
	private ExamController examController;
	private JTextPane textPane_enterStudentName;
	private JTextField textField_EnterStudentName;
	private JTextField textField;

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

		JLabel lblEnterTheNew = new JLabel("Enter the new name:");
		lblEnterTheNew.setBounds(26, 171, 170, 14);
		panel_UpdateStudent.add(lblEnterTheNew);

		textField_NewStudentName = new JTextField();
		textField_NewStudentName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_NewStudentName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField_NewStudentName.setSelectionColor(SystemColor.activeCaption);
		textField_NewStudentName.setBounds(188, 169, 133, 20);
		panel_UpdateStudent.add(textField_NewStudentName);
		textField_NewStudentName.setColumns(10);

		JButton btnUpdate = new JButton("Update student");
		btnUpdate.setBackground(SystemColor.controlLtHighlight);
		btnUpdate.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnUpdate.setBounds(188, 205, 125, 23);
		panel_UpdateStudent.add(btnUpdate);

		JLabel lblResponse = new JLabel("Response:");
		lblResponse.setBounds(44, 263, 68, 14);
		panel_UpdateStudent.add(lblResponse);

		Choice choice_UpdateStudent = new Choice(); // gör combobox
		choice_UpdateStudent.setBounds(304, 69, 114, 26);
		panel_UpdateStudent.add(choice_UpdateStudent);

		JPanel AnswerStudentID = new JPanel();
		AnswerStudentID.setForeground(SystemColor.desktop);
		AnswerStudentID.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Student.addTab("Add Student", null, AnswerStudentID, null);
		AnswerStudentID.setLayout(null);

		JLabel lblEnterStudentsName = new JLabel("Enter Students name:*");
		lblEnterStudentsName.setForeground(SystemColor.controlText);
		lblEnterStudentsName.setBackground(SystemColor.controlText);
		lblEnterStudentsName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblEnterStudentsName.setBounds(10, 42, 146, 29);
		AnswerStudentID.add(lblEnterStudentsName);

		JTabbedPane tabbedPane_Register = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Register.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		tabbedPane_program.addTab("Register", null, tabbedPane_Register, null);

		JTextArea textArea_StudentRegister = new JTextArea(20, 20);

		JScrollPane panel_StudentRegister = new JScrollPane(textArea_StudentRegister);
		tabbedPane_Register.addTab("Student Register", null, panel_StudentRegister, null);
		panel_StudentRegister.setLayout(null);

		JTextArea textArea_AddStudent = new JTextArea();
		textArea_AddStudent.setBackground(Color.LIGHT_GRAY);
		textArea_AddStudent.setBounds(32, 138, 243, 57);
		AnswerStudentID.add(textArea_AddStudent);
		
		JPanel panel_RemoveStudent = new JPanel();
		panel_RemoveStudent.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		tabbedPane_Student.addTab("Remove Student", null, panel_RemoveStudent, null);
		panel_RemoveStudent.setLayout(null);
		
		 Choice choice_RemoveStudent = new Choice();
		 choice_RemoveStudent.setBounds(232, 59, 147, 20);
		 panel_RemoveStudent.add(choice_RemoveStudent);
		 
		 JPanel panel_Result = new JPanel();
			tabbedPane_program.addTab("Results", null, panel_Result, null);
			panel_Result.setLayout(null);
		 
		 Choice choice_SelectStudentForResult = new Choice();
			choice_SelectStudentForResult.setBounds(209, 35, 104, 20);
			panel_Result.add(choice_SelectStudentForResult);

		JButton btnAddStudentButton = new JButton("Add Student");
		btnAddStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String studentName = textField_EnterStudentName.getText();

				if (!studentName.equals("")) {
					studentController.addStudent(studentName);
					textArea_AddStudent.setText("The student has been registered");
				}
			
				else {
					textArea_AddStudent.setText("Put valid information in fields: student name");
				}

				textField_EnterStudentName.setText("");
					if (!studentName.equals("")) {
				choice_RemoveStudent.add(studentName);
				choice_UpdateStudent.add(studentName);
				choice_SelectStudentForResult.add(studentName);
					}

			

		}});
		btnAddStudentButton.setBounds(327, 46, 142, 23);
		AnswerStudentID.add(btnAddStudentButton);

		textField_EnterStudentName = new JTextField();
		textField_EnterStudentName.setBounds(166, 47, 142, 20);
		AnswerStudentID.add(textField_EnterStudentName);
		textField_EnterStudentName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valid characters a-z, A-Z");
		lblNewLabel_1.setBounds(20, 75, 176, 14);
		AnswerStudentID.add(lblNewLabel_1);

		

		JLabel label = new JLabel("");
		label.setBounds(52, 51, 48, 14);
		panel_RemoveStudent.add(label);

		JLabel lbl_StudentToBeRemoved = new JLabel("Select the student to remove:");
		lbl_StudentToBeRemoved.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lbl_StudentToBeRemoved.setBounds(23, 51, 203, 28);
		panel_RemoveStudent.add(lbl_StudentToBeRemoved);

		JLabel lbl_ResponseForRemovedStudent = new JLabel("Response:");
		lbl_ResponseForRemovedStudent.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		lbl_ResponseForRemovedStudent.setBounds(22, 193, 243, 20);
		panel_RemoveStudent.add(lbl_ResponseForRemovedStudent);

		JLabel lbl_DoYouWantToRemove = new JLabel("Do you want to remove this student?");
		lbl_DoYouWantToRemove.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lbl_DoYouWantToRemove.setBounds(23, 162, 228, 14);
		panel_RemoveStudent.add(lbl_DoYouWantToRemove);

		//JComboBox<Student> boxStudentRemove = new JComboBox<Student>();
		//boxStudentRemove.setBounds(203, 56, 142, 20);
		//panel_RemoveStudent.add(boxStudentRemove);
		//StudentController studentRegister = new StudentController();

		//for (Student tmp : studentRegister.getStudentList()) {
			//if (tmp != null) {
				//boxStudentRemove.addItem(tmp);
			//}

		//}

		JButton btnRemoveStudent = new JButton("Remove Student");
		btnRemoveStudent.setBorder(new LineBorder(SystemColor.window, 1, true));
		btnRemoveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					String p = choice_RemoveStudent.getSelectedItem();
					studentController.removeStudent(p);
					choice_RemoveStudent.remove(p);
					choice_UpdateStudent.remove(p);
					choice_SelectStudentForResult.remove(p);
					lbl_ResponseForRemovedStudent.setText("Response: " + p + " " + "has been removed");
			
			}
		});
		btnRemoveStudent.setBackground(SystemColor.window);
		btnRemoveStudent.setBounds(245, 159, 134, 23);
		panel_RemoveStudent.add(btnRemoveStudent);

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
		
		ButtonGroup groupPoints = new ButtonGroup();
		groupPoints.add(rdbtn_7_5points);
		groupPoints.add(rdbtn_15points);
		groupPoints.add(rdbtn_30points);
		
		
		JPanel panel_RemoveCourse = new JPanel();
		tabbedPane_Course.addTab("Remove Course", null, panel_RemoveCourse, null);
		panel_RemoveCourse.setLayout(null);
		
		Choice choice_RemoveCourse = new Choice();
		choice_RemoveCourse.setBounds(264, 39, 135, 20);
		panel_RemoveCourse.add(choice_RemoveCourse);
		
		JPanel panel_UpdateCourse = new JPanel();
		tabbedPane_Course.addTab("Update Course", null, panel_UpdateCourse, null);
		panel_UpdateCourse.setLayout(null);
		
		Choice choice_UpdateCourse = new Choice();
		choice_UpdateCourse.setBounds(190, 32, 130, 20);
		panel_UpdateCourse.add(choice_UpdateCourse);
		
		JPanel panel_AddExam = new JPanel();
		tabbedPane_Course.addTab("Add Exam", null, panel_AddExam, null);
		panel_AddExam.setLayout(null);
		
		Choice choice_AddExamToCourse = new Choice();
		choice_AddExamToCourse.setBounds(182, 27, 123, 20);
		panel_AddExam.add(choice_AddExamToCourse);

		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.setBounds(200, 214, 121, 23);
		panel_AddCourse.add(btnAddCourse);
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String courseName = textField_EnterCourseName.getText();
				//int selectbButton = group.getSelection();
						
				if (!courseName.equals("")) {
					System.out.println("hej");
				//	courseController.addCourse(courseName, );
				}
			groupPoints.clearSelection();	
			textField_EnterCourseName.setText("");
				if(!courseName.equals("")) {
			choice_RemoveCourse.add(courseName);
			choice_UpdateCourse.add(courseName);
			choice_AddExamToCourse.add(courseName);			
				}
			
			}
	
		
	});

		JLabel lbl_AddCourseEnterName = new JLabel("Enter the course name:*");
		lbl_AddCourseEnterName.setBounds(10, 14, 153, 14);
		panel_AddCourse.add(lbl_AddCourseEnterName);

		JLabel lbl_SelectAmountOfPoints = new JLabel("Select amount of points:*");
		lbl_SelectAmountOfPoints.setBounds(10, 116, 166, 14);
		panel_AddCourse.add(lbl_SelectAmountOfPoints);

		textField_EnterCourseName = new JTextField();
		textField_EnterCourseName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_EnterCourseName.setBounds(173, 12, 176, 20);
		panel_AddCourse.add(textField_EnterCourseName);
		textField_EnterCourseName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Response:");
		lblNewLabel.setBounds(59, 252, 84, 14);
		panel_AddCourse.add(lblNewLabel);

		JLabel lbl_EnterCourseToRemove = new JLabel("Enter the course you want to remove:");
		lbl_EnterCourseToRemove.setBounds(0, 45, 258, 14);
		panel_RemoveCourse.add(lbl_EnterCourseToRemove);

		JLabel lbl_ResponseForRemoveCourse = new JLabel("Response:");
		lbl_ResponseForRemoveCourse.setBounds(33, 164, 77, 14);
		panel_RemoveCourse.add(lbl_ResponseForRemoveCourse);

		JButton btn_YesRemoveCourse = new JButton("Remove course");
		btn_YesRemoveCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String p = choice_RemoveStudent.getSelectedItem();
				courseController.removeCourse(p);
				choice_RemoveStudent.remove(p);
				choice_UpdateStudent.remove(p);
				choice_AddExamToCourse.remove(p);
				
				lbl_ResponseForRemoveCourse.setText("Respons: " + p + "has been removed");
				
			}
		});
		btn_YesRemoveCourse.setBounds(262, 119, 137, 23);
		panel_RemoveCourse.add(btn_YesRemoveCourse);

		JLabel lbl_DoYouWantToRemoveCourse = new JLabel("Do you want to remove this course?");
		lbl_DoYouWantToRemoveCourse.setBounds(10, 123, 213, 14);
		panel_RemoveCourse.add(lbl_DoYouWantToRemoveCourse);

		JLabel lbl_CourseToBeUpdated = new JLabel("Choose the course to update:");
		lbl_CourseToBeUpdated.setBounds(10, 38, 174, 14);
		panel_UpdateCourse.add(lbl_CourseToBeUpdated);

		JLabel lbl_NewNameForCourse = new JLabel("Enter the new name:");
		lbl_NewNameForCourse.setBounds(10, 103, 137, 14);
		panel_UpdateCourse.add(lbl_NewNameForCourse);

		textField_NewNameForCourse = new JTextField();
		textField_NewNameForCourse.setBounds(191, 100, 130, 20);
		panel_UpdateCourse.add(textField_NewNameForCourse);
		textField_NewNameForCourse.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("Response:");
		lblNewLabel_11.setBounds(41, 221, 119, 14);
		panel_UpdateCourse.add(lblNewLabel_11);

		JButton btnUpdateCourse = new JButton("Update course");
		btnUpdateCourse.setBounds(191, 142, 130, 23);
		panel_UpdateCourse.add(btnUpdateCourse);

		JLabel lblNewLabel_13 = new JLabel("Enter the date");
		lblNewLabel_13.setBounds(10, 83, 99, 14);

		JLabel lbl_ChooseLocationToExam = new JLabel("Choose location");
		lbl_ChooseLocationToExam.setBounds(10, 136, 111, 14);
		panel_AddExam.add(lbl_ChooseLocationToExam);
		
		JRadioButton rdnbtn_RoomA123 = new JRadioButton("Room A123");
		rdnbtn_RoomA123.setBounds(176, 136, 109, 23);
		panel_AddExam.add(rdnbtn_RoomA123);

		JRadioButton rdbtn_RoomA167 = new JRadioButton("Room A167");
		rdbtn_RoomA167.setBounds(176, 162, 109, 23);
		panel_AddExam.add(rdbtn_RoomA167);

		JRadioButton rdbtn_RoomB198 = new JRadioButton("Room B198");
		rdbtn_RoomB198.setBounds(176, 188, 109, 23);
		panel_AddExam.add(rdbtn_RoomB198);

		JRadioButton rdbtn_RoomB067 = new JRadioButton("Room B067");
		rdbtn_RoomB067.setBounds(176, 215, 109, 23);
		panel_AddExam.add(rdbtn_RoomB067);
		
		ButtonGroup groupRoom = new ButtonGroup();
		groupRoom.add(rdnbtn_RoomA123);
		groupRoom.add(rdbtn_RoomA167);
		groupRoom.add(rdbtn_RoomB198);
		groupRoom.add(rdbtn_RoomB067);

		JButton btnAddExam = new JButton("Add Exam");
		btnAddExam.setBounds(182, 267, 96, 23);
		panel_AddExam.add(btnAddExam);

		JLabel lbl_AddExamToCourse = new JLabel("Add course to exam:");
		lbl_AddExamToCourse.setBounds(10, 27, 153, 14);

		JLabel lblNewLabel_18 = new JLabel("Choose what exam to add to the course:");
		lblNewLabel_18.setBounds(10, 27, 46, 14);

		panel_AddExam.add(lbl_AddExamToCourse);

		JDateChooser dateChooser_ToExam = new JDateChooser();
		dateChooser_ToExam.setBounds(182, 96, 123, 20);
		panel_AddExam.add(dateChooser_ToExam);

		JLabel lbl_ChooseDateToExam = new JLabel("Choose Date:");
		lbl_ChooseDateToExam.setBounds(10, 96, 86, 14);
		panel_AddExam.add(lbl_ChooseDateToExam);

		Label label_1 = new Label("Response");
		label_1.setBounds(21, 308, 62, 22);
		panel_AddExam.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Exam Name:*");
		lblNewLabel_2.setBounds(10, 63, 111, 14);
		panel_AddExam.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(182, 65, 123, 20);
		panel_AddExam.add(textField);
		textField.setColumns(10);

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


		JLabel lbl_SelectStudentForResult = new JLabel("Select student:");
		lbl_SelectStudentForResult.setBounds(44, 41, 104, 14);
		panel_Result.add(lbl_SelectStudentForResult);

		JLabel lbl_SelectExamForResult = new JLabel("Select exam:");
		lbl_SelectExamForResult.setBounds(44, 116, 87, 14);
		panel_Result.add(lbl_SelectExamForResult);

		JLabel lbl_EnterAmountOfPoints = new JLabel("Score:");
		lbl_EnterAmountOfPoints.setBounds(44, 193, 114, 14);
		panel_Result.add(lbl_EnterAmountOfPoints);


		Choice choice_SelectExamForResult = new Choice();
		choice_SelectExamForResult.setBounds(211, 110, 102, 20);
		panel_Result.add(choice_SelectExamForResult);

		TextField textField_EnterAmountOfPoints = new TextField();
		textField_EnterAmountOfPoints.setBounds(209, 193, 104, 22);
		panel_Result.add(textField_EnterAmountOfPoints);

		Button btn_AddResult = new Button("Add result");
		btn_AddResult.setBounds(204, 267, 96, 22);
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
