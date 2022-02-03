package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

public class Engineering extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Engineering frame = new Engineering();
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
	public Engineering() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1305, 738);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JTextArea txtrHighBlood = new JTextArea();
		txtrHighBlood.setForeground(new Color(0, 0, 0));
		txtrHighBlood.setText("                                            1. The ratio of pure gold in 18-carat gold is:");
		txtrHighBlood.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrHighBlood.setBackground(new Color(199, 21, 133));
		txtrHighBlood.setBounds(10, 10, 1278, 42);
		contentPane.add(txtrHighBlood);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("   60%");
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(199, 21, 133));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(174, 82, 166, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHeartAttack = new JRadioButton("    80%");
		buttonGroup.add(rdbtnHeartAttack);
		buttonGroup.add(rdbtnHeartAttack);
		rdbtnHeartAttack.setForeground(Color.BLACK);
		rdbtnHeartAttack.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHeartAttack.setBackground(new Color(199, 21, 133));
		rdbtnHeartAttack.setBounds(174, 134, 166, 33);
		contentPane.add(rdbtnHeartAttack);
		
		JRadioButton rdbtnHypertension = new JRadioButton("    75%");
		rdbtnHypertension.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		buttonGroup.add(rdbtnHypertension);
		buttonGroup.add(rdbtnHypertension);
		rdbtnHypertension.setForeground(Color.BLACK);
		rdbtnHypertension.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHypertension.setBackground(new Color(199, 21, 133));
		rdbtnHypertension.setBounds(880, 82, 175, 33);
		contentPane.add(rdbtnHypertension);
		
		JRadioButton rdbtnRabies = new JRadioButton("    90%");
		buttonGroup.add(rdbtnRabies);
		buttonGroup.add(rdbtnRabies);
		rdbtnRabies.setForeground(Color.BLACK);
		rdbtnRabies.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnRabies.setBackground(new Color(199, 21, 133));
		rdbtnRabies.setBounds(880, 134, 175, 33);
		contentPane.add(rdbtnRabies);
		
		JTextArea txtrwhatIsAnother = new JTextArea();
		txtrwhatIsAnother.setText("                            2. The colour of the eye depends upon the pigment present inside?");
		txtrwhatIsAnother.setForeground(Color.BLACK);
		txtrwhatIsAnother.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhatIsAnother.setBackground(new Color(199, 21, 133));
		txtrwhatIsAnother.setBounds(10, 207, 1278, 42);
		contentPane.add(txtrwhatIsAnother);
		
		JRadioButton rdbtnChickenPox = new JRadioButton("    Cornea");
		buttonGroup_1.add(rdbtnChickenPox);
		buttonGroup_1.add(rdbtnChickenPox);
		rdbtnChickenPox.setForeground(Color.BLACK);
		rdbtnChickenPox.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChickenPox.setBackground(new Color(199, 21, 133));
		rdbtnChickenPox.setBounds(174, 280, 166, 33);
		contentPane.add(rdbtnChickenPox);
		
		JRadioButton rdbtnDengue = new JRadioButton("    Rods");
		buttonGroup_1.add(rdbtnDengue);
		buttonGroup_1.add(rdbtnDengue);
		rdbtnDengue.setForeground(Color.BLACK);
		rdbtnDengue.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDengue.setBackground(new Color(199, 21, 133));
		rdbtnDengue.setBounds(174, 342, 166, 33);
		contentPane.add(rdbtnDengue);
		
		JRadioButton rdbtnMalaria = new JRadioButton("     Iris");
		rdbtnMalaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		buttonGroup_1.add(rdbtnMalaria);
		buttonGroup_1.add(rdbtnMalaria);
		rdbtnMalaria.setForeground(Color.BLACK);
		rdbtnMalaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMalaria.setBackground(new Color(199, 21, 133));
		rdbtnMalaria.setBounds(889, 280, 166, 33);
		contentPane.add(rdbtnMalaria);
		
		JRadioButton rdbtnFlu = new JRadioButton("     Cones");
		buttonGroup_1.add(rdbtnFlu);
		buttonGroup_1.add(rdbtnFlu);
		rdbtnFlu.setForeground(Color.BLACK);
		rdbtnFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFlu.setBackground(new Color(199, 21, 133));
		rdbtnFlu.setBounds(889, 342, 166, 33);
		contentPane.add(rdbtnFlu);
		
		JTextArea txtrwhichMedicalTerm = new JTextArea();
		txtrwhichMedicalTerm.setText("       3. Which among the following waves is used for communication by artificial satellites?");
		txtrwhichMedicalTerm.setForeground(Color.BLACK);
		txtrwhichMedicalTerm.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhichMedicalTerm.setBackground(new Color(199, 21, 133));
		txtrwhichMedicalTerm.setBounds(10, 413, 1278, 42);
		contentPane.add(txtrwhichMedicalTerm);
		
		JRadioButton rdbtnDialysis = new JRadioButton("  The frequency of 101 series  ");
		buttonGroup_2.add(rdbtnDialysis);
		buttonGroup_2.add(rdbtnDialysis);
		rdbtnDialysis.setForeground(Color.BLACK);
		rdbtnDialysis.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDialysis.setBackground(new Color(199, 21, 133));
		rdbtnDialysis.setBounds(108, 481, 327, 33);
		contentPane.add(rdbtnDialysis);
		
		JRadioButton rdbtnEmesis = new JRadioButton("         A.M  Waves");
		buttonGroup_2.add(rdbtnEmesis);
		buttonGroup_2.add(rdbtnEmesis);
		rdbtnEmesis.setForeground(Color.BLACK);
		rdbtnEmesis.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnEmesis.setBackground(new Color(199, 21, 133));
		rdbtnEmesis.setBounds(108, 538, 327, 33);
		contentPane.add(rdbtnEmesis);
		
		JRadioButton rdbtnPneumonia = new JRadioButton("  Radiowaves");
		buttonGroup_2.add(rdbtnPneumonia);
		buttonGroup_2.add(rdbtnPneumonia);
		rdbtnPneumonia.setForeground(Color.BLACK);
		rdbtnPneumonia.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnPneumonia.setBackground(new Color(199, 21, 133));
		rdbtnPneumonia.setBounds(880, 481, 175, 33);
		contentPane.add(rdbtnPneumonia);
		
		JRadioButton rdbtnSwineFlu = new JRadioButton("   Microwaves");
		rdbtnSwineFlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score++;
			}
		});
		buttonGroup_2.add(rdbtnSwineFlu);
		buttonGroup_2.add(rdbtnSwineFlu);
		rdbtnSwineFlu.setForeground(Color.BLACK);
		rdbtnSwineFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSwineFlu.setBackground(new Color(199, 21, 133));
		rdbtnSwineFlu.setBounds(880, 538, 175, 33);
		contentPane.add(rdbtnSwineFlu);
		
		JButton btnNewButton = new JButton("<- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showConfirmDialog(null, "Are you sure you want to end up the quiz");
				Engineering e1=new Engineering();
				e1.setVisible(false);
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
				Engeneering1 e1=new Engeneering1(score);
				e1.setVisible(true);
			}
		});
		btnNext.setForeground(Color.RED);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNext.setBackground(Color.ORANGE);
		btnNext.setBounds(889, 639, 166, 48);
		contentPane.add(btnNext);
	}

}
