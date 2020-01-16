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
import java.util.Enumeration;


import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
import model.Course;
import model.Student;
import model.WrittenExam;
import javax.swing.JTable;
import model.Result;
import control.MainController;

public class Swing {

	private JFrame frame;
	private JTextField textField_NewStudentName;
	private JTextField textField_EnterCourseName;
	private JTextField textField_NewNameForCourse;
	private JTextField textField_EnterStudentName;
	private JTextField textField_EnterDate;
	private MainController mainController = new MainController();

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
		tabbedPane_Contoso.setFont(new Font("Tahoma", Font.BOLD, 16));
		tabbedPane_program.addTab("Contoso University", null, tabbedPane_Contoso, null);
		
		mainController.addStudent("Martin");
		mainController.addStudent("Ronny");
		mainController.addStudent("Jenny");
		
		mainController.addCourse("Sysa21","15 points");
		mainController.addCourse("Modeling","30 points");
		
		for ( Course c : mainController.getCourseList()) {
		Course tmp = mainController.findCourse(c.getCourseCode());
			
		mainController.addExamToCourse(tmp, "2020-02-02", "Room B067", "08:00-13:00");
		
		}

		
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
		lblEnterTheStudent.setBounds(26, 71, 152, 24);
		panel_UpdateStudent.add(lblEnterTheStudent);

		JLabel lblEnterTheNew = new JLabel("Enter the new name:*");
		lblEnterTheNew.setBounds(26, 171, 160, 14);
		panel_UpdateStudent.add(lblEnterTheNew);

		textField_NewStudentName = new JTextField();
		textField_NewStudentName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_NewStudentName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_NewStudentName.setSelectionColor(SystemColor.activeCaption);
		textField_NewStudentName.setBounds(188, 169, 265, 20);
		panel_UpdateStudent.add(textField_NewStudentName);
		textField_NewStudentName.setColumns(10);

		JLabel lblResponse_ForUpdate = new JLabel("Response:");
		lblResponse_ForUpdate.setBounds(44, 263, 447, 14);
		panel_UpdateStudent.add(lblResponse_ForUpdate);

		Choice choice_UpdateStudent = new Choice(); 
		choice_UpdateStudent.setFont(new Font("Tahoma", Font.PLAIN, 11));
		choice_UpdateStudent.setBackground(SystemColor.text);
		choice_UpdateStudent.setBounds(188, 69, 303, 26);
		panel_UpdateStudent.add(choice_UpdateStudent);
		for (Student tmp : mainController.getStudentList()) {
			choice_UpdateStudent.add(tmp.getStudentName() + "," + tmp.getStudentID());
		}
		
		JPanel AnswerStudentID = new JPanel();
		AnswerStudentID.setForeground(SystemColor.desktop);
		AnswerStudentID.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Student.addTab("Add Student", null, AnswerStudentID, null);
		AnswerStudentID.setLayout(null);

		JLabel lblEnterStudentsName = new JLabel("Enter Students name:*");
		lblEnterStudentsName.setForeground(SystemColor.controlText);
		lblEnterStudentsName.setBackground(SystemColor.controlText);
		lblEnterStudentsName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEnterStudentsName.setBounds(10, 42, 146, 29);
		AnswerStudentID.add(lblEnterStudentsName);

		JTextArea textArea_AddStudent = new JTextArea();
		textArea_AddStudent.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_AddStudent.setBackground(SystemColor.info);
		textArea_AddStudent.setBounds(10, 138, 243, 57);
		AnswerStudentID.add(textArea_AddStudent);
		
		JPanel panel_RemoveStudent = new JPanel();
		panel_RemoveStudent.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		tabbedPane_Student.addTab("Remove Student", null, panel_RemoveStudent, null);
		panel_RemoveStudent.setLayout(null);
		
		 Choice choice_RemoveStudent = new Choice();
		 choice_RemoveStudent.setFont(new Font("Tahoma", Font.PLAIN, 11));
		 choice_RemoveStudent.setBackground(SystemColor.text);
		 choice_RemoveStudent.setBounds(232, 59, 344, 20);
		 panel_RemoveStudent.add(choice_RemoveStudent);
		 for (Student tmp : mainController.getStudentList()) {
			 choice_RemoveStudent.add(tmp.getStudentName() + "," + tmp.getStudentID());
			}
		 
		 JPanel panel_Result = new JPanel();
		 panel_Result.setBackground(Color.WHITE);
			tabbedPane_program.addTab("Results", null, panel_Result, null);
			panel_Result.setLayout(null);
		 
		 Choice choice_SelectStudentForResult = new Choice();
			choice_SelectStudentForResult.setBounds(209, 35, 370, 20);
			panel_Result.add(choice_SelectStudentForResult);
			for (Student tmp : mainController.getStudentList()) {
				choice_SelectStudentForResult.add(tmp.getStudentName() + "," + tmp.getStudentID());
				}

		JButton btnAddStudentButton = new JButton("Add Student");
		btnAddStudentButton.setForeground(Color.BLACK);
		btnAddStudentButton.setBackground(new Color(255, 255, 255));
		btnAddStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				String studentName = textField_EnterStudentName.getText();

				if (!studentName.equals("")) {
					mainController.addStudent(studentName);
					textArea_AddStudent.setText("The student has been registered");
				}
			
				else {
					textArea_AddStudent.setText("Put valid information in fields: student name");
				}
				
				choice_RemoveStudent.removeAll();
				choice_UpdateStudent.removeAll();
				choice_SelectStudentForResult.removeAll();
				
				for (Student tmp : mainController.getStudentList()) {
					String sNumber = tmp.getStudentID();
					String sName = tmp.getStudentName();
				

				textField_EnterStudentName.setText("");
					if (!studentName.equals("")) {
						
				choice_RemoveStudent.add(sName + "," + sNumber);
				choice_UpdateStudent.add(sName + "," + sNumber);
				choice_SelectStudentForResult.add(sName + "," + sNumber);
				
					}
				}
		}});
		
		btnAddStudentButton.setBounds(354, 46, 109, 23);
		AnswerStudentID.add(btnAddStudentButton);

		textField_EnterStudentName = new JTextField();
		textField_EnterStudentName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_EnterStudentName.setBackground(SystemColor.text);
		textField_EnterStudentName.setBounds(166, 47, 163, 20);
		AnswerStudentID.add(textField_EnterStudentName);
		textField_EnterStudentName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valid characters a-z, A-Z");
		lblNewLabel_1.setBounds(10, 77, 176, 14);
		AnswerStudentID.add(lblNewLabel_1);

		JLabel label = new JLabel("");
		label.setBounds(52, 51, 48, 14);
		panel_RemoveStudent.add(label);

		JLabel lbl_StudentToBeRemoved = new JLabel("Select the student to remove:");
		lbl_StudentToBeRemoved.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_StudentToBeRemoved.setBounds(23, 51, 203, 28);
		panel_RemoveStudent.add(lbl_StudentToBeRemoved);

		JLabel lbl_ResponseForRemovedStudent = new JLabel("Response:");
		lbl_ResponseForRemovedStudent.setBackground(SystemColor.info);
		lbl_ResponseForRemovedStudent.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_ResponseForRemovedStudent.setBounds(22, 193, 580, 20);
		panel_RemoveStudent.add(lbl_ResponseForRemovedStudent);

		JLabel lbl_DoYouWantToRemove = new JLabel("Do you want to remove this student?");
		lbl_DoYouWantToRemove.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbl_DoYouWantToRemove.setBounds(23, 162, 228, 14);
		panel_RemoveStudent.add(lbl_DoYouWantToRemove);

		JButton btnRemoveStudent = new JButton("Remove Student");
		btnRemoveStudent.setForeground(Color.BLACK);
		btnRemoveStudent.setBackground(new Color(255, 255, 255));
		btnRemoveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String student = choice_RemoveStudent.getSelectedItem();
					
					String [] studentParts = student.split(",");
					mainController.removeStudent(studentParts [1]);
					
					choice_RemoveStudent.remove(student);
					choice_UpdateStudent.remove(student);
					choice_SelectStudentForResult.remove(student);
					lbl_ResponseForRemovedStudent.setText("Response: " + student + " " + "has been removed");
					
			}catch (NullPointerException n) {		
				lbl_ResponseForRemovedStudent.setText("Response: No student found to be removed");
			}
			}});
		btnRemoveStudent.setBackground(SystemColor.controlLtHighlight);
		btnRemoveStudent.setBounds(245, 159, 134, 23);
		panel_RemoveStudent.add(btnRemoveStudent);

		JButton btnUpdate = new JButton("Update student");
		btnUpdate.setBackground(SystemColor.controlHighlight);
		btnUpdate.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnUpdate.setBounds(188, 205, 125, 23);
		panel_UpdateStudent.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String updateStudent = choice_UpdateStudent.getSelectedItem();
				String textForUpdate = textField_NewStudentName.getText();
				
                   String [] studentParts = updateStudent.split(",");
				
                   		if (!textForUpdate.equals("")) {
                   			mainController.updateStudent(studentParts[1], textForUpdate);
                   lblResponse_ForUpdate.setText(updateStudent + ": has changed named to " + textForUpdate); 
                   
                   	choice_RemoveStudent.remove(updateStudent);
                   	choice_UpdateStudent.remove(updateStudent);
                   	choice_SelectStudentForResult.remove(updateStudent);
                   
                     choice_RemoveStudent.add(textForUpdate + "," + studentParts[1]);
                     choice_UpdateStudent.add(textForUpdate + "," + studentParts[1]);
                     choice_SelectStudentForResult.add(textForUpdate + "," + studentParts[1]);
                
               }
                   		else lblResponse_ForUpdate.setText("Student was not updated cause to no name entered");
                   	textField_NewStudentName.setText("");
                   	
				}
				catch (NullPointerException n) {		
					lblResponse_ForUpdate.setText("Response: No student was updated");
				
			}}});

		JTabbedPane tabbedPane_Course = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Course.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Course.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tabbedPane_program.addTab("Course", null, tabbedPane_Course, null);

		JPanel panel_AddCourse = new JPanel();
		panel_AddCourse.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_Course.addTab("Add Course", null, panel_AddCourse, null);
		panel_AddCourse.setLayout(null);

		JRadioButton rdbtn_7_points = new JRadioButton("7 points");
		rdbtn_7_points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_7_points.setBounds(212, 112, 109, 23);
		panel_AddCourse.add(rdbtn_7_points);
		rdbtn_7_points.setName("7");

		JRadioButton rdbtn_15points = new JRadioButton("15 points");
		rdbtn_15points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_15points.setBounds(212, 138, 109, 23);
		panel_AddCourse.add(rdbtn_15points);
		rdbtn_15points.setName("15");

		JRadioButton rdbtn_30points = new JRadioButton("30 points");
		rdbtn_30points.setBackground(SystemColor.controlLtHighlight);
		rdbtn_30points.setBounds(212, 161, 109, 23);
		panel_AddCourse.add(rdbtn_30points);
		rdbtn_30points.setName("30");
		
		ButtonGroup groupPoints = new ButtonGroup();
		groupPoints.add(rdbtn_7_points);
		groupPoints.add(rdbtn_15points);
		groupPoints.add(rdbtn_30points);
		
		
		JPanel panel_RemoveCourse = new JPanel();
		panel_RemoveCourse.setBackground(Color.WHITE);
		tabbedPane_Course.addTab("Remove Course", null, panel_RemoveCourse, null);
		panel_RemoveCourse.setLayout(null);
		
		Choice choice_RemoveCourse = new Choice();
		choice_RemoveCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		choice_RemoveCourse.setBounds(264, 39, 338, 20);
		panel_RemoveCourse.add(choice_RemoveCourse);
		for (Course tmpCourse : mainController.getCourseList()) {
			choice_RemoveCourse.add(tmpCourse.getCourseCode() + "," + tmpCourse.getCourseName() + "," + tmpCourse.getCredit());
		}
		
		JPanel panel_UpdateCourse = new JPanel();
		panel_UpdateCourse.setBackground(Color.WHITE);
		tabbedPane_Course.addTab("Update Course", null, panel_UpdateCourse, null);
		panel_UpdateCourse.setLayout(null);
		
		Choice choice_UpdateCourse = new Choice();
		choice_UpdateCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		choice_UpdateCourse.setBounds(190, 32, 412, 20);
		panel_UpdateCourse.add(choice_UpdateCourse);
		for (Course tmpCourse : mainController.getCourseList()) {
			choice_UpdateCourse.add(tmpCourse.getCourseCode() + "," + tmpCourse.getCourseName() + "," + tmpCourse.getCredit());
		}
		
		JPanel panel_AddExam = new JPanel();
		panel_AddExam.setBackground(Color.WHITE);
		tabbedPane_Course.addTab("Add Exam", null, panel_AddExam, null);
		panel_AddExam.setLayout(null);
		
		Choice choice_AddExamToCourse = new Choice();
		choice_AddExamToCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		choice_AddExamToCourse.setBounds(182, 27, 270, 20);
		panel_AddExam.add(choice_AddExamToCourse);
		for (Course tmpCourse : mainController.getCourseList()) {
			choice_AddExamToCourse.add(tmpCourse.getCourseCode() + "," + tmpCourse.getCourseName() + "," + tmpCourse.getCredit());
		}
		
		JLabel lblb_addCourseResponse = new JLabel("Response:");
		lblb_addCourseResponse.setBounds(24, 252, 578, 14);
		panel_AddCourse.add(lblb_addCourseResponse);

		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.setBounds(200, 214, 121, 23);
		panel_AddCourse.add(btnAddCourse);
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String courseName = textField_EnterCourseName.getText();
				String points = "";
				for (Enumeration <AbstractButton> button = groupPoints.getElements(); button.hasMoreElements();) {
				AbstractButton b = button.nextElement();
					if (b.isSelected()) {
					 points = b.getText();
				}
				}
					if (!courseName.equals("")) {
						mainController.addCourse(courseName, points);
						
				}
				        choice_RemoveCourse.removeAll(); /// funkar inte som den ska
						choice_UpdateCourse.removeAll();
						choice_AddExamToCourse.removeAll();
				for (Course tmp : mainController.getCourseList()) {
					String p = tmp.getCourseCode();
					String cN = tmp.getCourseName();
					String credits = tmp.getCredit();
				
			
				if(!courseName.equals("")) {
			choice_RemoveCourse.add(p + "," + cN + "," + credits);
			choice_UpdateCourse.add(p + "," + cN + "," + credits);
			choice_AddExamToCourse.add(p + "," + cN + "," + credits);	
			
			lblb_addCourseResponse.setText("Course: "+ p + " ," + cN + " ," + credits + " has been added");
				}
				else 
					lblb_addCourseResponse.setText("Put in valid information");
				}
				groupPoints.clearSelection();	
				textField_EnterCourseName.setText("");
			}
	});

		JLabel lbl_AddCourseEnterName = new JLabel("Enter the course name:*");
		lbl_AddCourseEnterName.setBounds(10, 14, 153, 14);
		panel_AddCourse.add(lbl_AddCourseEnterName);

		JLabel lbl_SelectAmountOfPoints = new JLabel("Select amount of points:*");
		lbl_SelectAmountOfPoints.setBounds(10, 116, 166, 14);
		panel_AddCourse.add(lbl_SelectAmountOfPoints);

		textField_EnterCourseName = new JTextField();
		textField_EnterCourseName.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_EnterCourseName.setBounds(173, 12, 176, 20);
		panel_AddCourse.add(textField_EnterCourseName);
		textField_EnterCourseName.setColumns(10);

		JLabel lbl_EnterCourseToRemove = new JLabel("Enter the course you want to remove:");
		lbl_EnterCourseToRemove.setBounds(10, 39, 258, 14);
		panel_RemoveCourse.add(lbl_EnterCourseToRemove);

		JLabel lbl_ResponseForRemoveCourse = new JLabel("Response:");
		lbl_ResponseForRemoveCourse.setBounds(33, 164, 569, 14);
		panel_RemoveCourse.add(lbl_ResponseForRemoveCourse);

		JButton btn_YesRemoveCourse = new JButton("Remove course");
		btn_YesRemoveCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String course = choice_RemoveCourse.getSelectedItem();
				String [] courseParts = course.split(",");
				
				mainController.removeCourse(courseParts [1]);
				
				
				
				choice_RemoveCourse.remove(course);
				choice_UpdateCourse.remove(course);
				choice_AddExamToCourse.remove(course);
				
				lbl_ResponseForRemoveCourse.setText("Respons: " + course + " has been removed");
				
				}catch (NullPointerException n) {		
					lbl_ResponseForRemoveCourse.setText("Respons: No course found to be removed");
				}
				}});
		btn_YesRemoveCourse.setBounds(262, 119, 137, 23);
		panel_RemoveCourse.add(btn_YesRemoveCourse);

		JLabel lbl_DoYouWantToRemoveCourse = new JLabel("Do you want to remove this course?");
		lbl_DoYouWantToRemoveCourse.setBounds(10, 123, 213, 14);
		panel_RemoveCourse.add(lbl_DoYouWantToRemoveCourse);

		JLabel lbl_CourseToBeUpdated = new JLabel("Choose the course to update:");
		lbl_CourseToBeUpdated.setBounds(10, 38, 174, 14);
		panel_UpdateCourse.add(lbl_CourseToBeUpdated);

		JLabel lbl_NewNameForCourse = new JLabel("Enter the new name:*");
		lbl_NewNameForCourse.setBounds(10, 103, 137, 14);
		panel_UpdateCourse.add(lbl_NewNameForCourse);

		textField_NewNameForCourse = new JTextField();
		textField_NewNameForCourse.setBounds(191, 100, 130, 20);
		panel_UpdateCourse.add(textField_NewNameForCourse);
		textField_NewNameForCourse.setColumns(10);

		JLabel lbl_ResponsUpdate = new JLabel("Response:");
		lbl_ResponsUpdate.setBounds(41, 221, 561, 14);
		panel_UpdateCourse.add(lbl_ResponsUpdate);

		JButton btnUpdateCourse = new JButton("Update course");
		btnUpdateCourse.setBounds(191, 142, 130, 23);
		panel_UpdateCourse.add(btnUpdateCourse);
		btnUpdateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		String updateCourse = choice_UpdateCourse.getSelectedItem();
		String newName = textField_NewNameForCourse.getText();
		String [] courseParts = updateCourse.split(",");
		
			if (!newName.equals("")) {
				
				mainController.updateCourse(courseParts[0], newName);
		
		choice_RemoveCourse.remove(updateCourse);
		choice_UpdateCourse.remove(updateCourse);
		choice_AddExamToCourse.remove(updateCourse);
		
		choice_RemoveCourse.add(courseParts [0] + "," + newName + "," + courseParts[2]);
		choice_UpdateCourse.add(courseParts [0] + "," + newName + "," + courseParts[2]);
		choice_AddExamToCourse.add(courseParts [0] + "," + newName + "," + courseParts[2]);
		
		lbl_ResponsUpdate.setText(updateCourse + " has changed name to " + newName);
		
			}
			else { lbl_ResponsUpdate.setText("Put in valid course name");
			}
			textField_NewNameForCourse.setText("");
			}
		});

		JLabel lblNewLabel_13 = new JLabel("Enter the date");
		lblNewLabel_13.setBounds(10, 83, 99, 14);

		JLabel lbl_ChooseLocationToExam = new JLabel("Choose location:*");
		lbl_ChooseLocationToExam.setBounds(10, 136, 111, 14);
		panel_AddExam.add(lbl_ChooseLocationToExam);
		
		JRadioButton rdnbtn_RoomA123 = new JRadioButton("Room A123");
		rdnbtn_RoomA123.setBackground(Color.WHITE);
		rdnbtn_RoomA123.setBounds(176, 136, 109, 23);
		panel_AddExam.add(rdnbtn_RoomA123);
		rdnbtn_RoomA123.setName("Room A123");

		JRadioButton rdbtn_RoomA167 = new JRadioButton("Room A167");
		rdbtn_RoomA167.setBackground(Color.WHITE);
		rdbtn_RoomA167.setBounds(176, 162, 109, 23);
		panel_AddExam.add(rdbtn_RoomA167);
		rdbtn_RoomA167.setName("Room A167");

		JRadioButton rdbtn_RoomB198 = new JRadioButton("Room B198");
		rdbtn_RoomB198.setBackground(Color.WHITE);
		rdbtn_RoomB198.setBounds(176, 188, 109, 23);
		panel_AddExam.add(rdbtn_RoomB198);
		rdbtn_RoomB198.setName("Room B198");

		JRadioButton rdbtn_RoomB067 = new JRadioButton("Room B067");
		rdbtn_RoomB067.setBackground(Color.WHITE);
		rdbtn_RoomB067.setBounds(176, 215, 109, 23);
		panel_AddExam.add(rdbtn_RoomB067);
		rdbtn_RoomB067.setName("Room B067");
		
		ButtonGroup groupRoom = new ButtonGroup();
		groupRoom.add(rdnbtn_RoomA123);
		groupRoom.add(rdbtn_RoomA167);
		groupRoom.add(rdbtn_RoomB198);
		groupRoom.add(rdbtn_RoomB067);
		
		Panel panel_RemoveExam = new Panel();
		panel_RemoveExam.setBackground(Color.WHITE);
		tabbedPane_Course.addTab("Remove Exam", null, panel_RemoveExam, null);
		panel_RemoveExam.setLayout(null);
		
		JRadioButton radioButton_time08 = new JRadioButton("08:00-12:00");
		radioButton_time08.setBackground(Color.WHITE);
		radioButton_time08.setBounds(176, 107, 109, 23);
		panel_AddExam.add(radioButton_time08);
		
		JRadioButton radioButton_time13 = new JRadioButton("13:00-17:00");
		radioButton_time13.setBackground(Color.WHITE);
		radioButton_time13.setBounds(295, 107, 109, 23);
		panel_AddExam.add(radioButton_time13);

		ButtonGroup timeGroup = new ButtonGroup();
		timeGroup.add(radioButton_time08);
		timeGroup.add(radioButton_time13);
		
		Choice choice_SelectExam = new Choice();
		choice_SelectExam.setFont(new Font("Tahoma", Font.PLAIN, 11));
		choice_SelectExam.setBounds(162, 55, 440, 23);
		panel_RemoveExam.add(choice_SelectExam);
		for (Course cc : mainController.getCourseList()) {
			for (WrittenExam exam : cc.getWrittenExamList()) {
				choice_SelectExam.add(exam.getCourse().getCourseCode() + ","+ exam.getCourse().getCourseName() + "," + exam.getLocation() + "," + exam.getDate() + "," + exam.getTime() + "," + exam.getExamID());
			}
		}
		
		Label label_ResponseAddExam = new Label("Response");
		label_ResponseAddExam.setBounds(21, 308, 562, 22);
		panel_AddExam.add(label_ResponseAddExam);
		
        Choice choice_SelectExamForResult = new Choice();
		choice_SelectExamForResult.setBounds(211, 110, 370, 20);
		panel_Result.add(choice_SelectExamForResult);
		for (Course cc : mainController.getCourseList()) {
			for (WrittenExam exam : cc.getWrittenExamList()) {
				choice_SelectExamForResult.add(exam.getCourse().getCourseCode() + ","+ exam.getCourse().getCourseName() + "," + exam.getLocation() + "," + exam.getDate() + "," + exam.getTime() + "," + exam.getExamID());
			}
		}
		
		JButton btnAddExam = new JButton("Add Exam");
		btnAddExam.setBounds(182, 267, 96, 23);
		panel_AddExam.add(btnAddExam);
		btnAddExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		    String pickedCourse = choice_AddExamToCourse.getSelectedItem();
		    
		    String [] courseParts = pickedCourse.split(",");
		    
		  Course c =  mainController.findCourse(courseParts[0]);
		  System.out.println(c);
		    
			String date = textField_EnterDate.getText();
			String location = "";
			String time = "";
			
			for (Enumeration <AbstractButton> buttonTime = timeGroup.getElements(); buttonTime.hasMoreElements();) {
					AbstractButton timeButton = buttonTime.nextElement();
						if (timeButton.isSelected()) {
						 time = timeButton.getText();
		
						}
				}
			
				for (Enumeration <AbstractButton> button = groupRoom.getElements(); button.hasMoreElements();) {
					AbstractButton b = button.nextElement();
						if (b.isSelected()) {
						 location = b.getText();
						}
				}
				
			if (!pickedCourse.equals("") && !date.equals("") && !location.equals("") && !time.equals("") ) {
				
				mainController.addExamToCourse(c, date, location, time);
				
				choice_SelectExamForResult.removeAll();
				choice_SelectExam.removeAll();
				for (Course tmp : mainController.getCourseList()) {
					for (WrittenExam ex : tmp.getWrittenExamList()) {
						
						
				choice_SelectExam.add(pickedCourse + "," + ex.getLocation() + "," + ex.getDate() + "," + ex.getTime() + "," + ex.getExamID());
				choice_SelectExamForResult.add(pickedCourse + "," + ex.getLocation() + "," + ex.getDate() + "," + ex.getTime() + "," + ex.getExamID());
					}
					}
				label_ResponseAddExam.setText("The exam has been added to course: " + pickedCourse );		
			}
			else {
				label_ResponseAddExam.setText("Please put information in all required fields");
			}
			
			textField_EnterDate.setText("");
			groupRoom.clearSelection();
			timeGroup.clearSelection();	
			}
			});

		JLabel lbl_AddExamToCourse = new JLabel("Choose course to exam:");
		lbl_AddExamToCourse.setBounds(10, 27, 153, 14);

		JLabel lblNewLabel_18 = new JLabel("Choose what exam to add to the course:");
		lblNewLabel_18.setBounds(10, 27, 46, 14);

		panel_AddExam.add(lbl_AddExamToCourse);

		JLabel lbl_ChooseDateToExam = new JLabel("Enter date:*");
		lbl_ChooseDateToExam.setBounds(10, 63, 86, 14);
		panel_AddExam.add(lbl_ChooseDateToExam);
		
		JLabel lblNewLabel_2 = new JLabel("Select time:*");
		lblNewLabel_2.setBounds(10, 111, 153, 14);
		panel_AddExam.add(lblNewLabel_2);
		
		textField_EnterDate = new JTextField();
		textField_EnterDate.setBounds(182, 60, 143, 20);
		panel_AddExam.add(textField_EnterDate);
		textField_EnterDate.setColumns(10);
		
		JLabel lblYyyymmdd = new JLabel("YYYY-MM-DD");
		lblYyyymmdd.setBounds(10, 78, 86, 14);
		panel_AddExam.add(lblYyyymmdd);

		JLabel lbl_SelectExam = new JLabel("Select exam:");
		lbl_SelectExam.setBounds(51, 61, 94, 14);
		panel_RemoveExam.add(lbl_SelectExam);
		
		JLabel lbl_RemoveExamRespons = new JLabel("Response:");
		lbl_RemoveExamRespons.setBounds(116, 173, 287, 14);
		panel_RemoveExam.add(lbl_RemoveExamRespons);

		Button btn_RemoveExam = new Button("Remove");
		btn_RemoveExam.setBackground(SystemColor.controlHighlight);
		btn_RemoveExam.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_RemoveExam.setForeground(Color.BLACK);
		btn_RemoveExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			String removeExam =	choice_SelectExam.getSelectedItem();
			
			String [] examParts = removeExam.split(",");
				if(removeExam!=null) {
								
			mainController.removeExamFromCourse(examParts[0], examParts[6]);
			choice_SelectExam.remove(removeExam);
			choice_SelectExamForResult.remove(removeExam);
			lbl_RemoveExamRespons.setText("The exam was succesfully removed");
				}
			}
			catch  (NullPointerException n) {
				lbl_RemoveExamRespons.setText("Their is no exam to remove");
			}
			}
		});
		btn_RemoveExam.setBounds(162, 118, 70, 22);
		panel_RemoveExam.add(btn_RemoveExam);

		JLabel lbl_SelectStudentForResult = new JLabel("Select student:");
		lbl_SelectStudentForResult.setBounds(44, 41, 104, 14);
		panel_Result.add(lbl_SelectStudentForResult);

		JLabel lbl_SelectExamForResult = new JLabel("Select exam:");
		lbl_SelectExamForResult.setBounds(44, 116, 87, 14);
		panel_Result.add(lbl_SelectExamForResult);

		JLabel lbl_EnterAmountOfPoints = new JLabel("Score:*");
		lbl_EnterAmountOfPoints.setBounds(44, 193, 114, 14);
		panel_Result.add(lbl_EnterAmountOfPoints);

		JLabel lbl_Response_LetterGrade = new JLabel("Response");
		lbl_Response_LetterGrade.setBounds(40, 314, 551, 14);
		panel_Result.add(lbl_Response_LetterGrade);
		

		TextField textField_EnterAmountOfPoints = new TextField();
		textField_EnterAmountOfPoints.setBounds(209, 193, 104, 22);
		panel_Result.add(textField_EnterAmountOfPoints);

		Button btn_AddResult = new Button("Add result");
		btn_AddResult.setBounds(204, 267, 96, 22);
		panel_Result.add(btn_AddResult);
		btn_AddResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String student = choice_SelectStudentForResult.getSelectedItem();
				String exam = choice_SelectExamForResult.getSelectedItem();
				String points = textField_EnterAmountOfPoints.getText();
						
				int result = Integer.parseInt(points);
				
				String [] examParts = exam.split(",");
				
				String [] studentPart = student.split(",");
				
				if (!points.equals("") && !exam.equals("") && !student.equals(""))
				
			//	mainController.generateLetterGrade(examParts[6], studentPart[1], result);
				mainController.addResult(studentPart[1], examParts[6], result);
				
				for (Student su : mainController.getStudentList()) {
					for (Result ru : su.getStudentResultList()) {
						System.out.println(ru.getResult() + ru.getLetterGrade() + ru.getWrittenExam());
					}
					
				}
				
				
				
				textField_EnterAmountOfPoints.setText("");
				lbl_Response_LetterGrade.setText(student + ", will recive grade: " + mainController.calcExamGrade(result));
			}
			
		});
	}
}
