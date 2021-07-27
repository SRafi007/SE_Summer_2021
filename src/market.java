import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class market extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					market frame = new market("","","","");
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
	public market(String s,String s2,String s3,String s4) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 1917, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HOME o=new HOME(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(143, 188, 143));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 58));
		btnNewButton_1.setBounds(0, 0, 261, 77);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO MARKET PLACE ");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 39));
		lblNewLabel.setBounds(682, 11, 598, 55);
		panel.add(lblNewLabel);
		
		JComboBox pf = new JComboBox();
		pf.setForeground(new Color(255, 127, 80));
		pf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		pf.setBounds(1588, 42, 329, 35);
		pf.addItem("profile");
		panel.add(pf);
		pf.addItem(s);
		pf.addItem(s2);
		pf.addItem(s3);
		pf.addItem(s4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("F:\\.data\\PROJECT\\src\\Annotation 2020-03-24 165118.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buyfood o=new buyfood(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton.setBounds(203, 252, 406, 425);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("F:\\.data\\PROJECT\\src\\Annotation 2020-03-24 165338 (2).png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buyride o=new buyride(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(866, 252, 390, 418);
		contentPane.add(btnNewButton_2);
	}
}
