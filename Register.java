package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1278, 755);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        Register here");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(369, 36, 405, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("    Name        :");
		lblNewLabel_2.setBackground(Color.ORANGE);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(153, 146, 214, 42);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(676, 147, 408, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("    Phone no  :");
		lblPhoneNo.setBackground(Color.ORANGE);
		lblPhoneNo.setOpaque(true);
		lblPhoneNo.setForeground(Color.RED);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPhoneNo.setBounds(153, 213, 214, 43);
		contentPane.add(lblPhoneNo);
		
		JLabel lblEmailid = new JLabel("    Emailid    :");
		lblEmailid.setBackground(Color.ORANGE);
		lblEmailid.setOpaque(true);
		lblEmailid.setForeground(Color.RED);
		lblEmailid.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEmailid.setBounds(153, 283, 224, 41);
		contentPane.add(lblEmailid);
		
		JLabel lblUsername = new JLabel("    Username :");
		lblUsername.setOpaque(true);
		lblUsername.setBackground(Color.ORANGE);
		lblUsername.setForeground(Color.RED);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsername.setBounds(153, 352, 214, 41);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("    Password  :");
		lblPassword.setOpaque(true);
		lblPassword.setBackground(Color.ORANGE);
		lblPassword.setForeground(Color.RED);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPassword.setBounds(153, 418, 214, 42);
		contentPane.add(lblPassword);
		
		JLabel lblGrade = new JLabel("    Grade       :");
		lblGrade.setOpaque(true);
		lblGrade.setBackground(Color.ORANGE);
		lblGrade.setForeground(Color.RED);
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGrade.setBounds(153, 491, 224, 41);
		contentPane.add(lblGrade);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(676, 216, 408, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(676, 285, 408, 41);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(676, 354, 408, 41);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(676, 493, 420, 41);
		contentPane.add(textField_4);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(676, 421, 408, 42);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton(" <- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Register r1=new Register();
				r1.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(198, 583, 179, 41);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String query="insert into student(name,phoneno,emailid,username,password,grade)values(?,?,?,?,?,? )";
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz?useSSL=false&allowPublicKeyRetrieval=true","root" ,"Gayatri17#" );
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setLong(2, Long.parseLong(textField_1.getText()));
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, passwordField.getText());
					pst.setLong(6, Long.parseLong(textField_4.getText()));
					pst.executeUpdate(); 
					JOptionPane.showMessageDialog(null, "Your account is created successfully please login and go ahead");
					pst.close();
					Login l1=new Login();
					l1.setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnRegister.setForeground(Color.RED);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnRegister.setBackground(Color.ORANGE);
		btnRegister.setBounds(744, 583, 168, 41);
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(199, 21, 133));
		lblNewLabel_1.setBounds(70, 122, 1142, 570);
		contentPane.add(lblNewLabel_1);
	}
}
