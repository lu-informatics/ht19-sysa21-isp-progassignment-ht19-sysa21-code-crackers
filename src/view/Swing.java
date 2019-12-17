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
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Students", null, tabbedPane_2, null);
		
		JPanel panel = new JPanel();
		tabbedPane_2.addTab("New tab", null, panel, null);
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
	}
}
