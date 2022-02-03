package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try
				{
					Login frame = new Login();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1305, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  
		  JPanel panel = new JPanel();
		  panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		  panel.setBackground(new Color(46, 139, 87));
		  panel.setBounds(0, 0, 1261, 702);
		  contentPane.add(panel);
		     panel.setLayout(null);
		  
		     JLabel  lblNewLabel_4 = new JLabel("");
		     lblNewLabel_4.setBackground(new Color(199, 21, 133));
		     lblNewLabel_4.setOpaque(true);
		     lblNewLabel_4.setBounds(10, 56, 410, 481);
		     lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\finalquiz.jpg"));
		  panel.add(lblNewLabel_4);
		  
		  JButton btnNewButton_2 = new JButton("<-  Back");
		  btnNewButton_2.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e)
		  	{
		  		Login l=new Login();
		  		l.setVisible(false);
		  		Register r=new Register();
		  		r.setVisible(true);
		  	}
		  });
		  btnNewButton_2.setForeground(new Color(255, 0, 0));
		  btnNewButton_2.setBackground(new Color(255, 204, 51));
		  btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		  btnNewButton_2.setBounds(60, 571, 181, 49);
		  panel.add(btnNewButton_2);
		  
		  
		  
		  JTextField textField = new JTextField();
		  textField.setBackground(new Color(255, 222, 173));
		  textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		  textField.setBounds(803, 169, 320, 54);
		  panel.add(textField);
		  textField.setColumns(10);
		  
		  JButton btnNewButton_1 = new JButton("Login");
		  btnNewButton_1.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) 
		  	{
		  		try
		  		{
		  			Class.forName("com.mysql.jdbc.Driver");
		  			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz?useSSL=false&allowPublicKeyRetrieval=true","root","Gayatri17#");
		  			Statement st=conn.createStatement();
		  			String query="select *from student where username='"+textField.getText()+"'and password='"+passwordField.getText()+"'";
		  			ResultSet rs=st.executeQuery(query);
		  			if(rs.next())
		  			{
		  				JOptionPane.showMessageDialog(null,"Login successfull");
		  				Category c=new Category();
			  			c.setVisible(true);
		  			}
		  			else
		  			{
		  				JOptionPane.showMessageDialog(null,"OOPS!!  Please enter valid username or password");
		  			}
		  			st.close();
		  			conn.close();
		  		}
		  		catch(Exception e1)
		  		{
		  			JOptionPane.showMessageDialog(null, e1);
		  			
		  		}
		  	}
		  });
		  btnNewButton_1.setBackground(Color.ORANGE);
		  btnNewButton_1.setForeground(Color.RED);
		  btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		  btnNewButton_1.setBounds(915, 500, 162, 54);
		  panel.add(btnNewButton_1);
		  
		  JButton btnNewButton = new JButton("Register");
		  btnNewButton.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) 
		  	{
		  		Register r=new Register();
		  		r.setVisible(true);
		  	}
		  });
		  btnNewButton.setBackground(Color.ORANGE);
		  btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		  btnNewButton.setForeground(Color.RED);
		  btnNewButton.setBounds(532, 500, 181, 54);
		  panel.add(btnNewButton);
		  
		  JLabel lblNewLabel_1 = new JLabel("  UserName:");
		  lblNewLabel_1.setForeground(Color.RED);
		  lblNewLabel_1.setBackground(Color.ORANGE);
		  lblNewLabel_1.setOpaque(true);
		  lblNewLabel_1.setBounds(489, 166, 208, 54);
		  panel.add(lblNewLabel_1);
		  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		  
		  JLabel lblNewLabel_2 = new JLabel("  Password :");
		  lblNewLabel_2.setOpaque(true);
		  lblNewLabel_2.setBackground(Color.ORANGE);
		  lblNewLabel_2.setForeground(new Color(255, 0, 0));
		  lblNewLabel_2.setBounds(489, 325, 208, 49);
		  panel.add(lblNewLabel_2);
		  lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		  
		  JLabel lblNewLabel = new JLabel("      Login Here");
		  lblNewLabel.setBackground(Color.ORANGE);
		  lblNewLabel.setOpaque(true);
		  lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		  lblNewLabel.setForeground(Color.RED);
		  lblNewLabel.setBounds(532, 10, 320, 54);
		  panel.add(lblNewLabel);
		  
		  passwordField = new JPasswordField();
		  passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		  passwordField.setBackground(new Color(255, 218, 185));
		  passwordField.setBounds(803, 325, 320, 49);
		  panel.add(passwordField);
		  
		  JLabel lblNewLabel_5 = new JLabel("");
		  lblNewLabel_5.setBackground(new Color(199, 21, 133));
		  lblNewLabel_5.setOpaque(true);
		  lblNewLabel_5.setBounds(430, 118, 777, 519);
		  panel.add(lblNewLabel_5);
		  
		  JLabel lblNewLabel_3 = new JLabel("Don't have account? Register now !");
		  lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		  lblNewLabel_3.setForeground(new Color(0, 0, 0));
		  lblNewLabel_3.setBackground(SystemColor.controlLtHighlight);
		  lblNewLabel_3.setBounds(261, 251, 252, 24);
		  contentPane.add(lblNewLabel_3);
	}
}
