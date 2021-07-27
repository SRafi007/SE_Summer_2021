import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class yourshop extends JFrame {

	private JPanel contentPane;
	
	String n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yourshop frame = new yourshop("","","","");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @wbp.parser.constructor
	 */
	public yourshop(String s,String s2,String s3,String s4) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 1917, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO YOUR SHOP");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel.setBounds(687, 11, 570, 45);
		panel.add(lblNewLabel);
		
		JComboBox pf = new JComboBox();
		pf.setForeground(new Color(255, 127, 80));
		pf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		pf.setBounds(1589, 38, 328, 29);
		panel.add(pf);
		pf.addItem("Profile");
		pf.addItem(s);
		pf.addItem(s2);
		pf.addItem(s3);
		pf.addItem(s4);
		
		JLabel lblNewLabel_1 = new JLabel("ADD ITEM");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(882, 95, 369, 49);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("H.HanD");
		btnNewButton.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\img.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HOME o=new HOME(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 84));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(0, 68, 505, 145);
		contentPane.add(btnNewButton);
		
		JButton fb01 = new JButton("New button");
		fb01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sellfood o=new sellfood(s,s2,s3,s4);
				o.setVisible(true);
			
			}
		});
		fb01.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\Annotation 2020-03-24 165118.png"));
		fb01.setBounds(112, 332, 403, 412);
		contentPane.add(fb01);
		
		JLabel lblNewLabel_2 = new JLabel("FOOD");
		lblNewLabel_2.setForeground(new Color(112, 128, 144));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2.setBounds(238, 277, 286, 44);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sellride o=new sellride(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\Annotation 2020-03-24 165338 (2).png"));
		btnNewButton_2.setBounds(768, 332, 392, 412);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("RIDER");
		lblNewLabel_3.setForeground(new Color(143, 188, 143));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_3.setBounds(871, 277, 182, 39);
		contentPane.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setBounds(1317, 68, 185, 33);
		contentPane.add(lblNewLabel_4);
	
	}
	
	public yourshop(String s)
	{
	n=s;	
	}
}
