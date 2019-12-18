package view;

import javax.swing.ButtonGroup;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

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
import java.awt.Choice;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.border.BevelBorder;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.swing.JFormattedTextField.AbstractFormatter;
import com.toedter.calendar.JDateChooser;

import java.util.Date;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.JList;

public class Swing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_10;

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
		frame.setBackground(SystemColor.controlLtHighlight);

		frame.getContentPane().setLayout(null);

		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.controlLtHighlight);
		tabbedPane.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		tabbedPane.setForeground(Color.DARK_GRAY);
		frame.getContentPane().add(tabbedPane);

		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 16));
		tabbedPane.addTab("Contoso University", null, tabbedPane_4, null);

		// JLabel lblNewLabel_18 = new JLabel(""); //Lägga in bild på contosouniversity
		// Image img = new ImageIcon
		// (this.getClass().getResource("/school.jpg")).getImage();

		// lblNewLabel_18.setBounds(10, 22, 432, 273);
		// panel_9.add(lblNewLabel_18);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tabbedPane_2.setBackground(SystemColor.controlLtHighlight);
		tabbedPane.addTab("Students", null, tabbedPane_2, null);

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_2.addTab("Add Student", null, panel, null);
		panel.setLayout(null);

		JLabel lblEnterStudentsName = new JLabel("Enter Students name:");
		lblEnterStudentsName.setForeground(SystemColor.controlText);
		lblEnterStudentsName.setBackground(SystemColor.controlText);
		lblEnterStudentsName.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblEnterStudentsName.setBounds(19, 66, 176, 29);
		panel.add(lblEnterStudentsName);

		JTextPane textPane = new JTextPane();
		textPane.setSelectionColor(SystemColor.controlLtHighlight);
		textPane.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
		textPane.setBounds(219, 54, 117, 29);
		panel.add(textPane);

		JLabel lblNewLabel_19 = new JLabel("The student will get this student ID:");
		lblNewLabel_19.setBounds(58, 152, 176, 14);
		panel.add(lblNewLabel_19);

		JButton btnNewButton_6 = new JButton("Add Student");
		btnNewButton_6.setBounds(408, 70, 89, 23);
		panel.add(btnNewButton_6);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.controlLtHighlight);
		panel_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 14));
		tabbedPane_2.addTab("Update Student", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblEnterTheStudent = new JLabel("Choose student to update");
		lblEnterTheStudent.setBounds(26, 71, 176, 24);
		panel_6.add(lblEnterTheStudent);

		JButton btnFind = new JButton("Find");
		btnFind.setForeground(new Color(0, 0, 0));
		btnFind.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnFind.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		btnFind.setBackground(SystemColor.controlLtHighlight);
		btnFind.setBounds(363, 102, 55, 23);
		panel_6.add(btnFind);

		JLabel lblEnterTheNew = new JLabel("Enter the new name:");
		lblEnterTheNew.setBounds(26, 171, 170, 14);
		panel_6.add(lblEnterTheNew);

		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		textField.setSelectionColor(SystemColor.activeCaption);
		textField.setBounds(225, 169, 96, 20);
		panel_6.add(textField);
		textField.setColumns(10);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(SystemColor.controlLtHighlight);
		btnUpdate.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnUpdate.setBounds(224, 205, 89, 23);
		panel_6.add(btnUpdate);

		JLabel lblResponse = new JLabel("Response:");
		lblResponse.setBounds(44, 263, 68, 14);
		panel_6.add(lblResponse);

		Choice choice_1 = new Choice();
		choice_1.setBounds(304, 69, 114, 26);
		panel_6.add(choice_1);
		
		JLabel label_2 = new JLabel("Response:");
		label_2.setBounds(44, 126, 68, 14);
		panel_6.add(label_2);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		tabbedPane_2.addTab("Remove Student", null, panel_7, null);
		panel_7.setLayout(null);

		JLabel label = new JLabel("");
		label.setBounds(52, 51, 48, 14);
		panel_7.add(label);

		JLabel lblNewLabel = new JLabel("Select the student to remove:");
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel.setBounds(23, 51, 203, 28);
		panel_7.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Response:");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 10));
		lblNewLabel_1.setBounds(23, 101, 78, 14);
		panel_7.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Do you want to remove this student?");
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		lblNewLabel_2.setBounds(23, 162, 228, 14);
		panel_7.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setBorder(new LineBorder(SystemColor.window, 1, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setBounds(245, 159, 78, 23);
		panel_7.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Find");
		btnNewButton_1.setBackground(SystemColor.controlLtHighlight);
		btnNewButton_1.setBorder(new LineBorder(SystemColor.controlText, 1, true));
		btnNewButton_1.setBounds(426, 55, 89, 23);
		panel_7.add(btnNewButton_1);

		Choice choice_2 = new Choice();
		choice_2.setBounds(307, 59, 109, 20);
		panel_7.add(choice_2);

		Button button_1 = new Button("No");
		button_1.setBounds(346, 162, 70, 22);
		panel_7.add(button_1);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
		tabbedPane.addTab("Course", null, tabbedPane_1, null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlLtHighlight);
		tabbedPane_1.addTab("Add Course", null, panel_1, null);
		panel_1.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("7,5 points");
		rdbtnNewRadioButton.setBackground(SystemColor.controlLtHighlight);
		rdbtnNewRadioButton.setBounds(212, 112, 109, 23);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("15 points");
		rdbtnNewRadioButton_1.setBackground(SystemColor.controlLtHighlight);
		rdbtnNewRadioButton_1.setBounds(212, 138, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("30 points");
		rdbtnNewRadioButton_2.setBackground(SystemColor.controlLtHighlight);
		rdbtnNewRadioButton_2.setBounds(212, 161, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_3 = new JLabel("Enter the course name:");
		lblNewLabel_3.setBounds(20, 14, 160, 14);
		panel_1.add(lblNewLabel_3);

		JButton btnNewButton_2 = new JButton("Add Course");
		btnNewButton_2.setBounds(214, 203, 89, 23);
		panel_1.add(btnNewButton_2);

		JLabel lblNewLabel_4 = new JLabel("Enter the course code:");
		lblNewLabel_4.setBounds(20, 54, 149, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Select amount of points:");
		lblNewLabel_5.setBounds(59, 116, 131, 14);
		panel_1.add(lblNewLabel_5);

		textField_2 = new JTextField();
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBounds(190, 12, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBounds(190, 52, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Remove Course", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Enter the course you want to remove:");
		lblNewLabel_6.setBounds(0, 45, 240, 14);
		panel_2.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(250, 42, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Response:");
		lblNewLabel_7.setBounds(33, 81, 77, 14);
		panel_2.add(lblNewLabel_7);

		JButton btnNewButton_3 = new JButton("Yes");
		btnNewButton_3.setBounds(250, 119, 86, 23);
		panel_2.add(btnNewButton_3);

		JLabel lblNewLabel_8 = new JLabel("Do you want to remove this course?");
		lblNewLabel_8.setBounds(32, 123, 191, 14);
		panel_2.add(lblNewLabel_8);
		
		JButton button_3 = new JButton("No");
		button_3.setBounds(346, 119, 86, 23);
		panel_2.add(button_3);

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

		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Add Exam", null, panel_8, null);
		panel_8.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("Enter the date");
		lblNewLabel_13.setBounds(10, 83, 99, 14);

		JLabel lblNewLabel_14 = new JLabel("Choose the location");
		lblNewLabel_14.setBounds(10, 110, 111, 14);
		panel_8.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("The exam will have 100 points");
		lblNewLabel_15.setBounds(10, 224, 144, 14);
		panel_8.add(lblNewLabel_15);

		textField_10 = new JTextField();
		textField_10.setBounds(175, 221, 86, 20);
		panel_8.add(textField_10);
		textField_10.setColumns(10);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Room A123");
		rdbtnNewRadioButton_3.setBounds(152, 106, 109, 23);
		panel_8.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Room A167");
		rdbtnNewRadioButton_4.setBounds(152, 132, 109, 23);
		panel_8.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Room B198");
		rdbtnNewRadioButton_5.setBounds(152, 158, 109, 23);
		panel_8.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Room B067");
		rdbtnNewRadioButton_6.setBounds(152, 184, 109, 23);
		panel_8.add(rdbtnNewRadioButton_6);

		JButton btnNewButton_5 = new JButton("Add Exam");
		btnNewButton_5.setBounds(142, 266, 96, 23);
		panel_8.add(btnNewButton_5);

		JLabel lblNewLabel_17 = new JLabel("Add exam to course:");
		lblNewLabel_17.setBounds(10, 27, 111, 14);

		JLabel lblNewLabel_18 = new JLabel("Choose what exam to add to the course:");
		lblNewLabel_18.setBounds(10, 27, 46, 14);

		panel_8.add(lblNewLabel_17);

		Choice choice = new Choice();
		choice.setBounds(142, 23, 96, 20);
		panel_8.add(choice);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(112, 63, 126, 20);
		panel_8.add(dateChooser);

		JLabel lblNewLabel_16 = new JLabel("Choose Date:");
		lblNewLabel_16.setBounds(10, 63, 86, 14);
		panel_8.add(lblNewLabel_16);

		Label label_1 = new Label("Response:");
		label_1.setBounds(21, 308, 62, 22);
		panel_8.add(label_1);

		Panel panel_10 = new Panel();
		tabbedPane_1.addTab("Remove Exam", null, panel_10, null);
		panel_10.setLayout(null);

		JLabel lblNewLabel_21 = new JLabel("Select exam:");
		lblNewLabel_21.setBounds(51, 61, 94, 14);
		panel_10.add(lblNewLabel_21);

		Choice choice_5 = new Choice();
		choice_5.setBounds(162, 55, 166, 23);
		panel_10.add(choice_5);

		Button button_2 = new Button("Remove");
		button_2.setBounds(162, 118, 70, 22);
		panel_10.add(button_2);

		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Results", null, panel_9, null);
		panel_9.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("Select student:");
		lblNewLabel_12.setBounds(44, 41, 104, 14);
		panel_9.add(lblNewLabel_12);

		JLabel lblNewLabel_20 = new JLabel("Select exam:");
		lblNewLabel_20.setBounds(44, 116, 87, 14);
		panel_9.add(lblNewLabel_20);

		JLabel lblNewLabel_22 = new JLabel("Enter amount of points:");
		lblNewLabel_22.setBounds(44, 193, 114, 14);
		panel_9.add(lblNewLabel_22);

		Choice choice_3 = new Choice();
		choice_3.setBounds(209, 35, 104, 20);
		panel_9.add(choice_3);

		Choice choice_4 = new Choice();
		choice_4.setBounds(211, 110, 102, 20);
		panel_9.add(choice_4);

		TextField textField_7 = new TextField();
		textField_7.setBounds(209, 193, 104, 22);
		panel_9.add(textField_7);

		Button button = new Button("Add result");
		button.setBounds(230, 267, 70, 22);
		panel_9.add(button);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 12));
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
