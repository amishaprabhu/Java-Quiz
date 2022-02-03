package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

public class Medical1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medical1 frame = new Medical1();
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
	int score1;
	public Medical1(int s)
	{
		
		this();
		score1=s;
		
	}
	
		public Medical1() {
	
		
		setTitle("Quiz continued");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1333, 776);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea txtrHighBlood = new JTextArea();
		txtrHighBlood.setForeground(new Color(0, 0, 0));
		txtrHighBlood.setText("                        4.   Matters related to what sense are referred to as olfactory?");
		txtrHighBlood.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrHighBlood.setBackground(new Color(199, 21, 133));
		txtrHighBlood.setBounds(10, 10, 1278, 42);
		contentPane.add(txtrHighBlood);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("     Taste");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(199, 21, 133));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(174, 82, 166, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHeartAttack = new JRadioButton("     Vision");
		buttonGroup.add(rdbtnHeartAttack);
		rdbtnHeartAttack.setForeground(Color.BLACK);
		rdbtnHeartAttack.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHeartAttack.setBackground(new Color(199, 21, 133));
		rdbtnHeartAttack.setBounds(174, 134, 166, 33);
		contentPane.add(rdbtnHeartAttack);
		
		JRadioButton rdbtnHypertension = new JRadioButton("    Sound");
		buttonGroup.add(rdbtnHypertension);
		rdbtnHypertension.setForeground(Color.BLACK);
		rdbtnHypertension.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHypertension.setBackground(new Color(199, 21, 133));
		rdbtnHypertension.setBounds(880, 82, 175, 33);
		contentPane.add(rdbtnHypertension);
		
		JRadioButton rdbtnRabies = new JRadioButton("    Smell");
		rdbtnRabies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1++;
			}
		});
		buttonGroup.add(rdbtnRabies);
		rdbtnRabies.setForeground(Color.BLACK);
		rdbtnRabies.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnRabies.setBackground(new Color(199, 21, 133));
		rdbtnRabies.setBounds(880, 134, 175, 33);
		contentPane.add(rdbtnRabies);
		
		JTextArea txtrwhatIsAnother = new JTextArea();
		txtrwhatIsAnother.setText("                        5.   Which blood type is known as the \"universal recipient?");
		txtrwhatIsAnother.setForeground(Color.BLACK);
		txtrwhatIsAnother.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhatIsAnother.setBackground(new Color(199, 21, 133));
		txtrwhatIsAnother.setBounds(10, 207, 1278, 42);
		contentPane.add(txtrwhatIsAnother);
		
		JRadioButton rdbtnChickenPox = new JRadioButton("        AB");
		rdbtnChickenPox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1++;
			}
		});
		buttonGroup_1.add(rdbtnChickenPox);
		rdbtnChickenPox.setForeground(Color.BLACK);
		rdbtnChickenPox.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChickenPox.setBackground(new Color(199, 21, 133));
		rdbtnChickenPox.setBounds(174, 280, 166, 33);
		contentPane.add(rdbtnChickenPox);
		
		JRadioButton rdbtnDengue = new JRadioButton("       AB-");
		buttonGroup_1.add(rdbtnDengue);
		rdbtnDengue.setForeground(Color.BLACK);
		rdbtnDengue.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDengue.setBackground(new Color(199, 21, 133));
		rdbtnDengue.setBounds(174, 342, 166, 33);
		contentPane.add(rdbtnDengue);
		
		JRadioButton rdbtnMalaria = new JRadioButton("         O+");
		buttonGroup_1.add(rdbtnMalaria);
		rdbtnMalaria.setForeground(Color.BLACK);
		rdbtnMalaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMalaria.setBackground(new Color(199, 21, 133));
		rdbtnMalaria.setBounds(889, 280, 166, 33);
		contentPane.add(rdbtnMalaria);
		
		JRadioButton rdbtnFlu = new JRadioButton("      O-");
		buttonGroup_1.add(rdbtnFlu);
		rdbtnFlu.setForeground(Color.BLACK);
		rdbtnFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFlu.setBackground(new Color(199, 21, 133));
		rdbtnFlu.setBounds(889, 342, 166, 33);
		contentPane.add(rdbtnFlu);
		
		
		
		JButton btnNewButton = new JButton("<- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Medical1 m1=new Medical1();
				Medical m=new Medical();
				m1.setVisible(false);
				m.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(138, 487, 175, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("  Submit");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showConfirmDialog(null, "Are you sure you want to submit");
				Score s=new Score(score1);
				s.setVisible(true);
			}
		});
		btnNext.setForeground(Color.RED);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNext.setBackground(Color.ORANGE);
		btnNext.setBounds(880, 487, 187, 48);
		contentPane.add(btnNext);
	}

}
