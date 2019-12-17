package grupp12;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing {

	private JFrame frame;
	private JTextField txtContosoUniversety;

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
		
		txtContosoUniversety = new JTextField();
		txtContosoUniversety.setText("Contoso Universety");
		txtContosoUniversety.setBounds(49, 48, 203, 59);
		frame.getContentPane().add(txtContosoUniversety);
		txtContosoUniversety.setColumns(10);
	}
}
