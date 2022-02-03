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
import javax.swing.border.LineBorder;

public class Arts extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arts frame = new Arts();
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
	int score;
	public Arts() {
		setTitle("Arts quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 753);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea txtrHighBlood = new JTextArea();
		txtrHighBlood.setForeground(new Color(0, 0, 0));
		txtrHighBlood.setText("            1.  The famous painter Vincent van Gogh belonged to which country?");
		txtrHighBlood.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrHighBlood.setBackground(new Color(199, 21, 133));
		txtrHighBlood.setBounds(10, 10, 1278, 42);
		contentPane.add(txtrHighBlood);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("     Spain");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(199, 21, 133));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(174, 82, 166, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHeartAttack = new JRadioButton("     Italy ");
		rdbtnHeartAttack.setForeground(Color.BLACK);
		rdbtnHeartAttack.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHeartAttack.setBackground(new Color(199, 21, 133));
		rdbtnHeartAttack.setBounds(174, 134, 166, 33);
		contentPane.add(rdbtnHeartAttack);
		
		JRadioButton rdbtnHypertension = new JRadioButton("  Netherland");
		rdbtnHypertension.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		rdbtnHypertension.setForeground(Color.BLACK);
		rdbtnHypertension.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHypertension.setBackground(new Color(199, 21, 133));
		rdbtnHypertension.setBounds(880, 82, 175, 33);
		contentPane.add(rdbtnHypertension);
		
		JRadioButton rdbtnRabies = new JRadioButton("     France");
		rdbtnRabies.setForeground(Color.BLACK);
		rdbtnRabies.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnRabies.setBackground(new Color(199, 21, 133));
		rdbtnRabies.setBounds(880, 134, 175, 33);
		contentPane.add(rdbtnRabies);
		
		JTextArea txtrwhatIsAnother = new JTextArea();
		txtrwhatIsAnother.setText("   2. \"Madhubani\" a style of folk paintings, is popular in which of the following states in India?");
		txtrwhatIsAnother.setForeground(Color.BLACK);
		txtrwhatIsAnother.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhatIsAnother.setBackground(new Color(199, 21, 133));
		txtrwhatIsAnother.setBounds(10, 207, 1278, 42);
		contentPane.add(txtrwhatIsAnother);
		
		JRadioButton rdbtnChickenPox = new JRadioButton("       Bihar");
		rdbtnChickenPox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		rdbtnChickenPox.setForeground(Color.BLACK);
		rdbtnChickenPox.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChickenPox.setBackground(new Color(199, 21, 133));
		rdbtnChickenPox.setBounds(174, 280, 200, 33);
		contentPane.add(rdbtnChickenPox);
		
		JRadioButton rdbtnDengue = new JRadioButton("   West Bengal");
		rdbtnDengue.setForeground(Color.BLACK);
		rdbtnDengue.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDengue.setBackground(new Color(199, 21, 133));
		rdbtnDengue.setBounds(174, 342, 200, 33);
		contentPane.add(rdbtnDengue);
		
		JRadioButton rdbtnMalaria = new JRadioButton("  Madhya Pradesh");
		rdbtnMalaria.setForeground(Color.BLACK);
		rdbtnMalaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMalaria.setBackground(new Color(199, 21, 133));
		rdbtnMalaria.setBounds(889, 280, 226, 33);
		contentPane.add(rdbtnMalaria);
		
		JRadioButton rdbtnFlu = new JRadioButton("     Rajasthan");
		rdbtnFlu.setForeground(Color.BLACK);
		rdbtnFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFlu.setBackground(new Color(199, 21, 133));
		rdbtnFlu.setBounds(889, 342, 226, 33);
		contentPane.add(rdbtnFlu);
		
		JTextArea txtrwhichMedicalTerm = new JTextArea();
		txtrwhichMedicalTerm.setText("                                                  3.   Raghu Rai is a well-known ?\r\n");
		txtrwhichMedicalTerm.setForeground(Color.BLACK);
		txtrwhichMedicalTerm.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhichMedicalTerm.setBackground(new Color(199, 21, 133));
		txtrwhichMedicalTerm.setBounds(10, 413, 1278, 42);
		contentPane.add(txtrwhichMedicalTerm);
		
		JRadioButton rdbtnDialysis = new JRadioButton("     Painter");
		rdbtnDialysis.setForeground(Color.BLACK);
		rdbtnDialysis.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDialysis.setBackground(new Color(199, 21, 133));
		rdbtnDialysis.setBounds(174, 481, 182, 33);
		contentPane.add(rdbtnDialysis);
		
		JRadioButton rdbtnEmesis = new JRadioButton("  Photographer");
		rdbtnEmesis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		rdbtnEmesis.setForeground(Color.BLACK);
		rdbtnEmesis.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnEmesis.setBackground(new Color(199, 21, 133));
		rdbtnEmesis.setBounds(174, 538, 182, 33);
		contentPane.add(rdbtnEmesis);
		
		JRadioButton rdbtnPneumonia = new JRadioButton("  Film director");
		rdbtnPneumonia.setForeground(Color.BLACK);
		rdbtnPneumonia.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnPneumonia.setBackground(new Color(199, 21, 133));
		rdbtnPneumonia.setBounds(889, 481, 175, 33);
		contentPane.add(rdbtnPneumonia);
		
		JRadioButton rdbtnSwineFlu = new JRadioButton("  Sportsmen");
		rdbtnSwineFlu.setForeground(Color.BLACK);
		rdbtnSwineFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSwineFlu.setBackground(new Color(199, 21, 133));
		rdbtnSwineFlu.setBounds(889, 538, 175, 33);
		contentPane.add(rdbtnSwineFlu);
		
		JButton btnNewButton = new JButton("<- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "Are you sure you want to end up the quiz");
				Arts a=new Arts();
				a.setVisible(false);
				Category c=new Category();
	  			c.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(153, 639, 166, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Arts1 a1=new Arts1(score);
				a1.setVisible(true);
			}
		});
		btnNext.setForeground(Color.RED);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNext.setBackground(Color.ORANGE);
		btnNext.setBounds(889, 639, 166, 48);
		contentPane.add(btnNext);
	}

}
