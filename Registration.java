package quiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frmRegistration;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frmRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistration = new JFrame();
		frmRegistration.getContentPane().setBackground(new Color(46, 139, 87));
		frmRegistration.setTitle("Registration");
		frmRegistration.setBounds(100, 100, 1282, 722);
		frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistration.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    Stuck up in selecting a career? do try our quiz once");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(26, 33, 1205, 82);
		frmRegistration.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("  Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Login l=new Login();
				l.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 34));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(754, 308, 226, 75);
		frmRegistration.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(" First time visiting our page? do register here");
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(680, 486, 578, 40);
		frmRegistration.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Register here");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Register r=new Register();
				r.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(777, 549, 220, 67);
		frmRegistration.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\register.jpg"));
		lblNewLabel_2.setBackground(new Color(255, 255, 240));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(10, 150, 663, 496);
		frmRegistration.getContentPane().add(lblNewLabel_2);
	}
}
