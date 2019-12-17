package view;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.SystemColor;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class Swing {

	private JFrame frame;
	private JTextField txtTheStudentWill;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 612, 405);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Contoso University", null, tabbedPane_4, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Students", null, tabbedPane_2, null);
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("Add Student", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblEnterStudentsName = new JLabel("Enter Students name");
		lblEnterStudentsName.setBounds(40, 56, 109, 29);
		panel.add(lblEnterStudentsName);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(160, 66, 102, 19);
		panel.add(textPane);
		
		txtTheStudentWill = new JTextField();
		txtTheStudentWill.setText("The student will get this Student ID");
		txtTheStudentWill.setBounds(36, 131, 113, 19);
		panel.add(txtTheStudentWill);
		txtTheStudentWill.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("Update Student", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblEnterTheStudent = new JLabel("Enter the name of the student that you want to update");
		lblEnterTheStudent.setBounds(10, 65, 310, 24);
		panel_6.add(lblEnterTheStudent);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(330, 65, 101, 22);
		panel_6.add(textArea);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(340, 98, 89, 23);
		panel_6.add(btnFind);
		
		JLabel lblEnterTheNew = new JLabel("Enter the new name of the student");
		lblEnterTheNew.setBounds(26, 171, 176, 14);
		panel_6.add(lblEnterTheNew);
		
		textField = new JTextField();
		textField.setBounds(224, 168, 96, 20);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(224, 205, 89, 23);
		panel_6.add(btnUpdate);
		
		JLabel lblResponse = new JLabel("Response:");
		lblResponse.setBounds(44, 263, 68, 14);
		panel_6.add(lblResponse);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Remove Student", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(52, 51, 48, 14);
		panel_7.add(label);
		
		JLabel lblNewLabel = new JLabel("Enter the students name that you want to remove");
		lblNewLabel.setBounds(10, 51, 249, 14);
		panel_7.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(284, 45, 86, 20);
		panel_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Response:");
		lblNewLabel_1.setBounds(79, 104, 78, 14);
		panel_7.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Do you want to remove this student?");
		lblNewLabel_2.setBounds(10, 162, 205, 14);
		panel_7.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Yes, remove.");
		btnNewButton.setBounds(225, 158, 109, 23);
		panel_7.add(btnNewButton);	
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(380, 44, 89, 23);
		panel_7.add(btnNewButton_1);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Course", null, tabbedPane_1, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Add Course", null, panel_1, null);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("7,5 points");
		rdbtnNewRadioButton.setBounds(167, 112, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("15 points");
		rdbtnNewRadioButton_1.setBounds(167, 138, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("30 points");
		rdbtnNewRadioButton_2.setBounds(167, 161, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter the course name:");
		lblNewLabel_3.setBounds(20, 14, 131, 14);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Add Course");
		btnNewButton_2.setBounds(172, 203, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Enter the course code:");
		lblNewLabel_4.setBounds(20, 54, 131, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Select amount of points:");
		lblNewLabel_5.setBounds(21, 116, 131, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(151, 11, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 51, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Remove Course", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Enter the course you want to remove:");
		lblNewLabel_6.setBounds(33, 45, 207, 14);
		panel_2.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(250, 42, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Response:");
		lblNewLabel_7.setBounds(33, 81, 77, 14);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_3 = new JButton("Yes, remove");
		btnNewButton_3.setBounds(250, 119, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_8 = new JLabel("Do you want to remove this course?");
		lblNewLabel_8.setBounds(32, 123, 191, 14);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Update Course", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Enter the course to be updated:");
		lblNewLabel_9.setBounds(23, 38, 159, 14);
		panel_3.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(192, 35, 86, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Enter the new name:");
		lblNewLabel_10.setBounds(41, 103, 119, 14);
		panel_3.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(192, 100, 86, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Response:");
		lblNewLabel_11.setBounds(41, 221, 119, 14);
		panel_3.add(lblNewLabel_11);
		
		JButton btnNewButton_4 = new JButton("Update");
		btnNewButton_4.setBounds(189, 142, 89, 23);
		panel_3.add(btnNewButton_4);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Register", null, tabbedPane_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_3.addTab("Student Register", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 11, 400, 198);
		panel_4.add(textPane_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_3.addTab("Course Register", null, panel_5, null);
		panel_5.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(21, 11, 400, 198);
		panel_5.add(textPane_2);
	}
}
