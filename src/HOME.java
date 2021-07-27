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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class HOME extends JFrame {

	private JPanel contentPane;
	private JTextField txtThankYou;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOME frame = new HOME( "","","","");
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
	public HOME(String s,String s2,String s3,String s4) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(10, 11, 1897, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 48));
		lblNewLabel.setBounds(682, 11, 372, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("H.HanD");
		lblNewLabel_6.setForeground(new Color(255, 228, 225));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 54));
		lblNewLabel_6.setBounds(10, 0, 259, 76);
		panel.add(lblNewLabel_6);
		
		JComboBox pf = new JComboBox();
		pf.setForeground(new Color(255, 127, 80));
		pf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		pf.setBounds(1530, 43, 367, 33);
		panel.add(pf);
		pf.addItem("Profile");
		pf.addItem(s);
		pf.addItem(s2);
		pf.addItem(s3);
		pf.addItem(s4);
		
		JLabel lblNewLabel_1 = new JLabel("WHAT   YOU  WANT  TO   DO  HERE");
		lblNewLabel_1.setForeground(new Color(50, 205, 50));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1.setBounds(543, 98, 843, 29);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(523, 91, 591, 51);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(1033, 210, 463, 608);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("BUY");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setBackground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel_2.setBounds(143, 0, 335, 75);
		panel_2.add(lblNewLabel_2);
		
		JButton m1 = new JButton("New button");
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
             market ob1=new market(s,s2,s3,s4);
             ob1.setVisible(true);
			}
		});
		m1.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\Annotation 2020-03-24 123828.png"));
		m1.setBounds(0, 76, 464, 532);
		panel_2.add(m1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(811, 210, 2, 3);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(248, 210, 476, 608);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("SELL");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_3.setBounds(183, 11, 265, 60);
		panel_4.add(lblNewLabel_3);
		
		JButton s1 = new JButton("New button");
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				yourshop o=new yourshop(s,s2,s3,s4);
				o.setVisible(true);
		
			}
		});
		s1.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\Annotation 2020-03-24 121530.png"));
		s1.setBounds(445, 286, 479, 526);
		panel_4.add(s1);
		
		JLabel lblNewLabel_4 = new JLabel("SELL");
		lblNewLabel_4.setForeground(new Color(95, 158, 160));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 46));
		lblNewLabel_4.setBounds(572, 230, 173, 45);
		panel_4.add(lblNewLabel_4);
		
	
		
		
	}
	
	
}
