package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JButton;

public class Score extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	int finalscore;
	public Score(int s)
	{
		this();
		finalscore=s;
	}
	
	public Score() {
		setTitle("Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1313, 754);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(255, 222, 173));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(54, 160, 1186, 92);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Your Score");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.ORANGE);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(488, 24, 249, 53);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String a=Integer.toString(finalscore);
				btnNewButton.setText(a);
				if(finalscore<2)
				{
					lblNewLabel.setText("OOPS!! Your must try once more");
				}
				else
				{
					lblNewLabel.setText("Congratulations!! You did it this is your right path rest is your wish");
				}
				JOptionPane.showConfirmDialog(null, "Want to try some other field? ");
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setBounds(379, 394, 563, 82);
		contentPane.add(btnNewButton);
	}
}
