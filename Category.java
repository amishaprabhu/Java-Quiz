package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Category extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Category frame = new Category();
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
	int r=0;
	public Category() {
		setTitle("Category");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1285, 757);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Please select category in which you want to give quiz ");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(79, 25, 1064, 75);
		contentPane.add(lblNewLabel);
		
		
		JButton btnNewButton_1 = new JButton("Commerce");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
		
					r=1;
				
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(115, 207, 227, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnEngineering = new JButton("Engineering");
		btnEngineering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					r=3;
				
			}
		});
		btnEngineering.setForeground(Color.RED);
		btnEngineering.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEngineering.setBackground(Color.ORANGE);
		btnEngineering.setBounds(115, 348, 227, 75);
		contentPane.add(btnEngineering);
		
		JButton btnArts = new JButton("Arts");
		btnArts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					r=2;
				
			}
		});
		btnArts.setForeground(Color.RED);
		btnArts.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnArts.setBackground(Color.ORANGE);
		btnArts.setBounds(709, 207, 227, 75);
		contentPane.add(btnArts);
		
		JButton btnMedical = new JButton("Medical");
		btnMedical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
	
					r=4;
				
			}
		});
		btnMedical.setForeground(Color.RED);
		btnMedical.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMedical.setBackground(Color.ORANGE);
		btnMedical.setBounds(709, 348, 227, 75);
		contentPane.add(btnMedical);
		
		JButton btnNewButton = new JButton("Start Quiz ->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(r==1)
				{
					Commerce c=new Commerce();
					c.setVisible(true);
				}
				if(r==3)
				{
					Engineering e1=new Engineering();
					e1.setVisible(true);
				}
				if(r==2)
				{
					Arts a=new Arts();
					a.setVisible(true);
				}
				if(r==4)
				{
					Medical m=new Medical();
					m.setVisible(true);
				}
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(725, 565, 263, 51);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("<- Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Category c=new Category();
				c.setVisible(false);
				Login l=new Login();
				l.setVisible(true);
			}
		});
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnBack.setBackground(Color.ORANGE);
		btnBack.setBounds(194, 565, 227, 51);
		contentPane.add(btnBack);
		
		
	}
}
