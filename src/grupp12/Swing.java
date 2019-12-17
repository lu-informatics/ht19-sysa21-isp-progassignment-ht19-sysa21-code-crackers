package grupp12;
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

public class Swing {

	private JFrame frame;
	private JTextField txtHereYouCan;
	private JTextField txtContosoUniversity;

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
		frame.setBounds(100, 100, 845, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 850, 598);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Home", null, panel_3, null);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		txtContosoUniversity = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, txtContosoUniversity, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, txtContosoUniversity, 10, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, txtContosoUniversity, 118, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, txtContosoUniversity, 196, SpringLayout.WEST, panel_3);
		txtContosoUniversity.setBackground(Color.WHITE);
		txtContosoUniversity.setForeground(Color.GRAY);
		txtContosoUniversity.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtContosoUniversity.setText("Contoso University");
		panel_3.add(txtContosoUniversity);
		txtContosoUniversity.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Student", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtHereYouCan = new JTextField();
		txtHereYouCan.setForeground(Color.BLACK);
		txtHereYouCan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtHereYouCan.setText("Here you can add, rename and remove a student from the Universiety ");
		panel.add(txtHereYouCan, BorderLayout.NORTH);
		txtHereYouCan.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Course", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Register", null, panel_2, null);
	}
}
