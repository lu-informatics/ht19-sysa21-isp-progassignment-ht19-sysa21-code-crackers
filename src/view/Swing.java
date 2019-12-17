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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;

public class Swing {

	private JFrame frame;
	private JTextField txtTheStudentWill;

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
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
		tabbedPane_2.addTab("Remove Student", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Update Student", null, panel_7, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Course", null, tabbedPane_1, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Add Course", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Remove Course", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Update Course", null, panel_3, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Register", null, tabbedPane_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_3.addTab("Student Register", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_3.addTab("Course Register", null, panel_5, null);
	}
}
