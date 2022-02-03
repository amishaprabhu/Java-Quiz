package quiz;

import java.awt.BorderLayout;
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
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

public class Commerce1 extends JFrame {

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
					Commerce1 frame = new Commerce1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	int score1;
	public Commerce1(int s)
	 {
		 this();
		 score1=s;
	 }
	public Commerce1() {
		setTitle("Commerce1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1324, 764);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTextArea txtrHighBlood = new JTextArea();
		txtrHighBlood.setForeground(new Color(0, 0, 0));
		txtrHighBlood.setText("                 4. Intangible assets usually fall in the category of:\r\n");
		txtrHighBlood.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrHighBlood.setBackground(new Color(199, 21, 133));
		txtrHighBlood.setBounds(10, 24, 1278, 75);
		contentPane.add(txtrHighBlood);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  Current assets");
		buttonGroup_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(199, 21, 133));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(174, 134, 232, 33);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHeartAttack = new JRadioButton("  Semi fixed assets");
		buttonGroup_1.add(rdbtnHeartAttack);
		rdbtnHeartAttack.setForeground(Color.BLACK);
		rdbtnHeartAttack.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHeartAttack.setBackground(new Color(199, 21, 133));
		rdbtnHeartAttack.setBounds(174, 200, 232, 33);
		contentPane.add(rdbtnHeartAttack);
		
		JRadioButton rdbtnHypertension = new JRadioButton("  Fixed assets");
		rdbtnHypertension.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1++;
			}
		});
		buttonGroup_1.add(rdbtnHypertension);
		rdbtnHypertension.setForeground(Color.BLACK);
		rdbtnHypertension.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnHypertension.setBackground(new Color(199, 21, 133));
		rdbtnHypertension.setBounds(840, 134, 226, 33);
		contentPane.add(rdbtnHypertension);
		
		JRadioButton rdbtnRabies = new JRadioButton(" None of the above");
		buttonGroup_1.add(rdbtnRabies);
		rdbtnRabies.setForeground(Color.BLACK);
		rdbtnRabies.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnRabies.setBackground(new Color(199, 21, 133));
		rdbtnRabies.setBounds(840, 200, 226, 33);
		contentPane.add(rdbtnRabies);
		
		JTextArea txtrwhatIsAnother = new JTextArea();
		txtrwhatIsAnother.setText("                                      5. The balance-sheet is only:");
		txtrwhatIsAnother.setForeground(Color.BLACK);
		txtrwhatIsAnother.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtrwhatIsAnother.setBackground(new Color(199, 21, 133));
		txtrwhatIsAnother.setBounds(10, 295, 1278, 42);
		contentPane.add(txtrwhatIsAnother);
		
		JRadioButton rdbtnChickenPox = new JRadioButton("  An account");
		buttonGroup.add(rdbtnChickenPox);
		rdbtnChickenPox.setForeground(Color.BLACK);
		rdbtnChickenPox.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChickenPox.setBackground(new Color(199, 21, 133));
		rdbtnChickenPox.setBounds(174, 401, 208, 33);
		contentPane.add(rdbtnChickenPox);
		
		JRadioButton rdbtnDengue = new JRadioButton(" A statement");
		rdbtnDengue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1++;
			}
		});
		buttonGroup.add(rdbtnDengue);
		rdbtnDengue.setForeground(Color.BLACK);
		rdbtnDengue.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnDengue.setBackground(new Color(199, 21, 133));
		rdbtnDengue.setBounds(174, 470, 208, 33);
		contentPane.add(rdbtnDengue);
		
		JRadioButton rdbtnMalaria = new JRadioButton("  A summary");
		buttonGroup.add(rdbtnMalaria);
		rdbtnMalaria.setForeground(Color.BLACK);
		rdbtnMalaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMalaria.setBackground(new Color(199, 21, 133));
		rdbtnMalaria.setBounds(870, 401, 261, 33);
		contentPane.add(rdbtnMalaria);
		
		JRadioButton rdbtnFlu = new JRadioButton(" None of the above");
		buttonGroup.add(rdbtnFlu);
		rdbtnFlu.setForeground(Color.BLACK);
		rdbtnFlu.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFlu.setBackground(new Color(199, 21, 133));
		rdbtnFlu.setBounds(870, 470, 261, 33);
		contentPane.add(rdbtnFlu);
		
		
		
		JButton btnNewButton = new JButton("<- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Commerce1 c1=new Commerce1();
				c1.setVisible(false);
				Commerce c=new Commerce();
				c.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(130, 608, 175, 48);
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
		btnNext.setBounds(900, 608, 187, 48);
		contentPane.add(btnNext);
	}

}
